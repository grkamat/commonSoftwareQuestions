/**
 * 
 * @author grkamat
 *
 */
public class ReverseWordsInString3 {
	
public String reverseWords(String s) {
	
	String[] array = s.split(" ");
	
	for(int i=0;i<array.length;i++) {
		
		StringBuilder sb = new StringBuilder(array[i]);
		sb.reverse();
		array[i] = sb.toString();
	}
	String str = String.join(" ", array);
	return str;
        
    }

}
