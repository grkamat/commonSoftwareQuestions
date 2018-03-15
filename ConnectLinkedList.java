/**
 * Converts Binary tree
 * as follows
 * 1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL   
 *   
 * @author grkamat
 *
 */
/**
 * public class TreeLinkNode { int val; TreeLinkNode left, right, next;
 * TreeLinkNode(int x) { val = x; } }
 * 
 */
public class ConnectLinkedList {
	/**
	 * Method to connect the left nodes of linked list to the right at the same
	 * level
	 * 
	 * @param root
	 */
	public void connect(TreeLinkNode root) {

		if (root == null)
			return;
		if (root.left == null)
			return;

		helperConnect(root.left, root.right);
	}

	/**
	 * Helper functions to connect the left sub tree and right subtree
	 * 
	 * @param n1
	 *            left subtree node
	 * @param n2
	 *            right sub tree node
	 */
	public void helperConnect(TreeLinkNode n1, TreeLinkNode n2) {

		// Connecting the next node of left to the right node.
		n1.next = n2;

		if (n1.left != null) {
			// Creating link between two nodes
			helperConnect(n1.right, n2.left);

			// Connect the left and the right nodes of a node 1
			helperConnect(n1.left, n1.right);

			// Connect the left and the right nodes of a node 2
			helperConnect(n2.left, n2.right);

		}

	}

}
