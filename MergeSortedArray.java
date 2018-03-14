import java.util.Arrays;
/**
 * Class which contains method to merge two sorted arrays
 * @author gkamat
 *
 */
public class MergeSortedArray {

	/**
	 * Merges two sorted arrays
	 * Time Complexity : O(n + nlogn)
	 * Space Complexity : O(1)
	 * @param nums1 Array to be merged into
	 * @param m number of elements in Array 1
	 * @param nums2 2nd Array
	 * @param n number of elements in Array 2
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//Appends Array 2 to array 1
		for(int i=0;i<n;i++) {
			nums1[m+i] = nums2[i];
		}
		
		//Sort the Array 1 after appending
		Arrays.sort(nums1);

	}

}
