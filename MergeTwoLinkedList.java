/**
 * Contains method to merge two sorted linked lists
 * @author grkamat
 *
 */
public class MergeTwoLinkedList {

	/**
	 * Method to merge two sorted linked lists 
	 * iteratively
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param l1 1st Linked List
	 * @param l2 2nd Linked List
	 * @return Head of merged linked list
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null && l2 == null)
            return null;
		
		if(l1 == null)
			return l2;
		
		if(l2 == null)
			return l1;
		
		//Dummy Node
		ListNode outPut = new ListNode(0);
		
		//outPut.next is the head of merged linked list
		ListNode prev = outPut;
		
		//Checking the nodes of l1 and l2
		while(l1!=null && l2!= null) {
			
			if(l1.val<=l2.val) {
				prev.next = l1;
				l1 = l1.next;
			}else {
				prev.next = l2;
				l2 = l2.next;
			}
			prev = prev.next;
			
		}
		
		//When l1 finishes 1st
		if(l1 == null)
			prev.next = l2;
		
		//When l2 finishes 1st
		if(l2 == null)
			prev.next = l1;
		
		return outPut.next;

	}
	
	
	

}
