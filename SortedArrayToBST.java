/**
 * 
 * Class which contains method to covert a sorted array to
 * BST using recurssion
 * 
 * @author grkamat
 *
 */
public class SortedArrayToBST {
	
/**
 * Methos to convert a given sorted array into Binary sub-tree
 * @param nums Sorted Array of numbers
 * @return Root Node of the BST
 */
public TreeNode sortedArrayToBST(int[] nums) {
        
	return sortedArrayToBSTHelper(nums,0,nums.length -1 );
	
    }
/**
 * Helper function to create sub trees which are binary trees.
 * @param nums Sorted Array of Numbers to be converted to Binary Search Tree
 * @param lb lowerBounds of comparison
 * @param ub upperBounds for comparison
 * @return RootNode of the  sub BST
 */
public TreeNode sortedArrayToBSTHelper(int[] nums,int lb, int ub) {
	
	//Base condition
	if(lb > ub)
		return null;
	
	//Finding the middle element in array(avoiding overflow)
	int mid = lb + (ub-lb)/2;
	
	//creating the root node.
	TreeNode node= new TreeNode(nums[mid]);
	
	//Creating the left sub-tree
	node.left = sortedArrayToBSTHelper(nums, lb , mid - 1);
	
	//creating the right sub-tree
	node.right = sortedArrayToBSTHelper(nums, mid + 1, ub);
	
	return node;
	
	
}


}
