import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
String color =JOptionPane.showInputDialog("What is you favorite color");	
JOptionPane.showMessageDialog(null, color + " that is my favorite color too!");
Robot Art = new Robot ();	
Art.penDown();
Art.setSpeed(10);
Art.turn(90);

	
	
}
}