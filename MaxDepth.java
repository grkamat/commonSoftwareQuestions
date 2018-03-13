/**
 * Class to find out maximum depth of 
 * a given binary tree
 * using Bottom up Approach
 * @author grkamat
 *
 */
public class MaxDepth {
	
	 /**
	  * Finds max depth of a tree
	  * Space Complexity: O(n)... as recursion uses extra space
	  * Time Complexity: O(n)
	  * @param root Root Node of a given Tree
	  * @return maximum depth of the tree.
	  */
	 public int maxDepth(TreeNode root) {
		 
		 //When the bottom most node is reached return 0 as it has no children
		 if(root == null)
			 return 0;
		 
		 //Recursively find the depth of the left sub tree
		 int leftDepth = maxDepth(root.left);
		 
		 //Recursively find the depth of right sub tree
		 int rightDepth = maxDepth(root.right);
		 
		 // Return the max of 2 depths (add one for incrementing the depth).
		 //Return the depth of the sub tree rooted at that node.
		 return Math.max(leftDepth, rightDepth) + 1;
		 
	        
	    }

}
