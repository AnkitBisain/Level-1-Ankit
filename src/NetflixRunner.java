
public class NetflixRunner {
	public static void main(String[] args) {
		Movie mov5 = new Movie("My Little Pony: An Adventure in Equestria",5);
		Movie mov4 = new Movie("Dora the Explorer",4);
		Movie mov3 = new Movie("Twilight",3);
		Movie mov2 = new Movie("To be fair, one has to have a high IQ to understand",2);
		Movie mov1 = new Movie("Rick and Morty",1);
		System.out.println(mov5.getTicketPrice());
		System.out.println(mov4.getTicketPrice());
		System.out.println(mov3.getTicketPrice());
		System.out.println(mov2.getTicketPrice());
		System.out.println(mov1.getTicketPrice());
		NetflixQueue mymovies = new NetflixQueue();
		mymovies.addMovie(mov5);
		mymovies.addMovie(mov4);
		mymovies.addMovie(mov3);
		mymovies.addMovie(mov2);
		mymovies.addMovie(mov1);
		mymovies.printMovies();
		System.out.println("The best movie is " + mymovies.getBestMovie());
		System.out.println("The second best movie is " + mymovies.getMovie(1));
	}
}
