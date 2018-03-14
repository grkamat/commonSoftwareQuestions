/**
 * Class which contains method to cehck if linkedList is cyclic
 * 
 * @author grkamat
 *
 */
public class HasCycle {

	/**
	 * Method to detect if the linked list is cyclic or not using runner reacher
	 * method.
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * @param head
	 * @return true if cycle in detected
	 */
	public boolean hasCycle(ListNode head) {
		// Initializing runner and reacher
		ListNode runner = head;
		ListNode reacher = head;

		while (runner != null && runner.next != null) {

			// Runner walks 2 steps and reacher one step
			runner = runner.next.next;
			reacher = reacher.next;

			// If collision is detected break the loop
			if (runner == reacher)
				return true;
		}

		return false;

	}

}
