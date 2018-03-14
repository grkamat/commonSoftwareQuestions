import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOf2Arrays2 {
	
	/**
	 * Checks the intersection of 2 arrays.
	 * By putting the 1st array in a hashmap as key(number):value(count)
	 * checks the hashmap while iterating through the 2nd count and updates count 
	 * every time the number is encountered.
	 * 
	 * @param nums1 Parent Array
	 * @param nums2 Sub Array
	 * @return Returns intersecting subArray of the two Arrays
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mhi = new HashMap<Integer,Integer>(); 
        ArrayList<Integer> al = new ArrayList<Integer>();
        //Entering numbers into hashmap
        /**
        If not present we add the value to hashmap
        if present we increase the value by 1
        **/
        for(int i=0;i<nums1.length;i++){
            if(mhi.containsKey(nums1[i])){
                int val = mhi.get(nums1[i]);
                mhi.put(nums1[i],val+1);
            }     
            else
                mhi.put(nums1[i],1);
        }
        /**
        adding nums2 to array list
        while checking the map
        **/
        for(int i=0;i<nums2.length;i++){
            
            if(mhi.containsKey(nums2[i]) && mhi.get(nums2[i])>0){
                al.add(nums2[i]);
                int val = mhi.get(nums2[i]) ;
                mhi.put(nums2[i],val-1);
            }

        }
        
        //Converting arrayList to array.
        int []a = new int[al.size()];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        
        return a;
    }

}
