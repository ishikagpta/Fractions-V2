/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Fraction V2, FractionCounter
 * @date 10/17/20
 */

/**
 * This FractionCounter class stores a Fraction object and its count
 *
 */
public class FractionCounter {

	// these are the instance private variables that are used to have a fraction of
	// type Fraction class and its count
	private Fraction fraction;
	private int counter = 1;

	/**
	 * This constructor takes a Fraction object theFraction and makes the Fraction
	 * object theFraction equal to this instance of the instance variable fraction
	 * and sets the count equal to 1.
	 * 
	 * @param theFraction
	 */
	public FractionCounter(Fraction theFraction) {
		this.fraction = theFraction;
		counter = 1;
	}

	/**
	 * This is a method that compares a Fraction object to another fraction
	 * instance. If they are different return false else return true and up the
	 * counter by one.
	 * 
	 * @param newFraction
	 * @return false, true
	 */
	public boolean CompareandIncrement(Fraction newFraction) {
		if (!(fraction.equals(newFraction))) {
			return false;
		} else {
			counter++;
			return true;
		}
	}

	/**
	 * This toString method returns a string version of the fraction instance and
	 * its count.
	 */
	public String toString() {
		return fraction.toString() + "  has a count of: " + counter;
	}

}
