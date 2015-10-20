package custom_classes;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

import glide.CropSquareTransformation;
import model.AttachmentMeta;
import model.FeaturedImage;
import model.Sizes;
import model.Thumbnail;
import model.WpPostMODEL;
import paymet.paymetwordpress.ExtendedPost;
import paymet.paymetwordpress.R;


public class Post_ListViewAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    List<WpPostMODEL> allPost;
    AttachmentMeta attachmentMeta;
    Sizes sizes;
    Thumbnail thumbnail;
    String thumbnailImgUrl;

    public Post_ListViewAdapter(Context context, List<WpPostMODEL> allPost) {
        this.context = context;
        this.allPost = allPost;
        inflater = LayoutInflater.from(context);
    }

    public class ViewHolder {
        TextView title;
        ImageView featuredImg;
    }

    @Override
    public int getCount() {
        return allPost.size();
    }

    @Override
    public Object getItem(int position) {
        return allPost.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;

        // Set holder ------------------------------------------------------------------------------------------------
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_post_item, null);
            holder.title = (TextView) view.findViewById(R.id.title);
            holder.featuredImg = (ImageView) view.findViewById(R.id.featuredImg);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        // Seteo el titulo pasado a mayusculas en el textview title
        holder.title.setText(allPost.get(position).getTitle().toUpperCase());

        // Obtendo la Featured image y compruebo si es nula o no antes de asignarla al Imageview
        FeaturedImage FeaturedImg = allPost.get(position).getFeaturedImage();
        if (FeaturedImg!=null) {
            // Lo puse asi para que se viera mas claramente el camino que sigo a traves del JSON convertido a POJO
            attachmentMeta = FeaturedImg.getAttachment_meta();
            sizes = attachmentMeta.getSizes();
            thumbnail = sizes.getThumbnail();
            thumbnailImgUrl = thumbnail.getUrl();
            // Seteo la imagen del post
            Glide.with(context)
                    .load(thumbnailImgUrl)
                    .asBitmap()
                    .transform(new CropSquareTransformation(context))
                    .into(new SimpleTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                            holder.featuredImg.setImageBitmap(resource);
                        }
                    });
        } else {
            // Si no tiene Featured image quito el imageview para ganar espacio y asi centro el title quedando mejor
            // esteticamente
            holder.featuredImg.setVisibility(View.GONE);
        }


        // Asigno un listener a la view
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, ExtendedPost.class);
                intent.putExtra("title", allPost.get(position).getTitle());
                intent.putExtra("content", allPost.get(position).getContent());

                // En caso de tener una Featured image pasare la URL, y si no pasare una cadena vacia
                FeaturedImage FeaturedImg = allPost.get(position).getFeaturedImage();
                if (FeaturedImg!=null) {
                    intent.putExtra("thumbnail", allPost.get(position).getFeaturedImage().getAttachment_meta().getSizes().getThumbnail().getUrl());
                } else {
                    intent.putExtra("thumbnail", "");
                }

                context.startActivity(intent);
            }
        });

        return view;
    }
}