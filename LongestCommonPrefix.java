/**
 * Class that contains method to find the longest common prefix
 * 
 * @author gkamat
 *
 */
public class LongestCommonPrefix {

	/**
	 * Finds longest common prefix
	 * in an array of Strings
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * @param strs Array of strings
	 * @return Longest Common Prefix
	 */
	public String longestCommonPrefix(String[] strs) {
		
		String prefix = strs[0];
		
		//Iterating through all strings
		for(int i = 0; i< strs.length; i++) {
			//Searching in the string till prefix is found
			while(strs[i].indexOf(prefix) != 0) {
				//Slicing to update prefix from initial
				prefix = prefix.substring(0, prefix.length() - 1);
				if(prefix.length() == 0)
					return "";
			}
		}
		
		return prefix;
	}

}
