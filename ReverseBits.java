/**
 * Java class to reverse bits of 32 bit unsigned number.
 * @author grkamat
 *
 */
public class ReverseBits {
   
	/**
	 * Method to reverse the bits of a given integer.
	 * @param n number to be reversed
	 * @return reversed bit integer
	 */
    public int reverseBits(int n) {
        //Initialize the output
        int outPut = 0;
        int addNum;
        
        for(int i=0;i<32;i++){
            
            //Find the last bit
            addNum = n & 1;
            //Drop the last bit 
            n = n >> 1;
            
            //Left shift the resulted output to make space for the last bit
            outPut = outPut << 1;
            
            //If the last bit was one then add it to the outPut else leave it as is
            if(addNum == 1)
                outPut = outPut + 1;
            
        }
        
        return outPut;
    }
}
