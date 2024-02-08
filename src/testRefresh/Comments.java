package testRefresh;

import java.sql.Date;

public class Comments {
	private String commentId;
	private int grade;
	private Date commentDate;
	private String commentText;
	private String userId;
	public Comments(String commentId, int grade, Date commentDate, String commentText, String userId) {
		super();
		this.commentId = commentId;
		this.grade = grade;
		this.commentDate = commentDate;
		this.commentText = commentText;
		this.userId = userId;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
