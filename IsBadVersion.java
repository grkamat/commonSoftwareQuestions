/**
 * 
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, 
 * all the versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
 * which causes all the following ones to be bad.
 * This class contains method to figure out the first bad version
 * 
 * @author grkamat
 *
 */
public class IsBadVersion {
	/**
	 * Finds the 1st bad version in a given number of versions
	 * using Binary search.
	 * @param n number of versions present
	 * @return first occurrence of a bad version
	 */
	public int firstBadVersion(int n) {
		//Upper bound
		int ub = n;
		
		//Lower bound
		int lb = 1;
		
		//Perform binary search.
		while(lb<ub) {
			int mid = lb +  (ub-lb)/2;
			if(isBadVersion(mid))
				ub = mid;
			else {
				//Already checked the mid so move forward and add one 
				lb = mid + 1;
				
			}
				
				
		}
		
		return lb; 
        
    }
	
	boolean isBadVersion(int version) {
		return false;
	}
}
