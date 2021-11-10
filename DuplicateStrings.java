import java.util.ArrayList;

/**
 * @author Israel
 *
 * @date Nov 10, 2021
 * 
 */
public class DuplicateStrings {

	public static void main(String[] args) {
		// List of strings
		String[] fruits = { "banana", "orange", "mango", "banana", "apple", "mango", "apple", "banana" };
		// Invoke a method to remove duplicate string
		removeDuplicatesString(fruits);

	}

	// This method outputs a new list after removing duplicate string
	public static void removeDuplicatesString(String[] fruits) {
		
		// Created temp ArrayList to store none-duplicate strings
		ArrayList<String> temp = new ArrayList<String>();
		
		// Iterate through the list to find duplicates strings
		for (int i = 0; i < fruits.length; i++) {
			
			// Check if the element doesn't exist in the temp array list
			if (!(temp.contains(fruits[i]))) {
				// If element is not found in the temp array list add the element
				temp.add(fruits[i]);
				// S.out the element
				System.out.println(fruits[i]);
			}
			
			// S.out duplicate values only
			// else {
			//		System.out.println("Duplicate " + words[i]);
			// }

		}

	}

}
