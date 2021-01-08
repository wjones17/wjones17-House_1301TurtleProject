package edu.westga.cs1301.project1.controllers;

import java.awt.Color;

import edu.westga.cs1301.project1.model.Turtle;
import edu.westga.cs1301.project1.utils.Statistics;

/**
 * Uses turtle objects to draw on the screen.
 * 
 * @author CS1301
 * @version Spring 2020
 */
public class ScribbleController {
	private Turtle bigTurtle;
	private Turtle littleTurtle;

	/**
	 * Creates and initializes a new ScribbleController object.
	 * 
	 * @precondition bigTurtle != null AND littleTurtle != null
	 * @postcondition none
	 * 
	 * @param bigTurtle    The bigger of the two turtles .
	 * @param littleTurtle The smaller of the two turtles.
	 * 
	 */
	public ScribbleController(Turtle bigTurtle, Turtle littleTurtle) {
		this.bigTurtle = bigTurtle;
		this.littleTurtle = littleTurtle;

	}

	/**
	 * Draws a figure on the screen using turtles.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void drawRectanglePattern() {
		this.bigTurtle.setLocation(85, 85);
		this.littleTurtle.setLocation(165, 85);

		this.bigTurtle.drawRectangle(5, 7);
		this.littleTurtle.drawRectangle(7, 15);

		this.bigTurtle.setLocation(505, 85);
		this.littleTurtle.setLocation(585, 85);

		this.bigTurtle.drawRectangle(5, 7);
		this.littleTurtle.drawRectangle(7, 15);

	}

	/**
	 * Draws a house using both turtles
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public void draw() {
		drawFrame();
		drawRoof();
		this.littleTurtle.setColor(Color.BLACK);
		firstWindow();
		secondWindow();
		drawDoor();
		blueSquare(2);
		greenTriangle(2);
		orangeHexagon(1);
		purpleTriangle(2);
		redSquare(2);
		yellowHexagon(3);
		turtleHomeLocation();

	}

	private void blueSquare(int side) {
		this.littleTurtle.setColor(Color.BLUE);
		this.littleTurtle.setLocation(200, 680);
		this.littleTurtle.drawRectangle(side, side);
	}

	private void greenTriangle(int side) {
		this.littleTurtle.setColor(Color.GREEN);
		this.littleTurtle.setLocation(280, 720);
		this.littleTurtle.drawTriangle(side);
	}

	private void orangeHexagon(int side) {
		this.littleTurtle.setColor(Color.ORANGE);
		this.littleTurtle.setLocation(360, 720);
		this.littleTurtle.drawHexagon(side);
	}

	private void purpleTriangle(int side) {
		this.littleTurtle.setColor(new Color(202, 65, 207));
		this.littleTurtle.setLocation(420, 720);
		this.littleTurtle.drawTriangle(side);
	}

	private void redSquare(int side) {
		this.littleTurtle.setColor(Color.RED);
		this.littleTurtle.setLocation(500, 680);
		this.littleTurtle.drawRectangle(side, side);
	}

	private void yellowHexagon(int side) {
		this.littleTurtle.setColor(Color.YELLOW);
		this.littleTurtle.setLocation(660, 180);
		this.littleTurtle.drawHexagon(side);
	}

	private void turtleHomeLocation() {
		this.littleTurtle.setLocation(25, 25);
		this.bigTurtle.setLocation(25, 25);

	}

	private void drawDoor() {
		this.littleTurtle.setLocation(360, 560);
		this.littleTurtle.drawRectangle(2, 4);

	}

	private void secondWindow() {
		this.littleTurtle.setLocation(480, 460);
		this.littleTurtle.drawRectangle(2, 2);
		this.littleTurtle.setLocation(500, 460);
		this.littleTurtle.turnRight(90);
		this.littleTurtle.lowerTail();
		this.littleTurtle.stepForward(2);
		this.littleTurtle.raiseTail();
		this.littleTurtle.setLocation(480, 480);
		this.littleTurtle.turnLeft(90);
		this.littleTurtle.lowerTail();
		this.littleTurtle.stepForward(2);
		this.littleTurtle.raiseTail();

	}

	private void firstWindow() {
		this.littleTurtle.setLocation(240, 460);
		this.littleTurtle.drawRectangle(2, 2);
		this.littleTurtle.setLocation(260, 460);
		this.littleTurtle.turnRight(90);
		this.littleTurtle.lowerTail();
		this.littleTurtle.stepForward(2);
		this.littleTurtle.raiseTail();
		this.littleTurtle.setLocation(240, 480);
		this.littleTurtle.turnLeft(90);
		this.littleTurtle.lowerTail();
		this.littleTurtle.stepForward(2);
		this.littleTurtle.raiseTail();

	}

	private void drawRoof() {
		this.bigTurtle.setLocation(200, 400);
		this.bigTurtle.drawTriangle(6);
		this.bigTurtle.setLocation(560, 460);
		this.bigTurtle.drawTriangle(4);

	}

	private void drawFrame() {
		this.bigTurtle.setLocation(200, 400);
		this.bigTurtle.drawRectangle(6, 4);
		this.bigTurtle.setLocation(560, 460);
		this.bigTurtle.drawRectangle(4, 3);

	}

}