import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATM implements ActionListener {
	JFrame frame = new JFrame("ATM");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JTextArea ATM = new JTextArea("ATM: User 1");
	JButton depB = new JButton("Deposit");
	JTextField depT = new JTextField("amount to deposit");
	JButton witB = new JButton("Withdraw");
	JTextField witT = new JTextField("amount to withdraw");
	JTextArea money = new JTextArea("Available: $100.00");
	JButton U1 = new JButton("Switch to User 1");
	JButton U2 = new JButton("Switch to User 2");
	double dollas1 = 100;
	double dollas2 = 100;
	int user = 1;

	public static void main(String[] args) {
		ATM myatm = new ATM();
		myatm.run();
	}

	public void run() {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.add(panel);
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		panel.add(panel5);
		panel1.add(ATM);
		panel2.add(depB);
		panel2.add(depT);
		panel3.add(witB);
		panel3.add(witT);
		panel4.add(money);
		panel5.add(U1);
		panel5.add(U2);
		frame.pack();
		frame.setVisible(true);
		depB.addActionListener(this);
		witB.addActionListener(this);
		U1.addActionListener(this);
		U2.addActionListener(this);
		ATM.setEditable(false);
		money.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == depB) {
			double m = Double.parseDouble(depT.getText());
			if (user == 1) {
				if (m >= 0) {
					dollas1 += m;
					money.setText("Available: $" + dollas1);
				} else {
					JOptionPane.showMessageDialog(null, "No negative amounts.");
				}
			}
			if (user == 2) {
				if (m >= 0) {
					dollas2 += m;
					money.setText("Available: $" + dollas2);
				} else {
					JOptionPane.showMessageDialog(null, "No negative amounts.");
				}
			}
		}
		if (e.getSource() == witB) {
			double m = Double.parseDouble(witT.getText());
			if (user == 1) {
				if (dollas1 >= m) {
					if (m < 0) {
						JOptionPane.showMessageDialog(null, "No negative amounts.");
					} else {
						dollas1 -= m;
						money.setText("Available: $" + dollas1);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Too much!");
				}
			}
			if (user == 2) {
				if (dollas2 >= m) {
					if (m < 0) {
						JOptionPane.showMessageDialog(null, "No negative amounts.");
					} else {
						dollas2 -= m;
						money.setText("Available: $" + dollas2);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Too much!");
				}
			}
		}
		if (e.getSource() == U1) {
			user = 1;
			ATM.setText("ATM: User 1");
			money.setText("Available: $" + dollas1);
		}
		if (e.getSource() == U2) {
			user = 2;
			ATM.setText("ATM: User 2");
			money.setText("Available: $" + dollas2);
		}
	}
}
