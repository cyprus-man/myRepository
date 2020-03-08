package com.javalec.vo;

import java.util.Date;

public class DiscussionReply {
	
	private int discBoardId;    //==parentId
	private String email;
	private Date writeDate;
	private String title;
	private String content;		
	private int replyId;
	
	
	public int getDiscBoardId() {
		return discBoardId;
	}
	public void setDiscBoardId(int discBoardId) {
		this.discBoardId = discBoardId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	
	
	
}
