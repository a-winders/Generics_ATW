package linkedlist;
/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author rkelley/njohnson/awinders
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericLinkedList <GenericNode, T> {

	/*
	 * Added parameter, T, to instance fields
	 * so that they can return any form of data.
	 * Did not add parameter to length since
	 * numerical value, and no other, is needed
	 * to return the number of elements in the 
	 * list.
	 */ 
	private GenericNode head; //node to represent the head of the list
	private GenericNode tail; //node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 * 
	 * Added parameter for head & tail of node.
	 */
	public GenericLinkedList(T head, T tail)
	{
		head = null;
		length = 0;
		tail = head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 */
	public GenericNode getList(T GenericNode)
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	public void addNode(T GenericNode)
	{
		if (isEmpty() ) {
			head = (GenericNode) GenericNode;
			tail=head;
			return;
		}
		/*
		 * Added "nextNode" to argument for setNextNode
		 * since it will point to the next node in the
		 * linked list. Can't seem to figure out the 
		 * correct syntax though - which means my main class
		 * also will not run. Ugh!
		 */
		tail.setNextNode(nextNode);
		tail = tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode

}//end class
