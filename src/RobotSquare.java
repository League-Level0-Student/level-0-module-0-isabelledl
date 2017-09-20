import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 Robot Art = new Robot();
    	// 1. Make a new Robot

Art.hide();

        // 3. Put the robot's pen down
Art.penDown();

        // 6. Make the robot move as fast as possible
Art.setSpeed(100);

        // 5. Do everything below here 4 times
for (int i = 0; i <4; i++) {
	


        //         2. Move your robot 200 pixels
Art.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
Art.turn(90);
}
    }
}
