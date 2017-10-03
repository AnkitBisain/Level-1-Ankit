import javax.swing.JOptionPane;

public class methodpractice {
	static int square(String i) {
		int j = Integer.parseInt(i);
		int x = j * j;
		return x;
	}

	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("Wat doth thou want to square?");
		int sq = square(in);
		JOptionPane.showMessageDialog(null, "Thy numero is " + sq);
	}
}
