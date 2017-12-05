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

public class calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton plus = new JButton();
	JButton minus = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	JTextField answer = new JTextField();

	public static void main(String[] args) {
		calculator calc = new calculator();
		calc.run();
	}

	public void run() {
		panel.add(input1);
		input1.setText("Input 1");
		panel.add(plus);
		plus.setText("+");
		plus.addActionListener(this);
		panel.add(minus);
		minus.setText("-");
		minus.addActionListener(this);
		panel.add(multiply);
		multiply.setText("x");
		multiply.addActionListener(this);
		panel.add(divide);
		divide.setText("÷");
		divide.addActionListener(this);
		panel.add(input2);
		input2.setText("Input 2");
		panel.add(answer);
		answer.setText("answer");
		frame.add(panel);
		frame.pack();
		frame.setSize(2000, 1000);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == plus) {
			String I1 = input1.getText();
			double P1 = Double.parseDouble(I1);
			String I2 = input2.getText();
			double P2 = Double.parseDouble(I2);
			answer.setText(String.valueOf(P1+P2));
		}
		if (e.getSource() == minus) {
			String I1 = input1.getText();
			double P1 = Double.parseDouble(I1);
			String I2 = input2.getText();
			double P2 = Double.parseDouble(I2);
			answer.setText(String.valueOf(P1-P2));
		}
		if (e.getSource() == multiply) {
			String I1 = input1.getText();
			double P1 = Double.parseDouble(I1);
			String I2 = input2.getText();
			double P2 = Double.parseDouble(I2);
			answer.setText(String.valueOf(P1*P2));
		}
		if (e.getSource() == divide) {
			String I1 = input1.getText();
			double P1 = Double.parseDouble(I1);
			String I2 = input2.getText();
			double P2 = Double.parseDouble(I2);
			answer.setText(String.valueOf(P1/P2));
		}

	}
}
