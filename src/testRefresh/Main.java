package testRefresh;

import java.awt.font.FontRenderContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
		String sqlSelectAllPersons = "SELECT * FROM recipes";
		String connectionUrl = "jdbc:mysql://localhost:3306/recipe_site?serverTimezone=UTC";

		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", ""); 
		        PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons); 
		        ResultSet rs = ps.executeQuery()) {
					System.out.println("printed?"+rs);
		        while (rs.next()) {
		        	String recipeId = rs.getString("recipe_id");
		        	String recipeName = rs.getString("title");
		        	String authorComment = rs.getString("author_comment");
		        	int difficulty = rs.getInt("difficulty");
		        	int price = rs.getInt("price");
		        	Date creationDate = rs.getDate("creation_date");
		        	Date updateDate = rs.getDate("update_date");
		        	String tagId = rs.getString("tag_id");
		        	String userId = rs.getString("user_id");
		        	Recipe recipe = new Recipe(recipeId, recipeName, authorComment,difficulty , price, creationDate, updateDate, tagId, userId);
		        	
					recipeList.add(recipe);
		        }
		} catch (SQLException e) {
		   System.out.println(e);
		}
		for (Recipe recipe : recipeList) {
			System.out.println(recipe.toString());
		}
	}

}
