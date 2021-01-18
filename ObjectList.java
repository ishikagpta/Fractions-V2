/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Fraction V2, ObjectList
 * @date 10/17/20
 */

/**
 * The ObjectList class takes in objects and stores them in its Object type
 * array and does different functionalities with them.
 *
 */
public class ObjectList {

	// This creates an array of type Object size 0.
	private Object[] array = new Object[0];

	/**
	 * This method takes in objects and stores them in the Object array. It creates
	 * a new array of length one size bigger than the old array and stores the
	 * values from old array into the new array and then sets the old array equal to
	 * the new array.The old array than stores the Object at the last index.
	 */
	public void add(Object n) {

		Object[] newArray = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
		array[array.length - 1] = n;

	}

	/**
	 * This method is an accessor method that retrieves a FractionCounter object
	 * from the Object array at any index
	 */
	public FractionCounter get(int i) {

		return (FractionCounter) array[i];

	}

	/**
	 * This method returns the length of the Object array
	 */
	public int length() {
		return array.length;
	}

	/**
	 * This toString method cycles through the Object array and stores the elements
	 * in retVal and then returns them
	 */
	public String toString() {
		String retVal = "";
		for (int i = 0; i < array.length; i++) {
			retVal = retVal + array[i] + "\n";
		}

		return retVal;
	}

}
