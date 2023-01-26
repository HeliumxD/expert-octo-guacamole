package asdfasdf;
import robocode.*;

public class Hu_Tao extends JuniorRobot
{
	int up = 0;
	int right = 90;
	int down = 180;
	int left = 270;
	int forward = 200;
	
	public void run() {
		setColors(red, orange, red, yellow, black);
		
		int heightdistance;
			heightdistance = fieldHeight - robotY;
			turnTo(up);
			ahead(heightdistance);
			
		while(true){
			turnGunTo(down);
			turnGunTo(up);
	}
}
	public void onScannedRobot() {
	  	turnGunTo(scannedAngle);
		out.println("FIRE!");
		fire(2);
	}
	
	public void onHitByBullet() {
		turnTo(down);
		out.println("Bye");
		ahead(forward);
		turnTo(up);
		out.println("Hello again");
		ahead(forward);
	}

	public void onHitWall() {
		out.println("Nice");
	}	
}
