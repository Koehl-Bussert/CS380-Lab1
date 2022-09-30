// Koehl Bussert
// 9/26/2022
// CS380 Lab 1

package cs380package;

public class Lab1 {

	public static void main(String[] args) {
		int num1 = 12345;								// Given number
		String s = "" + num1;							// Convert number to string
		
		for (int i = s.length () - 1; i >= 0; i--) {	// Loop through digits in the string
			s = s + s.charAt (i);						// Take the last digit and place it at the end of the string
		}												// Decrement i by one, moving the pointer closer to 0
		
		s = s.substring (s.length () / 2);				// Now that the number is mirrored, remove the first half to get the reversed integer
		
		num1 = Integer.parseInt (s);					// Parse the string back into an integer
		
		System.out.println (num1);						// Print out the reversed number
		
	}

}
