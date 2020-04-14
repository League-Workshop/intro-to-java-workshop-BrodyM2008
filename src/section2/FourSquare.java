package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot ironGiant=new Robot();
	
	
	
	void go() {
		ironGiant.setSpeed(100);
		
		ironGiant.penDown();
		
	

		ironGiant.setPenWidth(5);

		for (int i = 0; i < 4; i++) {

			ironGiant.setPenColor(Color.blue);
	
			drawSquare();
	
			ironGiant.turn(90);
			
			
		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		for (int i=0; i < 4; i++) {
			ironGiant.move(200);
			ironGiant.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



