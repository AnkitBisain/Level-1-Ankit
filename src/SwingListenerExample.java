import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingListenerExample implements ActionListener {
	// 3. Make GUI commands.
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");

	public static void main(String[] args) {
		// 2. Start run() method from main.
		SwingListenerExample object = new SwingListenerExample();
		object.run();
	}

	// 1. Make a run method (this will have most of the code making our GUI).
	public void run() {
		// 4. Add them together, set visible, and pack.
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Add action listeners.
		button1.addActionListener(this); // 6. Hover red underline, choose implement option.
		button2.addActionListener(this);
		// 7. Hover red underline, choose "add unimplemented methods".
	}

	// This method runs whenever an event is detected.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 8. Figure out which component triggered the event.
		JButton ButtonPressed = (JButton) e.getSource();
		if (ButtonPressed == button1) {
			System.out.println("Button 1 pressed!");
		}
		if (ButtonPressed == button2) {
			System.out.println("Button 2 pressed!");
		}
	}

}
