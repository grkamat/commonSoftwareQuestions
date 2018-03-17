import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Class which contains method
 * to find unique sets of 3 whose sum
 * in 0 in an Array of numbers
 * @author grkamat
 *
 */
public class ThreeSum {

	/**
	 * Method to detect unique lists(3 elements)
	 * whose sum is 0
	 * Time Complexity : O(n^2 + nlogn)
	 * Space Complexity : O(n)
	 * @param nums Input Array of Numbers
	 * @return List of unique sets whose sum is 0
	 */
public List<List<Integer>> threeSum(int[] nums) {
	
	//Sort the array
	Arrays.sort(nums);
	
	List<List<Integer>> output = new ArrayList<List<Integer>>();
	
	HashSet<List<Integer>> hashset = new HashSet<List<Integer>>();
	
	
	for(int i = 0;i<nums.length;i++) {
		//Having two pointers at the start and end
		for(int j=i+1,k=nums.length-1;j<k;) {
			//If sum = 0
			if(nums[i]+nums[j]+nums[k]==0) {
				List<Integer> thrset = new ArrayList<Integer>();
				thrset.add(nums[i]);
				thrset.add(nums[j]);
				thrset.add(nums[k]);
				//If not already present in the hashset then add
				if(hashset.add(thrset))
					output.add(thrset);
				//Update pointers
				j = j+1;
				k = k-1;
				
			}
			//If sum < 0 update front pointer
			if(nums[i]+nums[j]+nums[k]<0)
				j=j+1;
			//If sum > 0 update back pointer
			if(nums[i]+nums[j]+nums[k]>0)
				k=k-1;
		}
	}
	
     return output;  
    }

}
