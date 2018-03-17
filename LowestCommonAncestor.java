/**
 * Class that contains method to find 
 * the lowest common ancestor 
 * in a binary tree
 * @author grkamat
 *
 */
public class LowestCommonAncestor {
	
/**
 * Finds lowest common ancestor of two nodes
 * in a Binary Tree	
 * Time Complexity : O(log(n))
 * Space Complexity : O(1)
 *  
 * @param root Root of the Binary Tree
 * @param p Node 1
 * @param q Node 2
 * @return Lowest Common Ancestor Node
 */
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	if(root == null) return root;
	
	while(true) {
		
		/*
		 * Detecting if the ancestor is in the right or left sub tree
		 * If cannot go any deeper
		 * means the root pointing to the ancestor
		 */
		if(root.val-p.val>0 && root.val -q.val>0)
			root = root.left;
		
		else if(root.val-p.val<0 && root.val -q.val<0)
			root = root.right;
		
		else
			
			return root;
		
	}
	
	
	
	
        
    }

}
