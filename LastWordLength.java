/**
 * Class that
 * contains method to find the
 * length of the last word
 * in a given string
 * @author grkamat
 *
 */
public class LastWordLength {

	/**
	 * Method to find the length of the last 
	 * word of a given String
	 * Time Complexity : O(n)( internal operation for split by " ")
	 * Space Complexity : O(n)
	 * @param s Input String
	 * @return Length of the last word
	 */
public int lengthOfLastWord(String s) {
	
	s = s.trim();
	if(s.isEmpty()) 
		return 0;
	String lastWord = s.split(" ")[s.split(" ").length-1];
	
	return lastWord.length();
        
    }

}
