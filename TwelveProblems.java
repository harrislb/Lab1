import java.util.ArrayList;


public class TwelveProblems {

	
	/**
	 * Given a particular point in the coordinate plane, computes the 
	 * point's distance from the origin (0,0)
	 * 
	 * For example
	 * 
	 * distanceFromOrigin(-1,0) returns 1
	 * distanceFromOrigin(77,77) returns 108.894
	 * distanceFromOrigin(-3,-4) returns 5
	 * 
	 * Google for Java square root to figure out how to do it 
	 */
	public static double distanceFromOrigin(double x, double y) {
		return 0;
	}
	
	/**
	 * Determine if a given positive integer is perfect.  You can check
	 * http://en.wikipedia.org/wiki/Perfect_number for the formal
	 * definition of perfect numbers BUT this problem can be solved
	 * entirely with if statements because there are very few perfect
	 * numbers in the range of integers.  
	 * 
	 * For example
	 * isPerfect(5) returns false
	 * isPerfect(6) returns true
	 * isPerfect(496) returns true
	 * 
	 * Look at http://en.wikipedia.org/wiki/List_of_perfect_numbers
	 * and recall that Java integers are only in the range
	 * -2,147,483,648 to 2,147,483,647.  So just write ifs
	 * (or a switch statement) that return true for the perfect
	 * integers.
	 * 
	 * If the number is negative, isPerfect should just return false.
	 * 
	 * If you are are feeling confident, you can actually write code
	 * to compute if a number is perfect directly.  No extra credit
	 * for that but you will know in your heart that you are awesome.
	 * 
	 * Requires if statements
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPerfect(int input) {
		return false;
	}
	
	/**
	 * Determine if a given string ends with an uppercase letter.
	 * 
	 * For example:
	 * 
	 * endsWithUppercase("dog") returns false
	 * endsWithUppercase("doG") returns true
	 * endsWithUppercase("") returns false
	 * 
	 * Note that you can check if a particular char is uppercase like this:
	 * 
	 * char myChar = 'A';
	 * if(Character.isUpperCase(myChar)) {
	 * 	System.out.println("uppercase!");
	 * }
	 * 
	 * Note that the empty string is considered not to end with an uppercase
	 * letter.
	 * 
	 * Requires if statements, strings
	 */
	public static boolean endsWithUpperCaseLetter(String input) {
		return false;
	}
	
	/**
	 * Returns the sum of a range of positive integers, starting from the 
	 * first number and going to the last number.  If the first number if 
	 * bigger than the last number, the sum is 0.
	 * 
	 * For example
	 *  sumRange(1,3) returns 6 (1 + 2 + 3)
	 *  sumRange(10,11) returns 21 (10 + 11)
	 *  sumRange(3,3) returns 3 (3)
	 *  sumRange(3,1) returns 0
	 * 
	 * You don't need to worry about negative inputs.
	 * 
	 * Requires: for loops
	 */
	public static int sumOfRange(int start, int end) {
		return 0;
	}
	
	/**
	 * Given two strings of the same length, returns the index at which the
	 * strings first differ.  If the strings are equal the function should
	 * return -1.
	 * 
	 * For example:
	 *   firstDifference("abc", "axy") returns 1
	 *   firstDifference("aby", "abz") returns 2
	 *   firstDifference("foo", "bar") returns 0
	 *   firstDifference("ninja", "ninja") returns -1
	 *   firstDifference("","") returns -1
	 * 
	 * You don't need to worry about inputs of different lengths.
	 * 
	 * Hint: if you want to compare the two strings to see if they
	 * are equal.  For example, something like this:
	 * 
	 * if(one.equals(two)) return -1;
	 * 
	 * Individual characters however, should be compared with ==
	 * char a = one.charAt(0);
	 * char b = two.charAt(0);
	 * if(a == b) {
	 *   System.out.println("First characters are equal");
	 * }
	 * 
	 * Requires: for loops or while loops, strings
	 */
	public static int firstDifference(String one, String two) {
		return 0;
	}
	
	/**
	 * Given one string, return the most common character.
	 * 
	 * Example:
	 *   mostCommonCharacter("aaab") returns 'a'
	 *   mostCommonCharacter("abcbcdc") returns 'c'
	 * 
	 * You can assume that your string will not be empty and that
	 * one character will be more common than all the others (i.e. there
	 * won't be a tie for the most common character)
	 * 
	 * Your solution should use a pair of nested for loops.  You might be
	 * tempted to use something like python's dictionary here, but
	 * we'll save that till later when we cover hashmaps.
	 * 
	 * Requires: for loops, strings
	 */
	public static char mostCommonCharacter(String input) {
		return '?';
	}
	
	
	/**
	 * Finds the fist number in an array divisible by 77 and
	 * returns it. 
	 * 
	 * If no number is found, the function returns -1
	 * 
	 * Example:
	 *  firstDivisibleBy77({88,24,154,77}) returns 154
	 *  firstDivisibleBy77({5929, 280}) returns 5829
	 *  firstDivisibleBy77({1,2,3,4}) returns -1
	 * 
	 * Don't forget about the modulus operator (%)
	 */
	public static int firstDivisbleBy77(int[] numbers) {
		return 0;
	}
	
	
	/**
	 * Creates an array of all the powers of two, up to (and including)
	 * the given exponent starting at 2^0.
	 * 
	 * If the given exponent is less than zero, return an empty array.
	 * You can do this by saying "return new int[0];"
	 * 
	 * For example:
	 *   powersOfTwo(3) returns {1,2,4,8}
	 *   powersOfTwo(0) returns {1}
	 *   powersOfTwo(-66) returns {}
	 * 
	 * Requires: arrays, for loops
	 */
	public static int[] powersOfTwo(int maxExponent) {
		return null;
	}
	
	/**
	 * Given two arrays of integers that are the same length, returns
	 * a new array that contains the pairwise max of the corresponding
	 * elements of the original arrays (i.e. the larger of the two numbers
	 * in that slot in the original arrays)
	 * 
	 * For example:
	 *   maxArray({2,10},{1,200}) returns {2,200}
	 *   maxArray({-5, 60, 7},{-10,400,8}) returns {-5,400,8} 
	 *   
	 *   Requires: arrays, for loops
	 */
	public static int[] maxArray(int[] one, int[] two) {
		return null;
	}
	
	/**
	 * 
	 * Given two arrays, count the number of times the first array occurs
	 * in the second array.  You can assume that the first array is shorter
	 * than the second.
	 * 
	 * For example:
	 *   timesOccur({1,2}, {7,1,2,7,7,7,1,2,7}) returns 2
	 *   timesOccur({1,1}, {1,1,1,3} returns 2 (in the 0th and 1st position)
	 *   timesOccur({1,2}, {1,3,2,1} returns 0
	 * 
	 *  Requires: arrays, nested for loops
	 */
	public static int timesOccur(int[] shorter, int longer[]) {
		return 0;
	}
	
	/**
	 * Given an arraylist of strings, return a new list where
	 * anytime the world "double" appears in the original list
	 * it is doubled in the new list.
	 * 
	 * For example:
	 *   doubleDouble(["foo","double"]) returns ["foo","double","double"]
	 *   doubleDouble(["a","double","b","double","c"]) returns ["a","double","double","b","double","double","c"]
	 *   
	 * Be careful not to modify the original list.  Start by creating a new
	 * output list that holds the results!  E.g.
	 * 
	 * ArrayList<String> output = new ArrayList<String>();
	 * 
	 * When you are comparing strings, be sure to use .equals and not ==
	 * Eg.
	 * if(currentString .equals("double")) { stuff }
	 * 
	 */
	public static ArrayList<String> doubleDouble(ArrayList<String> input) {
		return null;
	}
	
	/**
	 * Given an arraylist of strings, return a new arraylist of strings
	 * containing all the 3 letter strings in the original list
	 * 
	 * For example:
	 *   threeCharacterStrings(["foo","a","bar"]) returns ["foo","bar"]
	 *   threeCharacterStrings(["foo","a","foo", "qq"]) returns ["foo","foo"]
	 *   threeCharacterStrings([]) returns []
	 */
	public static ArrayList<String> threeCharacterStrings(ArrayList<String> strings) {
		return null;
	}
}
