package com.javalec.vo;

import java.util.Date;

public class DiscussionBoardVO {
	 
//	private int rn;
//	private int discBoardId;
//	private String email;
//	private Date writeDate;
//	private String title;
//	private String content;
//	private int readCount;
//	private int matchId;
//	private MatchVO matchVO;//db에선 id로
//	private int up;
//	private int down;
//	private int expired; 
	
	private int rn;
	private int discBoardId;
	private String email;
	private Date writeDate;
	private String content;
	private int readCount;
	private MatchVO matchVO;// db에서 matchId
	private int up;
	private int down;
	private Date expired;
	
	
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public MatchVO getMatchVO() {
		return matchVO;
	}
	public void setMatchVO(MatchVO matchVO) {
		this.matchVO = matchVO;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public int getDown() {
		return down;
	}
	public void setDown(int down) {
		this.down = down;
	}
	public Date getExpired() {
		return expired;
	}
	public void setExpired(Date expired) {
		this.expired = expired;
	}
	@Override
	public String toString() {
		return "DiscussionBoardVO [rn=" + rn + ", discBoardId=" + discBoardId + ", email=" + email + ", writeDate="
				+ writeDate + ", content=" + content + ", readCount=" + readCount + ", matchVO=" + matchVO + ", up="
				+ up + ", down=" + down + ", expired=" + expired + "]";
	} 
	
	
	
	
	
	
	

	
}
