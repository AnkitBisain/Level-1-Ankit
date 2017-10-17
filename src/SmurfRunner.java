 /* 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy Smurf");
		Smurf papa = new Smurf("Papa Smurf");
		Smurf smurfette = new Smurf("Smurfette");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}
}
