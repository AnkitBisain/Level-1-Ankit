import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bot = new Robot();

	public static void main(String[] args) {
		Houses house = new Houses();
		house.begin();
		house.buildHouse("s", false, Color.blue);
		house.buildHouse("m", true, Color.green);
		house.buildHouse("l", false, Color.cyan);
		house.buildHouse("m", true, Color.magenta);
		house.buildHouse("m", true, Color.pink);
		house.buildHouse("l", false, Color.yellow);
		house.buildHouse("s", false, Color.orange);
	}

	public void buildHouse(String size, Boolean tilt, Color color) {
		int x = 0;
		if (size.equals("s")) {
			x = 1;
		} else {
			if (size.equals("m")) {
				x = 2;
			} else {
				x = 3;
			}
		}
		bot.penDown();
		bot.setPenWidth(5);
		bot.setPenColor(color);;;
		bot.move(140 * x);
		if(tilt == true) {
			pRoof(x);
		}
		if(tilt==false) {
			fRoof(x);
		}
		bot.move(140 * x);
		bot.turn(-90);
		bot.setPenColor(0, 200, 0);
		bot.setPenWidth(10);
		bot.move(100);
		bot.turn(-90);
	}

	public void begin() {
		bot.hide();
		bot.setSpeed(10);
		bot.moveTo(100, 800);
	}
	public void pRoof(int x) {
		bot.turn(45);
		bot.move(25*x);
		bot.turn(90);
		bot.move(25*x);
		bot.turn(45);
	}
	public void fRoof(int x) {
		bot.turn(90);
		bot.move(35*x);
		bot.turn(90);
	}
	}