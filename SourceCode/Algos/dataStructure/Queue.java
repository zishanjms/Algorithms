package dataStructure;

import dataStructure.LinkedList.Node;

public class Queue {

	Node front;
	Node rear;
	
	public void enqueue(Node newNode)
	{
		if(front==null)
		{
			front = newNode;
			rear = front;
		}
		else
		{
			rear.setNext(newNode);
			rear = newNode;
		}
	}
	
	public Object dequeue()
	{
		Object item=null;
		if(front!=null)
		{
			item = front.getData();
			front = front.getNext();
		}
		return item;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		LinkedList list = new LinkedList();
		LinkedList.Node node1 = list.new Node(1);
		queue.enqueue(node1);
		LinkedList.Node node2 = list.new Node(2);
		queue.enqueue(node2);
		LinkedList.Node node3 = list.new Node(3);
		queue.enqueue(node3);
		LinkedList.Node node4 = list.new Node(4);
		queue.enqueue(node4);
		LinkedList.Node node5 = list.new Node(5);
		queue.enqueue(node5);
		LinkedList.Node node6 = list.new Node(6);
		queue.enqueue(node6);
		LinkedList.Node node7 = list.new Node(7);
		queue.enqueue(node7);
		LinkedList.Node node8 = list.new Node(8);
		queue.enqueue(node8);
		
		System.out.println("dequeueped Node is: " + queue.dequeue());
		System.out.println("dequeueped Node is: " + queue.dequeue());
		System.out.println("dequeueped Node is: " + queue.dequeue());
		System.out.println("dequeueped Node is: " + queue.dequeue());
		System.out.println("dequeueped Node is: " + queue.dequeue());
		
	}

}
