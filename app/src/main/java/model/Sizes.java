package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes
{
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;

    @SerializedName("large")
    @Expose
    private Large large;

    public Thumbnail getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (Thumbnail thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public Large getLarge ()
    {
        return large;
    }

    public void setLarge (Large large)
    {
        this.large = large;
    }
}