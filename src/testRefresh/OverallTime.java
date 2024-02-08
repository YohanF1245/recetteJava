package testRefresh;

public class OverallTime {
	private int preparationTime;
	private int restTime;
	private int cookTime;
	public OverallTime(int preparationTime, int restTime, int cookTime) {
		super();
		this.preparationTime = preparationTime;
		this.restTime = restTime;
		this.cookTime = cookTime;
	}
	public int getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}
	public int getRestTime() {
		return restTime;
	}
	public void setRestTime(int restTime) {
		this.restTime = restTime;
	}
	public int getCookTime() {
		return cookTime;
	}
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
}
