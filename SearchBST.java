/**
 * Class that searches in an element in
 *  BST
 * @author gkamat
 *
 */
public class SearchBST {
	
/**
 * Search a given element 
 * in BST
 * Time Complexity: O(log N)
 * Space Complexity : O(1)	
 * @param root
 * @param val
 * @return
 */
public TreeNode searchBST(TreeNode root, int val) {
	
	//base Condition
	if(root == null || root.val == val)
		return root;
	
	//if value< root vale then move left otherwise move right
	if( val < root.val)
		return searchBST(root.left,val);
	else
		return searchBST(root.right,val);
        
        
    }

}
