import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


/**
 * Class to carry out pre-order traversal.
 * @author grkamat
 *
 */
class PreOrder{
	
	/**
	 * Pre Order Traversal of Binary Tree
	 * @param root root node of the tree
	 * @return List which stores values in pre-order
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
        
		//List of Integers which store value in pre-order
		List<Integer> retPre = new ArrayList<Integer>();
		
		//call helper function to recursively traverse the tree
		preOrder(root,retPre);
		
		return retPre;
        
    }
	/**
	 * Helper method to recursivelly add Integer values to the list.
	 * @param root input TreeNode
	 * @param retPre List to append the data in pre-order
	 */
	public static void preOrder(TreeNode root,List<Integer> retPre) {
		
		//Base Condition for recursion.
		if(root == null)
	        return;
		//Add root to list
		retPre.add(root.val);
		
		//Traverse Left Tree
	    preOrder(root.left, retPre);
	    
	    //Traverse Right Tree
	    preOrder(root.right, retPre);
		
	}
	
}