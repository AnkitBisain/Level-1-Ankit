import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	Painting p;
	public void run() {
		p = new Painting();
		JFrame frame = new JFrame();
		frame.add(p);
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		Main panel = new Main();
		panel.run();
	}
}
