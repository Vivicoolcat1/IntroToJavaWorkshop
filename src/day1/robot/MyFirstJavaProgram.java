package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot rawsteal = new Robot ();
rawsteal.setPenColor(0,204,221);
	rawsteal.penDown();
	for (int i = 0; i <5; i++) {
		rawsteal.move(100);
		rawsteal.turn(140);}
	}
	
	}
	

