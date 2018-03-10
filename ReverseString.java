/**
 * Class which contains solution to reverse a String.
 * @author grkamat
 *
 */
class ReverseString{
	
	/**
	 * Method which reverses a given input String.
	 * @param s Input String to reverse
	 * @return reversed string
	 */
    
    public String reverseString(String s) {
        //Create a Char array for the letters in a given String
        char []charArray = s.toCharArray() ;
        
        //Create a new Array to store the reversed String
        char []newcharArray = new char[charArray.length];
            int count = charArray.length;
            //Transfer data in Reverse order to the String
            for (int i=0;i<charArray.length;i++){
                newcharArray[count-1] = charArray[i];
                count = count -1;
            }
        //Convert Char Array back to String.
        String retString = new String(newcharArray);
        
        return retString;
    }
}