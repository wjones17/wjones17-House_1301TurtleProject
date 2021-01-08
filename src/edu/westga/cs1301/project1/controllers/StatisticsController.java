package edu.westga.cs1301.project1.controllers;

import edu.westga.cs1301.project1.model.Turtle;
import edu.westga.cs1301.project1.utils.Statistics;

/**
 * Computes and displays basic statistics about the turtles
 * 
 * @author CS1301
 * @version Spring 2020
 */
public class StatisticsController {

	private Turtle turtle1;
	private Turtle turtle2;

	/**
	 * Creates a statistics controller
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public StatisticsController() {
		this.turtle1 = null;
		this.turtle2 = null;
	}

	/**
	 * Creates a statistics controller that will use the two specified turtles.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public StatisticsController(Turtle turtle1, Turtle turtle2) {
		this.turtle1 = turtle1;
		this.turtle2 = turtle2;
	}

	/**
	 * Displays summary stats about the turtles used to draw.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void displaySummaryStats() {
		averageStats();
		standardStats();

	}

	private void standardStats() {
		double stepsByTurtle1 = this.turtle1.getStepsForward();
		double stepsByTurtle2 = this.turtle2.getStepsForward();
		double turtle1size = turtle1.getTurtleSize();
		double turtle2size = turtle2.getTurtleSize();
		double turtle1standard = (stepsByTurtle1 * turtle1size) / 50;
		double turtle2standard = (stepsByTurtle2 * turtle2size) / 50;

		System.out.println("Standard turtle steps traveled by:");
		System.out.println("First turtle:" + turtle1standard);
		System.out.println("Second turtle:" + turtle2standard);
	}

	private void averageStats() {
		System.out.println("Turtles stats: ");
		System.out.println();
		System.out.println("Steps taken by:");

		int stepsByTurtle1 = this.turtle1.getStepsForward();
		int stepsByTurtle2 = this.turtle2.getStepsForward();

		System.out.println("First turtle: " + stepsByTurtle1);
		System.out.println("Second turtle: " + stepsByTurtle2);

		Statistics stats = new Statistics();
		double average = stats.computeAverage(stepsByTurtle1, stepsByTurtle2);
		System.out.println("Average steps taken by both turtles:" + average);
		System.out.println();

	}

}
