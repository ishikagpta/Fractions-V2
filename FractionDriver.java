
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Fraction V2, FractionDriver
 * @date 10/17/20
 */
import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

/**
 * 
 * @version 1.0 This FractionDriver class is the driver class that takes in
 *          Fraction values from a file and creates a FractionCounter object to
 *          keep track of its repeated occurrences and then prints out an
 *          ObjectList of unique FractionCounters that prints the fraction and
 *          its count.
 *
 */

public class FractionDriver {
	/**
	 * In this main method, I take string input from each line of fractions in the
	 * fractions.txt file and split them. If the denominator is 0, I print out an
	 * error statement. Else, I set the fraction to be of Object Fraction and see if
	 * it is equal to any other fraction in the FractionCounter objects in the array
	 * of FractionCounter objects in the ObjectList array. If so, I up the count of
	 * the FractionCounter by one. If not, I insert the Fraction as a
	 * FractionCounter object in the ObjectList array and then in the end I print
	 * out the array of ObjectList
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// creates an object named fractionList of type ObjectList
		ObjectList fractionList = new ObjectList();

		// I used this try catch statement to read through a valid fractions.txt file
		// full of fractions. I catch the file and print an exception if it is not a
		// fractions.txt file
		try {
			File f = new File("fractions.txt");
			BufferedReader b = new BufferedReader(new FileReader(f));
			String readLine = "";

			// I use this while statement to continue to perform actions on each line of
			// fractions in the fraction file
			// I split the fraction and separate the numerator and denominator
			while ((readLine = b.readLine()) != null) {
				String[] str = readLine.split("/");
				int num = Integer.parseInt(str[0]);
				int den = Integer.parseInt(str[1]);

				// if the denominator is 0, I print this error statement out
				if (den == 0) {
					System.out.println("Fraction: " + readLine
							+ " has denominator zero. Hence this fraction is ignored and not been calculated.");

				} else {

					// I create an object of Fraction that uses the Fraction constructor that takes
					// in a numerator and denominator
					Fraction newFraction = new Fraction(num, den);

					// I use the boolean counting that is set to true to see if the fraction needs
					// to be inserted or not
					// into the ObjectList array. So first I iterate through the ObjectList array of
					// FractionCounter objects and see if my current fraction is the same as any of
					// the FractionCounter objects in my ObjectList array. If it is, I set counting
					// to false and up the
					// count in the FractionCounter object. If it is not, I go down to the if
					// statement where counting is still true
					boolean counting = true;
					for (int i = 0; i < fractionList.length(); i++) {
						FractionCounter current = fractionList.get(i);
						if (current.CompareandIncrement(newFraction)) {
							counting = false;
							break;
						}
					}

					// If counting is true, I create a FractionCounter object for the fraction and
					// insert it into my ObjectList array
					if (counting == true) {
						FractionCounter newCurrent = new FractionCounter(newFraction);
						fractionList.add(newCurrent);
					}

				}
			}

			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// I print out the toString of the ObjectList array full of FractionCounter
		// objects
		System.out.println(fractionList.toString());
	}
}
