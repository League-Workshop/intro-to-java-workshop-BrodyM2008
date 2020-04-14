package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot ironGiant=new Robot();
		
		for (int i = 0; i < 75; i++) {
			
		
		ironGiant.penDown();
		
		ironGiant.turn(360/7);
		
		ironGiant.setSpeed(100);
		
		ironGiant.move(5*i);
		
		ironGiant.setRandomPenColor();
		
		ironGiant.setPenWidth(i);
		
		
	}
	}
}
