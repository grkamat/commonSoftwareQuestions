import java.util.ArrayList;
import java.util.List;
/**
 * Class for post order traversal of Binary tree.
 * @author grkamat
 *
 */
public class PostOrder {
	/**
	 * Method to carry out post order traversal of Binary tree.
	 * LEFT-RIGHT-ROOT
	 * @param root
	 * @return List of values in Post-Order
	 */
	public List<Integer> postorderTraversal(TreeNode root) {

		// List of Integers which store value in post-order.
		List<Integer> retPost = new ArrayList<Integer>();

		// call helper function to recursively traverse the tree.
		postOrder(root, retPost);

		return retPost;
	}

	/**
	 * Helper method to recursively add Integer values to the list. LEFT-RIGHT-ROOT
	 * 
	 * @param root
	 *            input TreeNode
	 * @param retPost
	 *            List to append the data in post-order
	 */
	public static void postOrder(TreeNode root, List<Integer> retPost) {

		// Base Condition for recursion.
		if (root == null)
			return;

		// Traverse Left Tree.
		postOrder(root.left, retPost);

		// Traverse Right Tree.
		postOrder(root.right, retPost);

		// Add root to list.
		retPost.add(root.val);

	}

}
