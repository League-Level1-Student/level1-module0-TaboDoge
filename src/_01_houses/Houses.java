package _01_houses;

import java.awt.Color;
import java.util.Random;
import java.util.prefs.BackingStoreException;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot house = new Robot(); 
		house.moveTo(100, 500);
		house.turn(90);
		for(int i = 0; i < 10; i++) {
		Random random = new Random();
		int color = random.nextInt(200);		Color grass = new Color(0, 150, 0);
String size = JOptionPane.showInputDialog("What size of house do you prefer? (small, medium, large?)");
String roof = JOptionPane.showInputDialog("Would you like a flat or pointy roof? (all large houses have flat roofs)");


if (size.equals("small")) {
	house.turn(-90);
	Color S = new Color(35, color, 200);
	house.setPenColor(S);
	house.setPenWidth(10);
	house.penDown();
	house.setSpeed(1000);
	house.move(60);


	if(roof.equals("flat")) {
		house.turn(90);
		house.move(90);
		house.turn(90);
	}
	else {
	house.turn(60);
	house.move(50);
	house.turn(60);
	house.move(50);
	house.turn(60);
	}
	house.move(60);
	house.turn(-90);
	house.setPenColor(grass);
	house.move(50);
}
 if(size.equals("medium")) {
	Color S = new Color(35, 200, color);

house.turn(-90);
	
	house.setPenColor(S);
	house.setPenWidth(10);
	house.penDown();
	house.setSpeed(1000);
	house.move(120);
	if(roof.equals("flat")) {
		house.turn(90);
		house.move(90);
		house.turn(90);
	}
	else {
	house.turn(60);
	house.move(50);
	house.turn(60);
	house.move(50);
	house.turn(60);
	}
	house.move(120);
	house.turn(-90);
	house.setPenColor(grass);
	house.move(50);

 }
 else {
			Color S = new Color(color, 250, 100);

		house.turn(-90);
			
			house.setPenColor(S);
			house.setPenWidth(12);
			house.penDown();
			house.setSpeed(1000);
			house.move(250);
			house.turn(90);
			house.move(90);
			house.turn(90);
			house.move(250);
			house.turn(-90);
			house.setPenColor(grass);
			house.move(50);
 }
}
		
	}
}
