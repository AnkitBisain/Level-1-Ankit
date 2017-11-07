public class Pizza {

	private String size;
	private int calories;
	private int tastiness;
	private double price;

	public Pizza(String size, int calories, int tastiness, double price) {
		this.size = size;
		this.calories = calories;
		this.tastiness = tastiness;
		this.price = price;
	}

	public String getSize() {
		return this.size;
	}

	public int getCalories() {
		return this.calories;
	}

	public int getTastiness() {
		return this.tastiness;
	}

	public double getPrice() {
		return this.price;
	}

	public void setTastiness(int newTastiness) {
		this.tastiness = newTastiness;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("medium", 500, 8, 7.99);
		Pizza pizza2 = new Pizza("large", 800, 8, 10.99);
		Pizza pizza3 = new Pizza("small", 300, 7, 4.99);
		Pizza pizza4 = new Pizza("medium", 600, 9, 6.99);
		Pizza pizza5 = new Pizza("small", 400, 4, 5.99);
		Pizza pizza6 = new Pizza("large", 900, 6, 9.99);
		System.out.println(pizza1.getTastiness());
		pizza1.setTastiness(10);
		System.out.println(pizza1.getTastiness());
		System.out.println(pizza2.getPrice());
		pizza2.setPrice(12.99);
		System.out.println(pizza2.getPrice());

	}
}