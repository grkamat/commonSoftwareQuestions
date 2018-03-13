/**
 * Class to recursively check if given BST is Symmetric
 * @author grkamat
 *
 */
public class IsSymmetric {
	
/**
 * Checks if two nodes are symmetric	
 * Time Complexity: O(n)
 * Space Complexity: O(n) ...recursive helper function
 * @param root Root Node of the Tree
 * @return True if tree is Symmetric and false otherwise.
 */
public boolean isSymmetric(TreeNode root) {
	
	return isSymmetricHelper(root,root);
        
    }


/**
 * Helper function which checks if the two nodes passed 
 * are mirrors of each other or no
 * @param left TreeNode
 * @param right  TreeNode
 * @return true if mirror and false if not
 */
public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
	
	if (left == null && right == null)
		return true;
	if(left == null || right == null) 
		return false;
	if(left.val != right.val)
		return false;
	return isSymmetricHelper(left.right,right.left) && isSymmetricHelper(left.left,right.right);
}

}
