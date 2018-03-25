import java.util.Arrays;

/**
 * 
 * @author grkamat
 *
 */
public class KthLargestElement {

	/**
	 * Find the kth largest element in an array. Time Complexity: O(nlogn) Space
	 * Complexity: O(1)
	 * 
	 * @param nums
	 *            Input elements
	 * @param kth
	 *            element
	 * @return Kth largest Element
	 */
	public int findKthLargest(int[] nums, int k) {

		// Sort the array
		Arrays.sort(nums);

		// position in the sorted array
		return nums[nums.length - k];

	}

}
