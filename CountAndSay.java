/**
 * Class that contains method to 
 * produce a series that count
 * and say
 * 1
 * 11
 * 21
 * 1211
 * 111221
 * .......
 *
 * @author grkamat
 *
 */
public class CountAndSay {
	/**
	 * Method that count and says numbers
	 * at each level up to level n
	 *  Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * @param n Input string which tells the level
	 * @return String representation of count and say of level n
	 */
	public String countAndSay(int n) {
		
		String input = "1";
		//Start from the next number as 1st input = 1 always
		for(int i = 1;i<n;i++)
			input = helper(input);
		
		return input;
	      
	    }
	
	/**
	 * Helper function to count and say for each level
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * @param input String which represents String of current level
	 * @return Count and Say of that level
	 */
	public String helper(String input) {
		char c = input.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)==c)
				count = count + 1;
			else {
				
				sb.append(count);
				sb.append(c);
				c = input.charAt(i);
				count = 1;
				
			}
		}
		sb.append(count);
		sb.append(c);
		
		return sb.toString();
		
	}

}
