/**
 * Contains method to check if a given B-Tree
 * has any path to the given required sum 
 * using recursion
 * 
 * @author grkamat
 *
 */
public class HasPathSum {
	
	
	/**
	 * Checks if the given sum is present for any of the paths.
	 * Time Complexity : O(n)
	 * Space Complexity : O(n) ...due to recursion
	 * @param root Sub node of the tree
	 * @param sum desired sum for a given sub tree node
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		//Base Condition
		if(root == null)
			return false;
		
		//If there is just one node(Base)
		if(root.left == null && root.right == null && (sum - (root.val)) == 0)
			return true;
		
		//Updating the sum value.
		sum = sum - root.val;
		
		//Check for sum in the left sub tree
		boolean leftSum = hasPathSum(root.left, sum);
		
		//Check for sum in the right sub tree
		boolean rightSum = hasPathSum(root.right, sum);
		
		return leftSum || rightSum;
        
    }

}
