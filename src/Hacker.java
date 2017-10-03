import java.util.Random;

import javax.swing.JOptionPane;

public class Hacker {
	public static void main(String[] args) {
		Hacker user = new Hacker();
		String target = JOptionPane.showInputDialog("What device do you want to hack?");
		String goal = JOptionPane.showInputDialog("Which file do you want to get from it?");
		user.hackit(target, goal);
	}

	public void hackit(String target, String goal) {
		Random number = new Random();
		int code = number.nextInt(100000000);
		JOptionPane.showMessageDialog(null,"Hacking has started");
		JOptionPane.showMessageDialog(null,"Security bypassed");
		JOptionPane.showMessageDialog(null,"Gained full control of " + target);
		JOptionPane.showMessageDialog(null,"Searching files for " + goal);
		JOptionPane.showMessageDialog(null,(goal + " acquired. Has been transfered to your device at " + (code + 10000687) + ".pdf"));
	}
}