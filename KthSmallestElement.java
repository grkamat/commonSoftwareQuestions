/**
 * Class that contains method to find the kth smallest element in BST.
 * 
 * @author grkamat
 *
 */
public class KthSmallestElement {

	// Global variable for the count
	int count;

	// Global variable for the reseult
	int result;

	/**
	 * Method finds kth smallest Element in the Linked List using In-order Traversal
	 * 
	 * @param root Root node of the BST
	 * @param k Desired smallest value
	 * @return The value of the kth smallest element
	 */
	public int kthSmallest(TreeNode root, int k) {
		helperTraverse(root, k);

		return result;
	}

	/**
	 * Helper function for inorder traversal
	 * @param current Current TreeNode
	 * @param k Desired Kth smallest element
	 */
	public void helperTraverse(TreeNode current, int k) {

		// Base case
		if (current == null)
			return;

		// BST has left nodes < right nodes, so searching left first
		helperTraverse(current.left, k);

		// Increase the count every time a left node is passed
		count = count + 1;

		// If the count is equal to the desire, reset the result
		if (count == k)
			result = current.val;

		// If not found left then move right
		helperTraverse(current.right, k);

	}

}
