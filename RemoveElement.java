/**
 * Class that contains method to remove
 * given element from Array in place
 * @author gkamat
 *
 */
public class RemoveElement {
	
/**
 * Removes the given value from array
 * in place
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * @param array Input Array 
 * @param val Value to be removed
 * @return new Size of Array
 */
	
public int removeElement(int[] array, int val) {
	//
	int count = 0;
	for(int i=0; i<array.length;i++)
		//Shift as long as the required elemnt is not found
		if(array[i]!=val) {
			array[count] = array[i];
			//Update size
			count ++;
		}
	
	return count;
    }
	
   
}
