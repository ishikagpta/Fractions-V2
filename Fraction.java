/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Fraction V2, Fraction
 * @date 10/17/20
 */

/**
 * This Fraction class stores a numerator and denominator as a fraction and
 * simplifies the fraction
 */
public class Fraction {

	// Creates instance variables to store numerator and denominator
	private int numerator;
	private int denominator;

	/**
	 * Empty Fraction constructor
	 */
	public Fraction() {

	}

	/**
	 * This constructor takes in a numerator and denominator and finds its greatest
	 * common multiple by invoking the gcd method and then divides them by the
	 * greatest common multiple and sets them equal to the instance variables that
	 * correspond to them
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public Fraction(int numerator, int denominator) {
		int multiple = gcd(numerator, denominator);
		this.numerator = numerator / multiple;
		this.denominator = denominator / multiple;
	}

	/**
	 * This method checks to see if two Fractions are equal by using cross
	 * multiplication
	 * 
	 * @param other
	 */
	public boolean equals(Fraction other) {

		int y = this.numerator * other.denominator;
		int z = other.numerator * this.denominator;

		return y == z;

	}

	/**
	 * this toString method returns a string version of the fraction by using the
	 * numerator and denominator instances
	 */
	public String toString() {
		return numerator + "/" + denominator;
	}

	/**
	 * Accessor method for instance variable numerator
	 * 
	 * @return numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Mutator method for instance variable numerator by setting it equal to the
	 * numerator given by the parameter
	 * 
	 * @param num
	 */
	public void setNumerator(int num) {
		this.numerator = num;
	}

	/**
	 * Accessor method for instance variable denominator
	 * 
	 * @return denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Mutator method for instance variable denominator by setting it equal to the
	 * denominator given by the parameter
	 * 
	 * @param denom
	 */
	public void setDenominator(int denom) {
		this.denominator = denom;
	}

	/**
	 * Simplification method that simplifies the fraction. It first checks to see if
	 * the numerator or denominator is negative. If either one is negative but not
	 * both, it sets boolean fractionNegative to true. Then the method sets the
	 * numerator and denominator equal to their absolute value. It then uses the gcd
	 * method to find the greatest common multiple of the numerator and denominator
	 * and divides the numerator and denominator by the greatest common multiple.
	 * Then, if the fraction was originally negative aka fractionNegative was true,
	 * it sets the fraction to be negative again.
	 */
	private void simplification() {
		boolean fractionNegative;
		if ((denominator < 0) != (numerator < 0)) {
			fractionNegative = true;
		} else {
			fractionNegative = false;
		}

		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);

		int multiple = gcd(numerator, denominator);

		numerator = numerator / multiple;

		denominator = denominator / multiple;
		if (fractionNegative = true)
			numerator *= -1;
	}

	/**
	 * GCD method used to find the greatest common divisor/multiple of the two
	 * numbers given by the parameter.
	 * 
	 * Source: https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/
	 * 
	 * @param a
	 * @param b
	 */
	private static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
}
