/**
 * Class which contains the methods to check if the given 
 * Tree is Binary Search Tree
 * using recursion.
 * @author grkamat
 *
 */
public class IsValidBST {
	
/**
 * Checks if the given Tree is BST.
 * Time Complexity : O(n)
 * Space Complexity : O(n)	
 * @param root
 * @return true if it's valid BST
 */
public boolean isValidBST(TreeNode root) {
        
        return isValidBSTHelper(root,Long.MAX_VALUE,Long.MIN_VALUE);
        
    }
/**
 * Helper function to check if the value of Tree and it's children is in bounds.
 * @param root
 * @param maxValue
 * @param minValue
 * @return true if sub tree is valid BST
 */
public boolean isValidBSTHelper(TreeNode root, long maxValue, long minValue) {
	
	//Base Condition
	if(root == null)
		return true;
	//Check if the value of the root and and its left and right nodes is in bounds
	if(root.val > minValue && root.val < maxValue && isValidBSTHelper(root.left,root.val,minValue) && isValidBSTHelper(root.right,maxValue,root.val))
		return true;
	else 
		return false;
}

}
