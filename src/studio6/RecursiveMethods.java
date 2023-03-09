package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		  
			if (n == 0) {
				
				return 0;
				
			} else {
		
				return  (geometricSum(n-1) + (Math.pow(0.5, (n))));
				
			}

	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		if (q == 0) {

			return 0;

		} else {

			if (p%q == 0) {
				
				return q;
				
				
			
			} else {
				
				return gcd(q,p%q);
				
			}

		}

	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
			
			int index = array.length;
			
			return new int[0];
			

		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		if (radius <= radiusMinimumDrawingThreshold) {
			
			StdDraw.circle(xCenter, yCenter, radius);
			
		} else {
			
			StdDraw.circle(xCenter, yCenter, radius);
			
		}
	
		
	}

}
