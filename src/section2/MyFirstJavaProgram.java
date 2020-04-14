package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ironGiant=new Robot();
	ironGiant.setSpeed(99);
	ironGiant.penDown();
	for (int i = 0; i < 4; i++) {
		ironGiant.move(200);
		ironGiant.turn(90);
	}
	
	
	
	}
	
}
