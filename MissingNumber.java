import java.util.HashSet;

/**
 * Class whic detects missing number in an array of digits from 1 to n
 * 
 * @author gkamat
 *
 */
public class MissingNumber {

	/**
	 * Returns the missingg number in an array of numbers 
	 * from 0 to n
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * @param nums Array of Numbers
	 * @return Missing Number
	 */
	public int missingNumber(int[] nums) {

		HashSet<Integer> hs = new HashSet<Integer>();

		//Put the numbers in the Hash set
		for (int curr : nums)
			hs.add(curr);

		//From 0-n th enumber absent in the hash set is returned.
		for (int i = 0; i <= nums.length; i++)
			if (!hs.contains(i))
				return i;

		return 0;
	}

}
