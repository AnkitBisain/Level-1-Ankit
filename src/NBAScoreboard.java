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
	JLabel hTOText;
	JLabel hTO;
	JLabel aTOText;
	JLabel aTO;
	JLabel hFouls;
	JLabel hF;
	JLabel aFouls;
	JLabel aF;
	JLabel homeTitle;
	JLabel hScore;
	JLabel awayTitle;
	JLabel aScore;
	
	public NBAScoreboard() {
		this.homeName = "HOME";
		this.awayName = "AWAY";
		this.homeScore = 0;
		this.awayScore = 0;
		this.homeFouls = 0;
		this.awayFouls = 9;
		this.homeTO = 3;
		this.awayTO = 3;
		frame = new JFrame();
		homePanel = new JPanel();
		awayPanel = new JPanel();
		mainPanel = new JPanel();
		hTOText = new JLabel("TIMEOUTS");
		hTO = new JLabel(Integer.toString(homeTO));
		aTOText = new JLabel("TIMEOUTS");
		aTO = new JLabel(Integer.toString(awayTO));
		hFouls = new JLabel("FOULS");
		hF = new JLabel(Integer.toString(homeFouls));
		aFouls = new JLabel("FOULS");
		aF = new JLabel(Integer.toString(awayFouls));
		homeTitle = new JLabel("HOME");
		hScore = new JLabel(Integer.toString(homeScore));
		awayTitle = new JLabel("AWAY");
		aScore = new JLabel(Integer.toString(awayScore));
		run();
	}

	void run() {
		homePanel.add(homeTitle);
		homePanel.add(hScore);
		homePanel.add(hTOText);
		homePanel.add(hTO);
		homePanel.add(hFouls);
		homePanel.add(hF);
		awayPanel.add(awayTitle);
		awayPanel.add(aScore);
		awayPanel.add(aTOText);
		awayPanel.add(aTO);
		awayPanel.add(aFouls);
		awayPanel.add(aF);
		mainPanel.add(homePanel);
		mainPanel.add(awayPanel);		
		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		NBAScoreboard s = new NBAScoreboard();
	}
}
