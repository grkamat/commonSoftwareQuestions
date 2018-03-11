/**
 * Class which contains methods to reverse an integer.
 * @author grkamat
 *
 */
class ReverseInteger {
	/**
	 * Method reverses signed integer
	 * Time Complexity:o(n)
	 * Space Complexity:o(1)
	 * @param x integer to be reversed
	 * @return reversed integer
	 */
	public int reverse(int x) {

		// Saving the sign of the integer
		int sign = 1;
		if (x < 0)
			sign = -sign;

		// Taking absolute value of the number
		x = Math.abs(x);

		// Output of the number
		int out = 0;
		
		// Reversing the number
		while (x != 0) {
			
			//Checking for Overflow
			try {
				int mul = Math.multiplyExact(out, 10);
				out = Math.addExact(mul, x % 10);
			} catch (ArithmeticException e) {
				return 0;
			}
			x = x / 10;
		}

		// Output after assigning the original sign
		int result = out * sign;

		return result;
	}
}
