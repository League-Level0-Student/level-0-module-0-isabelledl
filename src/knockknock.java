import javax.swing.JOptionPane;

public class knockknock {
public static void main(String[] args) {
 String a = JOptionPane.showInputDialog("Knock knock");
if(a.equals("Who's there")){
	a = JOptionPane.showInputDialog("lettuce");	
	if(a.equals("lettuce who")){
	 JOptionPane.showMessageDialog(null, "lettuce in it is cold out there");
	}
		
	}
}

}

