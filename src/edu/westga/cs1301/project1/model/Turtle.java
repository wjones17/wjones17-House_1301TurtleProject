package edu.westga.cs1301.project1.model;

import acm.graphics.GTurtle;

/**
 * Turtle represents a graphical turtle that can move around on the screen,
 * turn, and raise or lower its tail. When its tail is lowered, it "scratches" a
 * line on the screen that shows the path it takes.
 * 
 * @author CS1301
 * @version Spring 2020
 */
public class Turtle extends GTurtle {

	public static final double INITIAL_SPEED = 0.6;
	public static final int INITIAL_SIZE = 50;

	private boolean tailDown;
	private int stepsForward;

	/**
	 * Creates a new Turtle object of size 50 at location 0, 0.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == false AND getTurtleSize() == INITIAL_SIZE AND
	 *                getLocation() == (25, 25) AND getSpeed() ==
	 *                INITIAL_TURTLE_SPEED
	 * 
	 */
	public Turtle() {
		this.initializeWithDefaultValues();
	}

	/**
	 * Overloaded constructor
	 * 
	 * @param size is the preferred turtle size
	 * @precondition none
	 * @postcondition isTailDown() == false AND getTurtleSize() == size AND
	 *                getLocation() == (25, 25) AND getSpeed() ==
	 *                INITIAL_TURTLE_SPEED
	 */
	public Turtle(int size) {
		this.initializeWithDefaultValues();
		this.setSize(size);

	}

	private void initializeWithDefaultValues() {
		this.tailDown = false;
		this.stepsForward = 0;
		this.setSize(INITIAL_SIZE);
		this.setSpeed(INITIAL_SPEED);
		this.setLocation(INITIAL_SIZE / 2, INITIAL_SIZE / 2);
	}

	/**
	 * Moves the turtle forward in its current direction by a distance equal to its
	 * own size. The turtle draws a line if its tail is down, but otherwise just
	 * moves.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void stepForward() {
		this.forward();
		this.stepsForward++;
	}

	/**
	 * Moves the turtle forward in its current direction by a distance equal to its
	 * own size, times the parameter "steps".
	 * 
	 * @param steps: This is the number of steps the user wishes to make the Turtle
	 *               take.
	 * @precondition none
	 * @postcondition none
	 */
	public void stepForward(int steps) {
		for (int i = 0; i < steps; i++) {
			this.stepForward();
		}

	}

	/**
	 * Turns the turtle by "args" degrees to its left.
	 *
	 * @param args this will be the degree for which the turtle will turn .
	 * @precondition none
	 * @postcondition none
	 */
	public void turnLeft(double args) {
		this.left(args);
	}

	/**
	 * Turns the turtle by args degrees to its right.
	 *
	 * @param args this will be the degree for which the turtle will turn right.
	 * @precondition none
	 * @postcondition none
	 */
	public void turnRight(double args) {
		this.right(args);
	}

	/**
	 * Drops the turtle's tail to the ground so it will draw a line when it moves.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == true
	 */
	public void lowerTail() {
		this.penDown();
		this.tailDown = true;
	}

	/**
	 * Lifts the turtle's tail from the ground so it won't draw a line when it
	 * moves.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == false.
	 */
	public void raiseTail() {
		this.penUp();
		this.tailDown = false;
	}

	/**
	 * Returns true if the turtle's tail is lowered to the ground, false if it
	 * isn't.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return true iff the tail is lowered
	 */
	public boolean isTailDown() {
		return this.tailDown;
	}

	/**
	 * Gets the number of steps forward the turtle has taken
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return The total number of steps forward the turtle has taken.
	 */
	public int getStepsForward() {
		return this.stepsForward;
	}

	/**
	 * Draws a rectangle with the given width and height from the user.
	 * 
	 * @preconidtion none
	 * @postcondition none
	 * 
	 * @param width  is the with of the preferred rectangle.
	 * @param height is the preferred height of the rectangle.
	 */
	public void drawRectangle(int width, int height) {
		this.lowerTail();
		this.stepForward(width);
		this.turnRight(90);
		this.stepForward(height);
		this.turnRight(90);

		this.stepForward(width);
		this.turnRight(90);
		this.stepForward(height);
		this.turnRight(90);

		this.raiseTail();
	}

	/**
	 * Draw an equilateral triangle with a given length for the sides
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param sides: length of one side of the triangle. Since it is an equilateral
	 *               triangle, all sides will be the same length.
	 * 
	 */
	public void drawTriangle(int sides) {
		this.turnLeft(60);
		this.lowerTail();
		this.stepForward(sides);
		this.turnRight(120);
		this.stepForward(sides);
		this.turnRight(120);
		this.stepForward(sides);
		this.raiseTail();
		this.turnRight(180);
	}

	/**
	 * Draws a hexagon with a preferred length of sides.
	 * 
	 * @precondition side must be >0
	 * @postcondition none
	 * 
	 * @param side is the length of the side of the hexagon.
	 */
	public void drawHexagon(int side) {
		this.lowerTail();
		for (int x = 0; x < 6; x++) {
			this.stepForward(side);
			this.turnLeft(60);
		}
	}

}
