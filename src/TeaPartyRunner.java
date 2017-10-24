
public class TeaPartyRunner {
	public static void main(String[] args) {
		TeaParty england = new TeaParty();
		System.out.println(england.welcome("Aditiya", true, false));
		System.out.println(england.welcome("Nick Crompton", false, true));
		System.out.println(england.welcome("Juan", false, false));
		System.out.println(england.welcome("Tax Evador", true, true));
	}
}
