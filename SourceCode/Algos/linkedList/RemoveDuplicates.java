package linkedList;


import java.util.Hashtable;

import dataStructure.LinkedList;
import dataStructure.LinkedList.Node;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		LinkedList linkedList = new LinkedList();
		linkedList.insertBeg(0);
		linkedList.insertEnd(1);
		linkedList.insertAtPos(2, 2);
		linkedList.insertAtPos(3, 3);
		linkedList.insertAtPos(4, 4);
		linkedList.insertAtPos(5, 5);
		linkedList.insertAtPos(6, 6);
		linkedList.insertAtPos(7, 7);
		linkedList.insertAtPos(8, 8);
		linkedList.insertEnd(5);
		linkedList.insertEnd(8);
		linkedList.display();

		//removeDuplicatesByBruteForce(linkedList.getHead());
		removeDuplicatesByUsingBuffer(linkedList.getHead());
		linkedList.display();
	}
	
	public static void removeDuplicatesByBruteForce(Node head)
	{
		if(head==null) return;
		
		Node currNode =head;
		
		while(currNode!=null)
		{
			Node runner = currNode;
			while(runner.getNext()!=null)
			{
				if(runner.getNext().getData()==currNode.getData())
				{
					runner.setNext(runner.getNext().getNext());
				}
				else
				runner = runner.getNext();
			}
			currNode = currNode.getNext();
		}
	}
	
	public static void removeDuplicatesByUsingBuffer(Node head)
	{
		if(head==null) return;
		Node currNode = head;
		Node prevNode = null;
		Hashtable<Object, Boolean> hashTable = new Hashtable<>();
		
		while (currNode!=null)
		{
			if(hashTable.containsKey(currNode.getData()))
			{
				prevNode.setNext(currNode.getNext());
				System.out.println("Elements Removed are " + currNode.getData());
			}
			else
			{
				hashTable.put(currNode.getData(), true);
				prevNode = currNode;
			}
			
			currNode = currNode.getNext();
		}
	}

}
