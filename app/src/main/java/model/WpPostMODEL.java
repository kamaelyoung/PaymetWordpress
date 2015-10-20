package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* POJO
   --------------
   P.D: He mapeado mas de lo que necesitaba para practicar (no necesito ni hago uso de la mayoria de las cosas
   mapeadas)
*/

public class WpPostMODEL {

    @SerializedName("ID")
    @Expose
    private Integer ID;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("content")
    @Expose
    private String content;

    @SerializedName("parent")
    @Expose
    private Object parent;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("modified")
    @Expose
    private String modified;

    @SerializedName("format")
    @Expose
    private String format;

    @SerializedName("slug")
    @Expose
    private String slug;

    @SerializedName("guid")
    @Expose
    private String guid;

    @SerializedName("excerpt")
    @Expose
    private String excerpt;

    @SerializedName("menu_order")
    @Expose
    private Integer menuOrder;

    @SerializedName("comment_status")
    @Expose
    private String commentStatus;

    @SerializedName("ping_status")
    @Expose
    private String pingStatus;

    @SerializedName("sticky")
    @Expose
    private Boolean sticky;

    @SerializedName("date_tz")
    @Expose
    private String dateTz;

    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;

    @SerializedName("modified_tz")
    @Expose
    private String modifiedTz;

    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;

    @SerializedName("featured_image")
    @Expose
    private FeaturedImage featuredImage;

    @SerializedName("attachment_meta")
    @Expose
    private AttachmentMeta attachmentMeta;

    @SerializedName("Sizes")
    @Expose
    private Sizes sizes;

    @SerializedName("Large")
    @Expose
    private Large large;

    @SerializedName("Thumbnail")
    @Expose
    private Thumbnail thumbnail;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getGuid() {
        return guid;
    }

     public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public String getDateTz() {
        return dateTz;
    }

    public void setDateTz(String dateTz) {
        this.dateTz = dateTz;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public String getModifiedTz() {
        return modifiedTz;
    }

    public void setModifiedTz(String modifiedTz) {
        this.modifiedTz = modifiedTz;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public FeaturedImage getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(FeaturedImage featuredImage) {
        this.featuredImage = featuredImage;
    }

    public AttachmentMeta getAttachmentMeta() {
        return attachmentMeta;
    }

    public void setAttachmentMeta(AttachmentMeta attachmentMeta) {
        this.attachmentMeta = attachmentMeta;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

}