package api;

import java.util.List;

import model.WpPostMODEL;
import retrofit.Callback;
import retrofit.http.GET;

public interface WpAPI {

    // @GET(“/posts”) -> Llamara a: http://testingpaymet.comlu.com/wp-json + /posts
    // Service calling url
    @GET("/posts")

    // La respuesta la almacenare en una lista de POJOs WpPostMODEL
    public void getPosts(Callback<List<WpPostMODEL>> response);


}


