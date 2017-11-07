import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
	private void SetUp() {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JButton plus = new JButton();
		plus.setText("+");
		JButton minus = new JButton();
		minus.setText("-");
		JButton mult = new JButton();
		mult.setText("x");
		JButton div = new JButton();
		div.setText("/");
		panel.add(div);
		panel.add(mult);
		panel.add(minus);
		panel.add(plus);
		panel.add(text1);
		panel.add(text2);
	}
}
