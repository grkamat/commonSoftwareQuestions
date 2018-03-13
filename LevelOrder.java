import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * Class which contains method to level order travers
 * a binary tree by using a queue to store the child nodes of the 
 * noees in each level.
 * 
 * @author grkamat
 *
 */
public class LevelOrder {

	/**
	 * Method to return the elements of a tree by level order traversal
	 * Space Complexity: O(n)
	 * Time Complexity: O(n)
	 * @param root Root node of the tree to be iterated
	 * @return list of lists of each level in the tree
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {

		
		//Creating the returning DS.
		List<List<Integer>> retDS = new LinkedList<>(); 
				
				
		//If the root id null then return immediately.
		if (root == null)
			return retDS;

		 
		
		//Queue to store the child nodes.
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		//Adding root to the empty queue.
		queue.add(root);

		//Iterating till the queue runs out
		while (!queue.isEmpty()) {

			//sublist for each level
			List<Integer> level = new LinkedList<Integer>();

			//Number of nodes in the level.
			int cnt = queue.size();
			
			//Iterating through the level
			for (int i = 0; i < cnt; i++) {
				//Getting first element of the queue.
				TreeNode current = queue.poll();
				
				//Addidng value in the subList.
                level.add(current.val);
                
                //Adding left child to the queue.
				if (current.left != null)
					queue.add(current.left);

				//Adding right child to the queue.
				if (current.right != null)
					queue.add(current.right);
			}
			//Adding sublist to the final list.
			retDS.add(level);

		}

		return retDS;
	}

}
