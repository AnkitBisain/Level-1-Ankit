import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bot = new Robot();

	public static void main(String[] args) {
		Houses house = new Houses();
		house.begin();
		house.buildHouse("s", 0);
		house.buildHouse("m", 45);
		house.buildHouse("l", 0);
		house.buildHouse("m", 20);
		house.buildHouse("m", 60);
		house.buildHouse("l", 0);
		house.buildHouse("s", 15);
	}

	public void buildHouse(String size, int peakangle) {
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
		bot.setRandomPenColor();
		bot.move(140 * x);
		bot.turn(90 - peakangle);
		bot.move(35 * x);
		bot.turn(2 * peakangle);
		bot.move(35 * x);
		bot.turn(90 - peakangle);
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
}
