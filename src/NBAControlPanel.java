import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NBAControlPanel implements ActionListener {
	NBAScoreboard n;
	JFrame frame;
	JPanel mainPanel;
	JPanel homeChange;
	JPanel awayChange;
	JPanel homeScoreChange;
	JPanel homeTOChange;
	JPanel homeFoulsChange;
	JPanel awayScoreChange;
	JPanel awayTOChange;
	JPanel awayFoulsChange;
	JPanel homeOverall;
	JPanel homeTitle;
	JLabel homeScoreTitle;
	JLabel homeTOTitle;
	JLabel homeFoulsTitle;
	JPanel awayOverall;
	JPanel awayTitle;
	JLabel awayScoreTitle;
	JLabel awayTOTitle;
	JLabel awayFoulsTitle;
	JButton homeScore1;
	JButton homeScore2;
	JButton homeFouls1;
	JButton homeFouls2;
	JButton homeTO1;
	JButton homeTO2;
	JButton awayScore1;
	JButton awayScore2;
	JButton awayFouls1;
	JButton awayFouls2;
	JButton awayTO1;
	JButton awayTO2;
	JTextField homeName;
	JTextField awayName;

	public static void main(String[] args) {
		NBAControlPanel p = new NBAControlPanel();
	}

	public NBAControlPanel() {
		n = new NBAScoreboard();
		frame = new JFrame();
		mainPanel = new JPanel();
		homeChange = new JPanel();
		awayChange = new JPanel();
		homeScoreChange = new JPanel();
		homeTOChange = new JPanel();
		homeFoulsChange = new JPanel();
		awayScoreChange = new JPanel();
		awayTOChange = new JPanel();
		awayFoulsChange = new JPanel();
		homeTitle = new JPanel();
		homeScoreTitle = new JLabel("Score");
		homeTOTitle = new JLabel("TOs");
		homeFoulsTitle = new JLabel("Fouls");
		awayTitle = new JPanel();
		awayScoreTitle = new JLabel("Score");
		awayTOTitle = new JLabel("TOs");
		awayFoulsTitle = new JLabel("Fouls");
		homeScore1 = new JButton("+1");
		homeScore2 = new JButton("-1");
		homeFouls1 = new JButton("+1");
		homeFouls2 = new JButton("-1");
		homeTO1 = new JButton("+1");
		homeTO2 = new JButton("-1");
		awayScore1 = new JButton("+1");
		awayScore2 = new JButton("-1");
		awayFouls1 = new JButton("+1");
		awayFouls2 = new JButton("-1");
		awayTO1 = new JButton("+1");
		awayTO2 = new JButton("-1");
		homeName = new JTextField("Home");
		awayName = new JTextField("Away");
		homeOverall = new JPanel();
		awayOverall = new JPanel();
		homeName.setFont(new Font("Arial", Font.PLAIN, 40));
		awayName.setFont(new Font("Arial", Font.PLAIN, 40));
		run();
	}

	void run() {
		homeScoreChange.setLayout(new BorderLayout());
		homeScoreChange.add(homeScoreTitle, BorderLayout.NORTH);
		homeScoreChange.add(homeScore1, BorderLayout.CENTER);
		homeScoreChange.add(homeScore2, BorderLayout.SOUTH);
		homeFoulsChange.setLayout(new BorderLayout());
		homeFoulsChange.add(homeFoulsTitle, BorderLayout.NORTH);
		homeFoulsChange.add(homeFouls1, BorderLayout.CENTER);
		homeFoulsChange.add(homeFouls2, BorderLayout.SOUTH);
		homeTOChange.setLayout(new BorderLayout());
		homeTOChange.add(homeTOTitle, BorderLayout.NORTH);
		homeTOChange.add(homeTO1, BorderLayout.CENTER);
		homeTOChange.add(homeTO2, BorderLayout.SOUTH);
		homeChange.setLayout(new BorderLayout());
		homeChange.add(homeScoreChange, BorderLayout.NORTH);
		homeChange.add(homeTOChange, BorderLayout.CENTER);
		homeChange.add(homeFoulsChange, BorderLayout.SOUTH);
		homeTitle.add(homeName);
		homeOverall.setLayout(new BorderLayout());
		homeOverall.add(homeTitle, BorderLayout.NORTH);
		homeOverall.add(homeChange, BorderLayout.CENTER);
		awayScoreChange.setLayout(new BorderLayout());
		awayScoreChange.add(awayScoreTitle, BorderLayout.NORTH);
		awayScoreChange.add(awayScore1, BorderLayout.CENTER);
		awayScoreChange.add(awayScore2, BorderLayout.SOUTH);
		awayFoulsChange.setLayout(new BorderLayout());
		awayFoulsChange.add(awayFoulsTitle, BorderLayout.NORTH);
		awayFoulsChange.add(awayFouls1, BorderLayout.CENTER);
		awayFoulsChange.add(awayFouls2, BorderLayout.SOUTH);
		awayTOChange.setLayout(new BorderLayout());
		awayTOChange.add(awayTOTitle, BorderLayout.NORTH);
		awayTOChange.add(awayTO1, BorderLayout.CENTER);
		awayTOChange.add(awayTO2, BorderLayout.SOUTH);
		awayChange.setLayout(new BorderLayout());
		awayChange.add(awayScoreChange, BorderLayout.NORTH);
		awayChange.add(awayTOChange, BorderLayout.CENTER);
		awayChange.add(awayFoulsChange, BorderLayout.SOUTH);
		awayTitle.add(awayName);
		awayOverall.setLayout(new BorderLayout());
		awayOverall.add(awayTitle, BorderLayout.NORTH);
		awayOverall.add(awayChange, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(homeOverall, BorderLayout.WEST);
		mainPanel.add(awayOverall, BorderLayout.EAST);
		homeScore1.addActionListener(this);
		homeScore2.addActionListener(this);
		homeTO1.addActionListener(this);
		homeTO2.addActionListener(this);
		homeFouls1.addActionListener(this);
		awayFouls2.addActionListener(this);
		awayScore1.addActionListener(this);
		awayScore2.addActionListener(this);
		awayTO1.addActionListener(this);
		awayTO2.addActionListener(this);
		awayFouls1.addActionListener(this);
		awayFouls2.addActionListener(this);
		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == homeScore1) {
			n.changeHomeScore(1);
		}
		if(e.getSource() == homeScore2) {
			n.changeHomeScore(-1);
		}
		if(e.getSource() == homeTO1) {
			n.changeHomeTO(1);
		}
		if(e.getSource() == homeTO2) {
			n.changeHomeTO(-1);
		}
		if(e.getSource() == homeFouls1) {
			n.changeHomeFouls(1);
		}
		if(e.getSource() == homeFouls2) {
			n.changeHomeFouls(-1);
		}
		if(e.getSource() == awayScore1) {
			n.changeawayScore(1);
		}
		if(e.getSource() == awayScore2) {
			n.changeawayScore(-1);
		}
		if(e.getSource() == awayTO1) {
			n.changeawayTO(1);
		}
		if(e.getSource() == awayTO2) {
			n.changeawayTO(-1);
		}
		if(e.getSource() == awayFouls1) {
			n.changeawayFouls(1);
		}
		if(e.getSource() == awayFouls2) {
			n.changeawayFouls(-1);
		}
	}

}
