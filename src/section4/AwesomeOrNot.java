package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	public static void main(String[]args) {
     
	
	JOptionPane.showMessageDialog(null, "Giant");   
	
     JOptionPane.showMessageDialog(null, "Roller Coaster are awesome!");
	
     Random Giant = new Random(4);
     int Random = Giant.nextInt(4);
     
     
    
      if (Random == 0) {JOptionPane.showMessageDialog(null, "It's awesome");}
	
      if (Random == 1) JOptionPane.showMessageDialog(null, "It's ok");

	  if (Random == 2) JOptionPane.showMessageDialog(null, "It's boring");

      if (Random == 3) JOptionPane.showMessageDialog(null, "You need to get better at numbers");


	


	}}


