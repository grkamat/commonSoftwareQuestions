import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Class which contains method for zigzag traversa in Binary tree
 * 
 * @author gkamat
 *
 */
public class ZigZagTraversalBT {

	/**
	 * Method to do zig zag traversal using BFS
	 * 
	 * @param root
	 * @return
	 */
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		// Creating the returning DS.
		List<List<Integer>> retDS = new LinkedList<>();

		// If the root id null then return immediately.
		if (root == null)
			return retDS;

		// Queue to store the child nodes.
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		// Level Number
		int levelNumber = 0;

		// Adding root to the empty queue.
		queue.add(root);

		// Iterating till the queue runs out
		while (!queue.isEmpty()) {

			// sublist for each level
			List<Integer> level = new LinkedList<Integer>();

			// Number of nodes in the level.
			int cnt = queue.size();

			// Iterating through the level
			for (int i = 0; i < cnt; i++) {
				// Getting first element of the queue.
				TreeNode current = queue.poll();

				// Addidng value in the subList.
				level.add(current.val);

				// Adding left child to the queue.
				if (current.left != null)
					queue.add(current.left);

				// Adding right child to the queue.
				if (current.right != null)
					queue.add(current.right);
			}

			// Reversing the list depending on level number
			if (levelNumber % 2 == 1)
				Collections.reverse(level);

			// Adding sublist to the final list.
			retDS.add(level);

			levelNumber = levelNumber + 1;
		}

		return retDS;
	}
}
