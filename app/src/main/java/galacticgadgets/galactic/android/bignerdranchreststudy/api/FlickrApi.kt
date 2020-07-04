package galacticgadgets.galactic.android.bignerdranchreststudy.api


import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi{

    @GET("services/rest/?method=flickr.interestingness.getList" +
                "&api_key=7c162a49d0937036c5428d0033fa978f" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s")
    fun fetchPhotos(): Call<String>
}