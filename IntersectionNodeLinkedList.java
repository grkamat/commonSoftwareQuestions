import java.util.HashSet;

/**
 * Class which contains method to find intersection node in 
 * a circular Linked List
 * @author grkamat
 *
 */
public class IntersectionNodeLinkedList {
	
/**
 * Method to find intersection node of the 2 linked lists	
 * using a Hash Set.
 * Time Complexity : O(n + m)
 * Space Complexity : O(n)
 * @param headA First Linked List
 * @param headB Second Linked List
 * @return Intersection Node of the two Linked Lists
 */
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	
	//Creating a Hash Set to store the !st Linked List Nodes
	HashSet<ListNode> hsln = new HashSet<ListNode>();
	
	ListNode firstList = headA;
	ListNode secondList = headB;
	
	//Putting the Nodes of !st Linked List in the Hash Set
	while(firstList != null) {
		hsln.add(firstList);
		firstList = firstList.next;
	}
	
	//If any collision between 1st and 2nd list then return the colliding Node.
	while(secondList != null) {
		
		if(hsln.contains(secondList))
			return secondList;
		secondList = secondList.next;
	}
	
	return null;		
        
    }

}
