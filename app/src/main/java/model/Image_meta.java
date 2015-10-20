package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image_meta {

    @SerializedName("orientation")
    @Expose
    private String orientation;

    @SerializedName("focal_length")
    @Expose
    private String focal_length;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("shutter_speed")
    @Expose
    private String shutter_speed;

    @SerializedName("iso")
    @Expose
    private String iso;

    @SerializedName("camera")
    @Expose
    private String camera;

    @SerializedName("created_timestamp")
    @Expose
    private String created_timestamp;

    @SerializedName("caption")
    @Expose
    private String caption;

    @SerializedName("copyright")
    @Expose
    private String copyright;

    @SerializedName("credit")
    @Expose
    private String credit;

    @SerializedName("aperture")
    @Expose
    private String aperture;

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getFocal_length() {
        return focal_length;
    }

    public void setFocal_length(String focal_length) {
        this.focal_length = focal_length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShutter_speed() {
        return shutter_speed;
    }

    public void setShutter_speed(String shutter_speed) {
        this.shutter_speed = shutter_speed;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(String created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }
}