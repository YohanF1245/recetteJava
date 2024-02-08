package testRefresh;

public class Ingredients {
	private String ingredientName;
	private int quantity;
	private String measure;
	public Ingredients(String ingredientName, int quantity, String measure) {
		super();
		this.ingredientName = ingredientName;
		this.quantity = quantity;
		this.measure = measure;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
}
