package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot ironGiant=new Robot();
	
		
		ironGiant.move(200);
		
		ironGiant.penDown();
		
		for (int i = 0; i < 200; i++) {
			
		}
		int sides=90;
		
		int angles=360/sides;
		
		ironGiant.turn(angles);
		
		
		

		

		// 8. Make the robot go at maximum speed (100)

		// 9. Set the pen to a color that you like for the shape

	

		

		// 7. Use a for loop to repeat the steps below (#2, #10, #6, #11) 200 times. When this is done you should see a pentagon

		
	
			// 10. Change the previous line of code to make the robot move "i" pixels instead of 200 
	
			
	
			// 11. Turn the robot one more degree

	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
