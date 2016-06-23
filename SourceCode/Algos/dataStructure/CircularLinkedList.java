package dataStructure;

public class CircularLinkedList {

	private Node last=null;
	
	public void insertBeg(Object data)
	{
		Node newNode = new Node(data);
		
		if(last!=null)
		{
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		else
		{
			last = newNode;
			newNode.setNext(last);
		}
	}
	
	public void insertAtPos(Object data, int pos)
	{
		Node node = last;
		if(node==null || pos<=0)
		{
			insertBeg(data);
			return;
		}
		else
		{
			node = node.getNext();
			Node newNode = new Node(data);
			for (int i = 0; i < pos && node!=last; i++) {
				node = node.getNext();
			}
			
			if(node==last)
			{
				newNode.setNext(last.getNext());
				last.setNext(newNode);
				last = newNode;
			}
			else
			{
				newNode.setNext(node.getNext());
				node.setNext(newNode);
			}
			
			
		}
	}
	
	public void insertEnd(Object data)
	{
		Node node = last;
		if(node==null)
		{
			insertBeg(data);
			return;
		}
		else
		{
			Node newNode = new Node(data);
			while(node.getNext()!=last)
			{
				node = node.getNext();
			}
			 newNode.setNext(node.getNext());
			 node.setNext(newNode);
		}
	}
	
	public Object deleteBeg()
	{
		Object data=null;
		
		Node node = last;
		if(node!=null)
		{
			node = node.getNext(); // Get the first Node
			last.setNext(node.getNext()); // Set the second Node as first
			data = node.getData();
		}
		else{
			System.out.println("Circular Link List is Empty");
		}
		return data;
	}
	
	public Object deleteAtPos(int pos)
	{
		Object data=null;
		Node currNode = last;
		Node previousNode=null;
		
		if(pos<0)
		{
			System.out.println("Invalid Position");
			return data;
		}
		
		if(currNode==null)
		{
			System.out.println("Circular Linked List is Empty");
			return data;
		}
		
		previousNode = currNode;
		currNode = currNode.getNext();
		for (int i = 0; i < pos && currNode!=last; i++) {
			previousNode = currNode;
			currNode = currNode.getNext();
		}
		
		if(currNode==last)
		{
			previousNode.setNext(last.getNext());
			data = last.getData();
			last = previousNode;
		}
		else
		{
			previousNode.setNext(currNode.getNext());
			data = currNode.getData();
		}
		
		return data;
	}
	
	public Object deleteEnd()
	{
		Object data =null;
		Node currNode = last;
		Node previousNode = last;
		
		if(currNode!=null)
		{
			previousNode = currNode;
			while(currNode.getNext()!=last)
			{
				previousNode = currNode;
				currNode = currNode.getNext();
			}
			
			currNode.setNext(last.getNext());
			data = last.getData();
			last= currNode;
		}
		else{
			System.out.println("Circular Link List is Empty");
		}
		
		return data;
	}
	
	public void display()
	{
		Node node  = last;
		if(node==null)
		{
			System.out.println("Circular Link List is Empty");
			return;
		}
		if(node.getNext()!=null)
		{
			node = node.getNext();
			while(node!=last)
			{
				System.out.print("\t" + node.getData());
				node = node.getNext();
			}
			System.out.print("\t" + last.getData());
			System.out.println();
		}
	}
	
	public void reverse()
	{
		if(last==null)
		{
			System.out.println("Empty Circular Linked List");
			return;
		}
		Node prevToPrev = null;
		Node prev = last;
		Node curr = last.getNext();
		
		while(curr!=last)
		{
			prevToPrev = prev;
			prev = curr;
			curr = curr.getNext();
			prev.setNext(prevToPrev);
		}
		last = curr.getNext();
		curr.setNext(prev);
	}
	
	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.reverse();
		circularLinkedList.display();
		circularLinkedList.deleteAtPos(3);
		circularLinkedList.deleteBeg();
		circularLinkedList.deleteEnd();
		circularLinkedList.display();
		circularLinkedList.insertBeg(1);
		circularLinkedList.reverse();
		circularLinkedList.display();
		circularLinkedList.insertBeg(11);
		circularLinkedList.reverse();
		circularLinkedList.display();
		circularLinkedList.insertAtPos(2, 3);
		circularLinkedList.display();
		circularLinkedList.insertAtPos(10, -9);
		circularLinkedList.display();
		circularLinkedList.insertAtPos(3, 3);
		circularLinkedList.display();
		circularLinkedList.insertAtPos(4, 3);
		circularLinkedList.display();
		circularLinkedList.insertBeg(0);
		circularLinkedList.display();
		circularLinkedList.insertAtPos(5, 5);
		circularLinkedList.display();
		circularLinkedList.insertAtPos(100, 0);
		circularLinkedList.display();
		circularLinkedList.reverse();
		circularLinkedList.display();
		/*System.out.println(" deleted node:  "+circularLinkedList.deleteBeg());
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteEnd());
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteAtPos(9));
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteAtPos(2));
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteBeg());
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteEnd());
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteAtPos(-1));
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteAtPos(-90));
		circularLinkedList.display();
		System.out.println(" deleted node:  "+circularLinkedList.deleteAtPos(90));
		circularLinkedList.display();*/
	}

	class Node{
		
		private Object data;
		private Node next=null;
		
		public Node(Object data)
		{
			this.data = data;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
}




