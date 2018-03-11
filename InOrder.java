import java.util.ArrayList;
import java.util.List;

/**
 * Class to carry out In-Order traversal.
 * (left-root-right)
 * @author grkamat
 *
 */
public class InOrder {
	
	/**
	 * In Order Traversal of Binary Tree
	 * (left-root-right)
	 * @param root root node of the tree
	 * @return List which stores values in pre-order
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
        
		//List of Integers which store value in In-order
		List<Integer> retIn = new ArrayList<Integer>();
		
		//call helper function to recursively traverse the tree
		inOrder(root,retIn);
		
		return retIn;
        
    }
	/**
	 * Helper method to recursively add Integer values to the list.
	 * @param root input TreeNode
	 * @param retPre List to append the data in In-order
	 */
	public static void inOrder(TreeNode root,List<Integer> retIn) {
		
		//Base Condition for recursion.
		if(root == null)
	        return;
		
		//Traverse Left Tree
	    inOrder(root.left, retIn);
	    
	    //Add root to list
	  	retIn.add(root.val);
	  		
	    //Traverse Right Tree
	    inOrder(root.right, retIn);
		
	}

}
