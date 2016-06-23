package dataStructure;


public class LinkedList {

	private Node head=null;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insertBeg(Object data)
	{
		Node newNode = new Node(data);
		Node node = head;
		if(node!=null)
		{
			newNode.setNext(node);
			head = newNode;
		}
		else
		{
			head=newNode;
		}
	}
	
	public void insertAtPos(Object data, int pos)
	{
		Node node = head;
		if(node==null || pos<=0)
		{
			insertBeg(data);
			return;
		}
		else
		{
			Node newNode = new Node(data);
			for (int i = 0; i < pos && node.getNext()!=null; i++) {
				node = node.getNext();
			}
			
			newNode.setNext(node.getNext());
			node.setNext(newNode);
		}
	}
	
	public void insertEnd(Object data)
	{
		Node node = head;
		if(node==null)
		{
			insertBeg(data);
			return;
		}
		else
		{
			Node newNode = new Node(data);
			while(node.getNext()!=null)
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
		
		Node node = head;
		if(node!=null)
		{
			head = node.getNext();
			data = node.getData();
		}
		else{
			System.out.println("Link List is Empty");
		}
		return data;
	}
	
	public Object deleteAtPos(int pos)
	{
		Object data=null;
		Node currNode = head;
		Node previousNode=null;
		
		if(currNode!=null)
		{
			previousNode = currNode;
			for (int i = 0; i < pos && currNode.getNext()!=null; i++) {
				previousNode = currNode;
				currNode = currNode.getNext();
			}
			
			previousNode.setNext(currNode.getNext());
			data = currNode.getData();
		}
		else{
			System.out.println("Link List is Empty");
		}
		
		return data;
	}
	
	public Object deleteEnd()
	{
		Object data =null;
		Node currNode = head;
		Node previousNode = null;
		
		if(currNode!=null)
		{
			previousNode = currNode;
			while(currNode.getNext()!=null)
			{
				previousNode = currNode;
				currNode = currNode.getNext();
			}
			
			previousNode.setNext(currNode.getNext());
			data = currNode.getData();
			
		}
		else{
			System.out.println("Link List is Empty");
		}
		
		return data;
	}
	
	public void reverse()
	{
		Node prevToPrev = null;
		Node prev = head;
		Node curr = head;
		
		if(head==null)
		{
			System.out.println("Emtpy Linked List");
			return;
		}
		
		if(curr != null && curr.getNext()!= null)
		{
			curr = curr.getNext();
		}
		
		while(curr != null)
		{
			prevToPrev = prev;
			prev = curr;
			curr = curr.getNext();
			prev.setNext(prevToPrev);
		}
		
		head.setNext(null);
		head = prev;
		
	}
	
	public void display()
	{
		Node node  = head;
		while(node!=null)
		{
			System.out.print("\t" + node.getData());
			node = node.getNext();
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.reverse();
		linkedList.display();
		linkedList.deleteAtPos(3);
		linkedList.deleteBeg();
		linkedList.deleteEnd();
		linkedList.insertBeg(1);
		linkedList.insertAtPos(2, 4);
		linkedList.display();
		linkedList.reverse();
		linkedList.display();
		/*linkedList.insertAtPos(10, -9);
		linkedList.insertAtPos(100, 0);
		linkedList.display();*/
		/*linkedList.insertAtPos(3, 3);
		linkedList.insertEnd(4);
		linkedList.insertAtPos(5, 5);
		linkedList.display();
		linkedList.reverse();
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteBeg());
		System.out.println(" deleted node:  "+linkedList.deleteEnd());
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(9));
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(2));
		System.out.println(" deleted node:  "+linkedList.deleteBeg());
		System.out.println(" deleted node:  "+linkedList.deleteEnd());
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(-1));
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(-90));
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(90));
		linkedList.display();*/
	}

	public class Node{
		
		public Object data;
		public Node next=null;
		
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




