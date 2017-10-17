/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature sponge = new SeaCreature("Spongebob");
		SeaCreature pat = new SeaCreature("Patrick");
		SeaCreature squid = new SeaCreature("Squidward");
		sponge.eat();
		sponge.laugh();
		System.out.println(pat.getName());
		pat.eat();
		pat.laugh();
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
	}
}
