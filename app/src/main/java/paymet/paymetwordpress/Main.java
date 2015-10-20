package paymet.paymetwordpress;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.List;

import api.WpAPI;
import custom_classes.Post_ListViewAdapter;
import model.WpPostMODEL;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


/*
    PATRICIA ALONSO GALLEGO
    -----------------------
    App para 'Paymet' que hace uso de la API de wordpress para conectar a mi Blog y que consume dicha API mediante el uso
    de la API RETROFIT. Ademas hace uso de la API de GLIDE para la gestion de imagenes y cache de estas.

    MainActivity: Muestra la lista de Posts con la FeaturedImage y el Title.
    ExtendedPost: Muestra la version extendida del post mostrando la FeaturedImage, a un tamaño mayor, y el content.
 */


public class Main extends AppCompatActivity {

    // Usare este Boolean como flag
    Boolean PostsLoaded;

    ListView mListview;
    SwipeRefreshLayout mSwipeRefreshLayout;

    Post_ListViewAdapter adapter;
    List<WpPostMODEL> AllPost;

    // Address de mi blog Wordpress con el plugin WP-API instalado y ya devolviendo el JSON
    // P.D: Lo suyo seria meterlo en una clase CONSTANTS si la app fuera mas grande y compleja
    String API = "http://testingpaymet.comlu.com/wp-json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        mListview = (ListView) findViewById(R.id.listview);



        // Setups
        setupToolbar();

        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new RemoteLoadPostsTask().execute();
            }
        });

        mSwipeRefreshLayout.post(new Runnable() {
                                     @Override
                                     public void run() {
                                         // Muestro en la UI el circular progress bar
                                         mSwipeRefreshLayout.setRefreshing(true);
                                         new RemoteLoadPostsTask().execute();
                                     }
                                 }
        );
    }


    // AyncTask que lee los post del blog e interactua con la UI
    private class RemoteLoadPostsTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Inicializo mi flag
            PostsLoaded = false;
        }

        @Override
        protected Void doInBackground(Void... params) {
            // Creo el adapter para retrofit usando la URL Base
            RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API).build();
            // Creo un service para el adapter usando la clase con el WpAPI
            WpAPI wp = restAdapter.create(WpAPI.class);
            // Y esperamos la respuesta de retrofit para hacer la conversacion JSON-POJO
            wp.getPosts(new Callback<List<WpPostMODEL>>() {
                // En caso de exito actualizo mi flag y me hago con la lista de posts
                @Override
                public void success(List<WpPostMODEL> wpPostsModels, Response response) {
                    AllPost = wpPostsModels;
                    PostsLoaded = true;
                }
                // En caso de fallo no voy a hacer nada mas que actualizar la flag
                // P.D: OJO que deberia de avisarlo con un mensaje por pantalla
                @Override
                public void failure(RetrofitError error) {
                    PostsLoaded = true;
                }
            });

            // Mientras no haya leido todos los posts voy a dormir este thread 0,1 segundos y voy a
            // seguir esperando
            while (!PostsLoaded) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Paso la lista de posts obtenidos a mi custom adapter
            adapter = new Post_ListViewAdapter (Main.this, AllPost);
            // Y bindeo el adapter al listview
            mListview.setAdapter(adapter);
            // Hago desaparecer en la UI el circular progress bar
            mSwipeRefreshLayout.setRefreshing(false);
            // Y reseteo mi flag
            PostsLoaded = false;
        }
    }

    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}