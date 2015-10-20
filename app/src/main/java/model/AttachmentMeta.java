package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttachmentMeta {

    @SerializedName("sizes")
    @Expose
    private Sizes sizes;

    @SerializedName("height")
    @Expose
    private String height;

    @SerializedName("file")
    @Expose
    private String file;

    @SerializedName("width")
    @Expose
    private String width;

    @SerializedName("image_meta")
    @Expose
    private Image_meta image_meta;


    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Image_meta getImage_meta() {
        return image_meta;
    }

    public void setImage_meta(Image_meta image_meta) {
        this.image_meta = image_meta;
    }
}