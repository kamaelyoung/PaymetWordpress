package paymet.paymetwordpress;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class ExtendedPost extends AppCompatActivity {

    String title, content, thumbnail_img_url;
    TextView title_tv, content_tv;
    ImageView thumbnail_img_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extended_post_layout);

        // Recojo los datos del listview item pasados a traves del intent a esta activity
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        content = intent.getStringExtra("content");
        thumbnail_img_url = intent.getStringExtra("thumbnail");

        title_tv = (TextView) findViewById (R.id.title);
        content_tv = (TextView) findViewById(R.id.content);
        thumbnail_img_iv = (ImageView) findViewById(R.id.thumbnail);

        // Seteo el titulo y el texto (este ultimo venia en formato HTML)
        title_tv.setText(title);
        content_tv.setText(Html.fromHtml(content));

        // En caso de no disponer el post de una featured image la url sera una cadena vacia y
        // no seteare ninguna imagen con Glide
        if (!thumbnail_img_url.equals("")) {
            // Seteo la imagen del post
            Glide.with(this)
                    .load(thumbnail_img_url)
                    .asBitmap()
                    .into(new SimpleTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                            thumbnail_img_iv.setImageBitmap(resource);
                        }
                    });
        } else {
            // Si no tenia featured img directamente quitare la view para aprovechar el espacio
            thumbnail_img_iv.setVisibility(View.GONE);
        }

        // Setups
        setupToolbar();
    }


    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Arrow menu icon (en el manifest especifiqué su parent para poder volver atras)
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(title);
            ab.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
            ab.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}