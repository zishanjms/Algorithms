package dataStructure;


public class DoublyLinkedList {

	private Node head=null;
	
	public void insertBeg(Object data)
	{
		Node newNode = new Node(data);
		Node node = head;
		if(node!=null)
		{
			newNode.setFront(node);
			node.setBack(newNode);
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
			for (int i = 0; i < pos && node.getFront()!=null; i++) {
				node = node.getFront();
			}
			
			if(node.getFront()!=null)
			{

				Node prev = node.getBack();
				newNode.setFront(node);
				newNode.setBack(prev);
				
				if(prev!=null)
				{
					prev.setFront(newNode);
				}
			}
			else
			{
				newNode.setBack(node);
				node.setFront(newNode);
			}
			
			
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
			while(node.getFront()!=null)
			{
				node = node.getFront();
			}
			 newNode.setFront(node.getFront());
			 newNode.setBack(node);
			 node.setFront(newNode);
		}
	}
	
	public Object deleteBeg()
	{
		Object data=null;
		
		Node node = head;
		if(node!=null)
		{
			head = node.getFront();
			head.setBack(null);
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
		
		if(pos<=0)
		{
			return deleteBeg();
		}
		
		
		if(currNode!=null)
		{
			previousNode = currNode;
			for (int i = 0; i < pos && currNode.getFront()!=null; i++) {
				previousNode = currNode;
				currNode = currNode.getFront();
			}
			
			if(currNode.getFront()!=null)
			{
				currNode.getFront().setBack(previousNode);
			}
			
			previousNode.setFront(currNode.getFront());

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
			while(currNode.getFront()!=null)
			{
				previousNode = currNode;
				currNode = currNode.getFront();
			}
			
			previousNode.setFront(currNode.getFront());
			data = currNode.getData();
			
		}
		else{
			System.out.println("Link List is Empty");
		}
		
		return data;
	}
	
	/*public void reverse()
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
		
	}*/
	
	public void display()
	{
		Node node  = head;
		while(node!=null)
		{
			System.out.print("\t" + node.getData());
			node = node.getFront();
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		//linkedList.reverse();
		linkedList.display();
		linkedList.deleteAtPos(3);
		linkedList.deleteBeg();
		linkedList.deleteEnd();
		linkedList.insertBeg(1);
		linkedList.display();
		linkedList.insertAtPos(2, 4);
		linkedList.display();
		linkedList.insertEnd(3);
		linkedList.display();
		linkedList.insertBeg(4);
		linkedList.display();
		linkedList.insertAtPos(5, 2);
		linkedList.display();
		linkedList.insertAtPos(6, 2);
		linkedList.display();
		linkedList.insertAtPos(7, -8);
		linkedList.display();
		linkedList.insertAtPos(8, 11);
		linkedList.display();
		linkedList.insertAtPos(9,2);
		linkedList.display();
		linkedList.insertAtPos(10, -9);
		linkedList.display();
		linkedList.insertAtPos(100, 0);
		linkedList.display();
		
		System.out.println(" deleted node:  "+linkedList.deleteBeg());
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteEnd());
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(9));
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(2));
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteBeg());
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteEnd());
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(0));
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(-90));
		linkedList.display();
		System.out.println(" deleted node:  "+linkedList.deleteAtPos(90));
		linkedList.display();
	}

	class Node{
		
		private Object data;
		private Node back=null;
		private Node front=null;
		
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

		public Node getBack() {
			return back;
		}

		public void setBack(Node back) {
			this.back = back;
		}

		public Node getFront() {
			return front;
		}

		public void setFront(Node front) {
			this.front = front;
		}
	
	}

}




