import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PARTY implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String img = "Untitled drawing (1).png";
	JLabel picture = new JLabel();
	int state = 0;
	JButton partybutton = new JButton();
	JLabel boar = new JLabel();
	String ring = "NotYourATM.420w.jpg";

	public static void main(String[] args) {
		PARTY atm = new PARTY();
		atm.run();
	}

	public void run() {
		try {
			picture = createLabelImage(img);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boar = createLabelImage(ring);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(picture);
		panel.add(partybutton);
		panel.add(boar);
		partybutton.setText("Party!!!!!");
		picture.setVisible(false);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		partybutton.addActionListener(this);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == partybutton) {
			if(state==0) {
				picture.setVisible(true);
				boar.setVisible(false);
				playSound("someBODY.mp3");
				state=1;
			}else {
			if(state==1) {
				picture.setVisible(false);
				boar.setVisible(true);
				state=0;
			}
			}
		}
	}

	
}
