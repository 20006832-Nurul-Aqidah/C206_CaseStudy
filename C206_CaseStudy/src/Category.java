public class Category {
	private String categoryName;

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getName() {
		return categoryName;
	}

	public void setName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String toString() {
		String output = String.format("%s", categoryName);
		return output;
	}
}