package linkedList;

import dataStructure.LinkedList;
import dataStructure.LinkedList.Node;

/*
 * 
 * Algo::
MergeSort(Node head)
1) If head is NULL or there is only one element in the Linked List 
    then return.
2) Else divide the linked list into two halves.  
      FrontBackSplit(head, a, b);  a and b are two halves 
3) Sort the two halves a and b.
      MergeSort(a);
      MergeSort(b);
4) Merge the sorted a and b (using SortedMerge() discussed here) 
   and update the head pointer using headRef.
     head = SortedMerge(a, b);*/


public class MergeSortForLinkedList {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.insertBeg(0);
		linkedList.insertEnd(-81);
		linkedList.insertAtPos(21, 2);
		linkedList.insertAtPos(32, 3);
		linkedList.insertAtPos(42, 4);
		linkedList.insertAtPos(15, 4);
		linkedList.insertAtPos(36, 6);
		linkedList.insertAtPos(73, 3);
		linkedList.insertAtPos(28, 8);
		linkedList.insertEnd(5);
		linkedList.insertEnd(1);
		linkedList.display();

		linkedList.setHead(mergeSort(linkedList.getHead()));
		linkedList.display();
	}

	
	public static Node mergeSort(Node head)
	{
		if(head==null || head.next == null)
		{
			return head;
		}
		
		Node a = head;
		Node b = head.next;
			
		while(b!=null && b.next != null)
		{
			a = a.next;
			b = b.next.next;
		}
		
		b = a.next;
		a.next = null;
		a = head;
				
		return sortedMerge(mergeSort(a), mergeSort(b));
	}	
	
	public static Node sortedMerge(Node a, Node b)
	{
		Node source = null;
		if(a == null)
			return b;
		else if(b == null)
			return a;
		
		 if(((int)a.data) <= ((int)b.data))
		{
			source = a;
			source.next = sortedMerge(a.next, b);
		}
		 else
		 {
			source = b;
			source.next = sortedMerge(a, b.next);
		 }
		 
		 return source;
	}
}
