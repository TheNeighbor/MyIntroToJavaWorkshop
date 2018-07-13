package section2;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot GLaDOS = new Robot();

	void go() {
		GLaDOS.moveTo(500, 500);
		// 4. Make the robot move as fast as possible
		GLaDOS.setSpeed(200);
		// 5. Set the pen width to 5
		GLaDOS.setPenWidth(10);
		GLaDOS.penDown();
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			GLaDOS.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			GLaDOS.turn(90);
		}
	}

	void drawSquare() {
		// JOptionPane.showMessageDialog(null, "yay! you called the drawSquare()
		// method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		GLaDOS.penDown();
		for (int i = 0; i < 4; i++) {
			GLaDOS.move(200);
			GLaDOS.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
