package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeaturedImage {

    @SerializedName("modified_tz")
    @Expose
    private String modified_tz;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("comment_status")
    @Expose
    private String comment_status;

    @SerializedName("terms")
    @Expose
    private String[] terms;

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("date_tz")
    @Expose
    private String date_tz;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("attachment_meta")
    @Expose
    private AttachmentMeta attachment_meta;

    @SerializedName("String")
    @Expose
    private String ID;

    @SerializedName("date_gmt")
    @Expose
    private String date_gmt;

    @SerializedName("ping_status")
    @Expose
    private String ping_status;

    @SerializedName("is_image")
    @Expose
    private String is_image;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("parent")
    @Expose
    private String parent;

    @SerializedName("format")
    @Expose
    private String format;

    @SerializedName("modified_gmt")
    @Expose
    private String modified_gmt;

    @SerializedName("modified")
    @Expose
    private String modified;

    @SerializedName("content")
    @Expose
    private String content;

    @SerializedName("guid")
    @Expose
    private String guid;

    @SerializedName("sticky")
    @Expose
    private String sticky;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("menu_order")
    @Expose
    private String menu_order;

    @SerializedName("slug")
    @Expose
    private String slug;

    public String getModified_tz() {
        return modified_tz;
    }

    public void setModified_tz(String modified_tz) {
        this.modified_tz = modified_tz;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String[] getTerms() {
        return terms;
    }

    public void setTerms(String[] terms) {
        this.terms = terms;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_tz() {
        return date_tz;
    }

    public void setDate_tz(String date_tz) {
        this.date_tz = date_tz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AttachmentMeta getAttachment_meta() {
        return attachment_meta;
    }

    public void setAttachment_meta(AttachmentMeta attachment_meta) {
        this.attachment_meta = attachment_meta;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public void setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
    }

    public String getPing_status() {
        return ping_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public String getIs_image() {
        return is_image;
    }

    public void setIs_image(String is_image) {
        this.is_image = is_image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public void setModified_gmt(String modified_gmt) {
        this.modified_gmt = modified_gmt;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSticky() {
        return sticky;
    }

    public void setSticky(String sticky) {
        this.sticky = sticky;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(String menu_order) {
        this.menu_order = menu_order;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}