import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to determine 
 * contains method to determine
 * if the input is a valid Anagram. 
 * @author gkamat
 *
 */
public class ValidAnagram {
	
	 /**
	 * Method to determine if given string is anagram
	 * of another
	 * Time Complexity : O(n) 
     * Space Complexity : O(1)
	 * @param s reference string
	 * @param t evaluating string
	 * @return true if anagram and false if not an anagram
	 */
		
	public boolean isAnagram(String s, String t) {
	    
	    //If strings empty return true
		if(s.isEmpty() && t.isEmpty())
			return true;
	    //If lengths mismatch return false
	    if(s.length()!=t.length())
			return false;
	    //create an array of counters for eact letter
		int[] record = new int[26];
	    
	    //increment the counter for each char in reference string
		for(int i=0;i<s.length();i++) {
			int index = s.charAt(i)-'a';
			record[index]=record[index] + 1;
		}
		
	    //Reduce the counter for each char in evaluating string
		for(int i=0;i<t.length();i++) {
			int index = t.charAt(i)-'a';
			record[index]=record[index] - 1;
	        //If there is a mismatch then the counter will become negative
			if(record[index] < 0)
				return false;
			
		}	
		return true;
	}
}
