/**
 * Class which contains a method to figure out if it is power of 3 without
 * recursion/loops
 * 
 * @author grkamat
 *
 */
public class PowerOfThree {

	/**
	 * Finds if the number is power of 3 using
	 * logarithms
	 * Time Complexity : O(logn)
	 * 
	 * @param n input integer
	 * @return true if its power of 3 and false otherwise.
	 */
	public boolean isPowerOfThree(int n) {

		//For 1 return true.
		if (n == 1)
			return true;

		//using the logarithmic formula for common base
		double examine = Math.log10(n) / Math.log10(3);
		
		//Converting the answer to long
		long examineLong = (long) examine;

		//Checking for a remainder.
		if (examine / examineLong == 1)
			return true;
		else
			return false;

	}

}
