import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSaysRecipe extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame frame = new JFrame();

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	private int score = 0;
	Date timeAtStart = new Date();

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "down.png");
		images.put(new Integer(KeyEvent.VK_UP), "up.png");
		images.put(new Integer(KeyEvent.VK_RIGHT), "right.png");
		images.put(new Integer(KeyEvent.VK_LEFT), "left.png");
		// 3. Tell the user to "Press the matching key when 'Simon says'
		// otherwise press a different key"
		JOptionPane.showMessageDialog(null,
				"Press the matching key when 'Simon says' otherwise press a different key. Try to take as little time as possible.");
		// 4. call the method to show an image
		showImage();

	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their
		// score at the end.
		// 17. if the keyCode matches the imageIndex and "Simon says..."
		if (simonSays == 0) {
			if (keyCode != imageIndex) {
				score++;
				speak("Correct!");
			} else {
				speak("Incorrect!");
			}
		} else {
			if (keyCode == imageIndex) {
				score++;
				speak("Correct!");
			} else {
				speak("Incorrect!");
			}
		}
		// increase their score
		// 18. if the keyCode doesn't match the imageIndex and "Simon didn't
		// say..." increase their score
		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1
		tries++;

		// 14. if tries is greater than 9 (or however many you want)
		if (tries > 9) {
			Date timeAtEnd = new Date();
			int time = (int) ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000);
			speak("Your score is " + (1+tries + (score * 10)-time));
			System.exit(0);
		}
		// 15. exit the program

		// 11. dispose of the frame
		frame.dispose();
		
		// 12. call the method to show an image
		showImage();
	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		JFrame frame = new JFrame();
		// 6. set the frame to visible
		Date timeRN = new Date();
		frame.setTitle("Your current score is " + String.valueOf(1+tries + score*10-(int) ((timeRN.getTime() - timeAtStart.getTime()) / 1000)));
		frame.add(getNextRandomImage()); // 7. rename to the name of your
		// frame

		// 8. set the size of the frame
		frame.setSize(2000, 1000);
		frame.setVisible(true);
		// 9. add a key listener to the frame
		frame.addKeyListener(this);
		Random rand = new Random();
		simonSays = rand.nextInt(3);
		if (simonSays == 0) {
			speak("Press this key");
		} else {
			speak("Simon says press this key");
		}
		// 10. Use the speak method to either say "Simon says press this key" or
		// "Press this key"
		// Hint: use the simonSays int and a random number
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSaysRecipe().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
