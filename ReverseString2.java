import java.util.List;
import java.util.ArrayList;
/**
 * Class that contains a method to reverse a String
 * @author gkamat
 *
 */
public class ReverseString2 {

/**
 * Reverses the first k characters for every 2k 
 * characters counting from the start of the string.
 * @param s Input String
 * @param k Number of Characters 
 * @return Every Kth set of chars reversed in the String
 */
public String reverseStr(String s, int k) {
	
	List<String> strings = new ArrayList<String>();
	int index = 0;
	while (index < s.length()) {
	    strings.add(s.substring(index, Math.min(index + k,s.length())));
	    index += k;
	}
	
	for(int i=0;i<strings.size();i++) {
		if(i%2 == 0) {
			StringBuilder sb = new StringBuilder(strings.get(i));
			sb.reverse();
			strings.set(i, sb.toString());
		}
	}
	
	String str = String.join(" ", strings);
	return str;
        
    }

}
