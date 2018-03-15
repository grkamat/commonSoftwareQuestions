/**
 * Class which contains methods to add two linked lists.
 * The digits are stored in reverse order and each of their 
 * nodes contain a single digit. 
 * @author grkamat
 *
 */
public class AddTwoLinkedList {

	/**
	 * Adds Two Linked List
	 * Time Complexity : O(n)
	 * Space Complexity O(n)(Recursion)
	 * @param l1
	 * @param l2
	 * @return Head Node of the Summed Linked List
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		return addList(l1, l2, 0);

	}

	/**
	 * Recursive helper function to add list to the Node.
	 * @param l1 1st list
	 * @param l2 2nd list
	 * @param carry Carry Value of the addition
	 * @return ListNode of the Current Sum
	 */
	public ListNode addList(ListNode l1, ListNode l2, int carry) {
		//Base Condition
		if (l1 == null && l2 == null && carry == 0)
			return null;

		int tempResult = carry;

		if (l1 != null)
			tempResult = tempResult + l1.val;

		if (l2 != null)
			tempResult = tempResult + l2.val;

		//Storing units place in result
		ListNode result = new ListNode(tempResult % 10);

		
		if (l1 != null || l2 != null) {
			
			/**
			 * Check to make sure one list is not shorter than other.
			 */
			if (l1 == null)
				l1 = null;
			else
				l1 = l1.next;

			if (l2 == null)
				l2 = null;
			else
				l2 = l2.next;

			//Assigning Carry
			if (tempResult >= 10)
				tempResult = 1;
			else
				tempResult = 0;

			//Recurssively calling the function to add all nodes
			ListNode next = addList(l1, l2, tempResult);

			//Creating linked list of sum
			result.next = next;

		}

		return result;
	}

}
