package com.sl.blog.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Blog  implements Serializable {

    private  static final long serialVersionUID=1L;

    private Long id; // 用户的唯一标识

    private String title;

    private String summary;


    private String content;

    private String htmlContent; // 将 md 转为 html

    private Timestamp createTime;

    private Integer readSize = 0; // 访问量、阅读量

    private Integer commentSize = 0;  // 评论量

    private Integer likeSize = 0;  // 点赞量

    private String tags;  // 标签

    protected Blog() {
        // TODO Auto-generated constructor stub
    }
    public Blog(String title, String summary,String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //this.htmlContent = Processor.process(content);
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getReadSize() {
        return readSize;
    }

    public void setReadSize(Integer readSize) {
        this.readSize = readSize;
    }

    public Integer getCommentSize() {
        return commentSize;
    }

    public void setCommentSize(Integer commentSize) {
        this.commentSize = commentSize;
    }

    public Integer getLikeSize() {
        return likeSize;
    }

    public void setLikeSize(Integer likeSize) {
        this.likeSize = likeSize;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

}
