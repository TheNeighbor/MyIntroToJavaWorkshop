package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		speak("Baldi's Basics In Education and learning");
		JOptionPane.showMessageDialog(null, "Baldi's Basics In Education and learning");
		// 2. Ask the user a question
		String answer1 = JOptionPane.showInputDialog("What is 1+1?");
		// 3. Use an if statement to check if their answer is correct
		if (answer1.equals("2")) {
			score++;
		}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		String answer2 = JOptionPane.showInputDialog("What is 9*8?");
		if (answer2.equals("72")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!!");
		}

		String answer3 = JOptionPane.showInputDialog("What is (12*56)+(76-45)?");
		if (answer3.equals("703")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!!");
		}

		String answer4 = JOptionPane
				.showInputDialog("What is (8734628edsdagb°‡ﬂ4875gahsjd7shx)*(oooohlalaaaaaa)? Hint: Look at dcoe.");
		if (answer4.equals("67345")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!!");
		}
		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "Score: " + score + "/4");
		// Answer: 67345
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
