/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DatGeko
 */
public class Comment {
     private String title;
    private int commentId;
    private int accountId;
    private String content;
    private boolean isActive;

    public Comment() {
    }

    public Comment(String title, int commentId, int accountId, String content, boolean isActive) {
        this.title = title;
        this.commentId = commentId;
        this.accountId = accountId;
        this.content = content;
        this.isActive = isActive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Comment{" + "title=" + title + ", commentId=" + commentId + ", accountId=" + accountId + ", content=" + content + ", isActive=" + isActive + '}';
    }

    
}
