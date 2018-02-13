import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NBAScoreboard {
	String homeName;
	String awayName;
	int homeScore;
	int awayScore;
	int homeFouls;
	int awayFouls;
	int homeTO;
	int awayTO;
	JFrame frame;
	JPanel homePanel;
	JPanel awayPanel;
	JPanel mainPanel;
	JPanel homeStuff;
	JPanel awayStuff;
	JLabel hTOText;
	JLabel hTO;
	JLabel aTOText;
	JLabel aTO;
	JLabel hFouls;
	JLabel hF;
	JLabel aFouls;
	JLabel aF;
	JButton homeTitle;
	JButton hScore;
	JButton awayTitle;
	JButton aScore;

	public NBAScoreboard() {
		this.homeName = "HOME";
		this.awayName = "AWAY";
		this.homeScore = 0;
		this.awayScore = 0;
		this.homeFouls = 0;
		this.awayFouls = 0;
		this.homeTO = 3;
		this.awayTO = 3;
		frame = new JFrame();
		homePanel = new JPanel();
		homeStuff = new JPanel();
		awayPanel = new JPanel();
		awayStuff = new JPanel();
		mainPanel = new JPanel();
		hTOText = new JLabel("TIMEOUTS:");
		hTO = new JLabel(Integer.toString(homeTO));
		aTOText = new JLabel("TIMEOUTS:");
		aTO = new JLabel(Integer.toString(awayTO));
		hFouls = new JLabel("FOULS:");
		hF = new JLabel(Integer.toString(homeFouls));
		aFouls = new JLabel("FOULS:");
		aF = new JLabel(Integer.toString(awayFouls));
		homeTitle = new JButton("HOME");
		hScore = new JButton(Integer.toString(homeScore));
		awayTitle = new JButton("AWAY");
		aScore = new JButton(Integer.toString(awayScore));
		hScore.setFont(new Font("DIALOG", Font.BOLD, 40));
		aScore.setFont(new Font("DIALOG", Font.BOLD, 40));
		homeTitle.setFont(new Font("Monospaced Plain", Font.PLAIN, 30));
		awayTitle.setFont(new Font("Monospaced Plain", Font.PLAIN, 30));
		run();
	}

	void run() {
		homePanel.setLayout(new BorderLayout());
		homePanel.add(homeTitle, BorderLayout.NORTH);
		homePanel.add(hScore, BorderLayout.CENTER);
		homeStuff.add(hTOText);
		homeStuff.add(hTO);
		homeStuff.add(hFouls);
		homeStuff.add(hF);
		homePanel.add(homeStuff, BorderLayout.SOUTH);
		awayPanel.setLayout(new BorderLayout());
		awayPanel.add(awayTitle, BorderLayout.NORTH);
		awayPanel.add(aScore, BorderLayout.CENTER);
		awayStuff.add(aTOText);
		awayStuff.add(aTO);
		awayStuff.add(aFouls);
		awayStuff.add(aF);
		awayPanel.add(awayStuff, BorderLayout.SOUTH);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(homePanel, BorderLayout.WEST);
		mainPanel.add(awayPanel, BorderLayout.EAST);
		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void changeHomeScore(int i) {
		this.homeScore += i;
		hScore.setText(Integer.toString(homeScore));
	}

	public void changeHomeTO(int i) {
		this.homeTO += i;
		hTO.setText(Integer.toString(homeTO));
	}

	public void changeHomeFouls(int i) {
		this.homeFouls += i;
		hF.setText(Integer.toString(homeFouls));
	}

	public void changeHomeName(String s) {
		this.homeName = s;
		homeTitle.setText(s);
	}

	public void changeAwayScore(int i) {
		this.awayScore += i;
		aScore.setText(Integer.toString(awayScore));
	}

	public void changeAwayTO(int i) {
		this.awayTO += i;
		aTO.setText(Integer.toString(awayTO));
	}

	public void changeAwayFouls(int i) {
		this.awayFouls += i;
		aF.setText(Integer.toString(awayFouls));
	}

	public void changeAwayName(String s) {
		this.awayName = s;
		awayTitle.setText(s);
	}

	public int getHomeScore() {
		return this.homeScore;
	}

	public int getHomeTO() {
		return this.homeTO;
	}

	public int getHomeFouls() {
		return this.homeFouls;
	}

	public int getAwayScore() {
		return this.awayScore;
	}

	public int getAwayTO() {
		return this.awayTO;
	}

	public int getAwayFouls() {
		return this.awayFouls;
	}
}
