/**
 * Class which contains method
 * to find the Hamming distance between 
 * 2 numbers
 * @author gkamat
 *
 */
public class HammingDistance {
	
/**
 * Counts the number of bits 
 * that are different in 2 numbers
 * using xor
 * 
 * @param x Number 1
 * @param y Number 2
 * @return Hamming Distance
 */
public int hammingDistance(int x, int y) {
	//XOR the number
	int answer = x^y;
	
	//Count the number of Bits.
	return Integer.bitCount(answer);
        
    }

}
