public class Movie implements Comparable<Movie> {

	private String title;
	private int stars;
	private int length;

	public Movie(String title, int stars, int length) {
		this.title = title;
		this.stars = stars;
		this.length = length;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public int getLength() {
		return this.length;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars" + "\" - " + length + " minutes";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 

	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}
