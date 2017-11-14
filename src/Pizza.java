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

	public boolean isHealthy() {
		boolean health;
		if (this.size == "small") {
			if (this.calories <= 500) {
				health = true;
			} else {
				health = false;
			}
		} else if (this.size == "medium") {
			if (this.calories <= 1000) {
				health = true;
			} else {
				health = false;
			}
		} else if (this.size == "large") {
			if (this.calories <= 1500) {
				health = true;
			} else {
				health = false;
			}
		} else if (this.size == "extra large") {
			if (this.calories <= 2000) {
				health = true;
			} else {
				health = false;
			}
		} else {
			return false;
		}
		return health;
	}

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("small", 500, 7, 4.99);
		Pizza pizza2 = new Pizza("small", 550, 4, 5.99);
		Pizza pizza3 = new Pizza("medium", 800, 9, 6.99);
		Pizza pizza4 = new Pizza("medium", 1100, 8, 7.99);
		Pizza pizza5 = new Pizza("large", 1300, 8, 8.99);
		Pizza pizza6 = new Pizza("large", 1800, 6, 9.99);
		Pizza pizza7 = new Pizza("extra large", 1900, 7, 10.99);
		Pizza pizza8 = new Pizza("extra large", 2500, 5, 11.99);
		Pizza notapizza = new Pizza("taco", 0, 9001, 0);
		System.out.println("pizza1 is healthy: " + pizza1.isHealthy());
		System.out.println("pizza2 is healthy: " + pizza2.isHealthy());
		System.out.println("pizza3 is healthy: " + pizza3.isHealthy());
		System.out.println("pizza4 is healthy: " + pizza4.isHealthy());
		System.out.println("pizza5 is healthy: " + pizza5.isHealthy());
		System.out.println("pizza6 is healthy: " + pizza6.isHealthy());
		System.out.println("pizza7 is healthy: " + pizza7.isHealthy());
		System.out.println("pizza8 is healthy: " + pizza8.isHealthy());
		System.out.println("notapizza is healthy: " + notapizza.isHealthy());
	}
}