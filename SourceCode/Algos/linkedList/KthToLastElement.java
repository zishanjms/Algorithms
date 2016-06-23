package linkedList;

import dataStructure.LinkedList;
import dataStructure.LinkedList.Node;

public class KthToLastElement {

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

		findKthToLastElement(linkedList.getHead(), 9);
	}
	
	public static void findKthToLastElement(Node head,int k)
	{
		if(head==null) return;
		Node frunner = head;
		Node srunner = head;
		int counterForK=0;
		while(counterForK < k && frunner!=null)
		{
			if(frunner.getNext()==null)
			{
				System.out.println("No element found");
				return;
			}
			counterForK++;
			frunner = frunner.getNext();
		}
		
		if(counterForK==k)
		{
			while(frunner!=null)
			{
				frunner = frunner.getNext();
				srunner = srunner.getNext();
			}
			
			System.out.println(k+"th to Last Element is:"+srunner.getData());
		}
		else
			System.out.println("No element found");
	}

}
