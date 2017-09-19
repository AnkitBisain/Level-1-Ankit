// Copyright Wintriss Technical Schools 2013
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

public class Jeopardy implements ActionListener {

	int score = 0;
	JLabel scoreBox = new JLabel("0");

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setLayout(new BorderLayout());
		panel.setLayout(new GridLayout(2, 2));
		JButton q1 = new JButton("100");
		q1.addActionListener(this);
		panel.add(q1);
		JButton q2 = new JButton("200");
		panel.add(q2);
		q2.addActionListener(this);
		JButton q3 = new JButton("300");
		panel.add(q3);
		q3.addActionListener(this);
		frame.add(panel);
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setVisible(true);
		frame.pack();
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String answer = JOptionPane.showInputDialog("5365656562355656562536526523653653 ?");
		if (answer.equals("yes"))
			score++;
		((JButton)arg0.getSource()).setText("");
		update();
		
	}
	public void actionPerformed1(ActionEvent arg1) {
		String answer = JOptionPane.showInputDialog("5365656562355656562536526523653653 ?");
		if (answer.equals("yes"))
			score+=2;
		((JButton)arg1.getSource()).setText("");
		update();
		
	}
	public void actionPerformed2(ActionEvent arg2) {
		String answer = JOptionPane.showInputDialog("5365656562355656562536526523653653 ?");
		if (answer.equals("yes"))
			score+=3;
		((JButton)arg2.getSource()).setText("");
		update();
		
	}

	private void update() {
		scoreBox.setText(""+score);
		
	}

}
