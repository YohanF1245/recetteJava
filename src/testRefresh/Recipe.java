package testRefresh;

import java.sql.Date;
import java.util.ArrayList;

public class Recipe {
	
private String recipeId;
private String title;
private String authorComment;
private int difficulty;
private int price;
private Date creationDate;
private Date updateDate;
private String tagId;
private String userId;
private ArrayList<Comments> commentsList = new ArrayList<Comments>();

public Recipe(String recipeId, String title, String authorComment, int difficulty, int price, Date creationDate, Date updateDate, String tagId, String userId ) {
	this.recipeId = recipeId;
	this.title = title;
	this.authorComment = authorComment;
	this.difficulty =  difficulty;
	this.price = price;
	this.creationDate = creationDate;
	this.updateDate = updateDate;
	this.tagId = tagId;
	this.userId = userId;
}

public String getRecipeId() {
	return recipeId;
}
@Override
public String toString() {
	return "Recipe [recipeId=" + recipeId + ", title=" + title + ", authorComment=" + authorComment + ", difficulty="
			+ difficulty + ", price=" + price + ", creationDate=" + creationDate + ", updateDate=" + updateDate
			+ ", tagId=" + tagId + ", userId=" + userId + ", commentsList=" + commentsList + "]";
}

public void setRecipeId(String recipeId) {
	this.recipeId = recipeId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthorComment() {
	return authorComment;
}
public void setAuthorComment(String authorComment) {
	this.authorComment = authorComment;
}
public int getDifficulty() {
	return difficulty;
}
public void setDifficulty(int difficulty) {
	this.difficulty = difficulty;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public Date getUpdateDate() {
	return updateDate;
}
public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
}
public String getTagId() {
	return tagId;
}
public void setTagId(String tagId) {
	this.tagId = tagId;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}

}
