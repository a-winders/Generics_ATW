package main;
import linkedlist.Node;
import linkedlist.GenericLinkedList;
import linkedlist.LinkedList;

public class TestLinkedList {

	public static <T> void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		
	/*
	 * Created GenericLinkedList objects to hold
	 * integers, doubles, and Strings.
	 */
	GenericLinkedList <Integer> intArray = new GenericLinkedList<Integer>(1,2,3);	
	System.out.print("Integer array contains: ");
	displayArray(intArray);
	
	
	GenericLinkedList <Double> doubleArray = new GenericLinkedList<>(1.0, 2.0, 3.0);
	System.out.print("Double array contains: ");
	displayArray(doubleArray);
		
	GenericLinkedList <String> stringArray = new GenericLinkedList<>("Adam", "Nikki", "Sophie", "Hei-Hei");
	System.out.print("String array contains: ");
	displayArray(stringArray);
	
	}//end main

}//end class
