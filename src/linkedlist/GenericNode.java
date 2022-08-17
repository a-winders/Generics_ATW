package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/awinders
 * Programming Project 1 Start Project
 * CS131ON
 */

/*
 * Added <T> to declaration so that objects 
 * of any type can be added.
 */
public class GenericNode <T> {
	/*
	 * Parameterized both variables in the instance field with <T> 
	 * to accept data of any type. 
	 */
	private T data;  //data that the object stores
	private GenericNode nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 * 
	 * Added parameter to setData method so that any
	 * type of object can be returned for the variable
	 * i.e. String, int, double, etc.
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 * 
	 * Added T to getData so that any
	 * type of object can be returned.
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 * 
	 * Added T parameter for the return method
	 * so that any form of data can be recalled.
	 */
	public T getNode() {
		return (T) this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 * 
	 * Added parameter to set method so that any 
	 * type of data can be linked to the nextNode
	 */
	public void setNextNode(T nextNode)
	{
		this.nextNode = (GenericNode<T>) nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 * 
	 * Added parameter to get method so that any
	 * type of data will be returned, regardless of
	 * what was input. 
	 * i.e. String, double, int, etc.
	 */
	public GenericNode getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class
