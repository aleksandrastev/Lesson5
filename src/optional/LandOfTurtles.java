package optional;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Instantiate a JFrame object & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);

		// 2. Add the panel to the frame
		frame.getContentPane().add(panel);

		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);

		// 4. Set the size image of the frame to 600 by 400
		frame.setSize(600, 400);

		// 5. Instantiate a Turtle
		Turtle turtle = new Turtle();

		// 6. Add the turtle to the panel
		panel.addTurtle(turtle);

		// 7. Put 50 Turtles on the beach
		Random random = new Random();
		Turtle tur[] = new Turtle[50];
		for (int i = 0; i < tur.length; i++) {
			tur[i] = new Turtle();
			panel.addTurtle(tur[i]);
			tur[i].setX(random.nextInt(300) + 300);
			tur[i].setY(random.nextInt(250) + 150);
		}

	}
}
