package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot GLaDOS = new Robot();
		GLaDOS.setPenColor(Color.GREEN);
		GLaDOS.penDown();
		GLaDOS.setSpeed(200);
		for (int i = 0; i < 4; i++) {
			// move
			GLaDOS.move(100);
			// turn
			GLaDOS.turn(90);
		}

	}
}
