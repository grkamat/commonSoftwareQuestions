/**
 * Class which has method that checks if a given number is Palindrome
 * 
 * @author grkamat
 *
 */
public class NumberIsPalindrome {

	/**
	 * Chacks if the given number is Palindrome
	 * 
	 * @param x
	 *            Input Integer
	 * @return True if String is Palindrome and False otherwise.
	 */
	public boolean isPalindrome(int x) {

		StringBuilder sb = new StringBuilder(String.valueOf(x));
        StringBuilder sbini = new StringBuilder(String.valueOf(x));
        
        //Reverse String and then Compare.
		sb.reverse();
        
    
		if (sbini.toString().equals(sb.toString()))
			return true;
		else
			return false;


	}

}
