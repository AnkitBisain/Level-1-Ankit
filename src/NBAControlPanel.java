import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NBAControlPanel {
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
	JLabel homeTitle;
	JLabel homeScoreTitle;
	JLabel homeTOTitle;
	JLabel homeFoulsTitle;
	JLabel awayTitle;
	JLabel awayScoreTitle;
	JLabel awayTOTitle;
	JLabel awayFoulsTitle;
	JButton homeScore1;
	JButton homeScore2;
	JButton homeScore3;
	JButton homeFouls1;
	JButton homeTO1;
	JButton awayScore1;
	JButton awayScore2;
	JButton awayScore3;
	JButton awayFouls1;
	JButton awayTO1;
	
	
	public static void main(String[] args) {
		NBAControlPanel p = new NBAControlPanel();
	}
	
	public NBAControlPanel(){
		frame = new JFrame();;
		mainPanel = new JPanel();
		homeChange = new JPanel();
		awayChange = new JPanel();
		homeScoreChange = new JPanel();
		homeTOChange = new JPanel();
		homeFoulsChange = new JPanel();
		awayScoreChange = new JPanel();
		awayTOChange = new JPanel();
		awayFoulsChange = new JPanel();
		homeTitle = new JLabel("Home");
		homeScoreTitle = new JLabel("Score");
		homeTOTitle = new JLabel("TOs");
		homeFoulsTitle = new JLabel("Fouls");
		awayTitle = new JLabel("Away");
		awayScoreTitle = new JLabel("Score");
		awayTOTitle = new JLabel("TOs");
		awayFoulsTitle = new JLabel("Fouls");
		JButton homeScore1;
		JButton homeScore2;
		JButton homeScore3;
		JButton homeFouls1;
		JButton homeTO1;
		JButton awayScore1;
		JButton awayScore2;
		JButton awayScore3;
		JButton awayFouls1;
		JButton awayTO1;
	}
	
}
