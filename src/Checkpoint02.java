import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint02 {
public static void main(String[] args) {
String tv = JOptionPane.showInputDialog(null, "What is your favorite tv show");
JOptionPane.showMessageDialog(null,tv+ " is my favorite tv show too! ");
Robot Art = new Robot();	
Art.penDown();
Art.hide();
Art.setSpeed(100);
Art.move(200);
Art.turn(90);	
Art.move(200);	
Art.turn(90);		
Art.move(200);
Art.turn(90);			
Art.move(200);		
	
	
	
}	
}

