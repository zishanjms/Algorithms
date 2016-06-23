package dataStructure;

import dataStructure.LinkedList.Node;

public class Stack {

	Node top;
	
	public Object pop()
	{
		if(top!=null)
		{
			Object item = top.getData();
			top = top.getNext();
			return item;
		}
		return null;
	}
	
	public void push(Node newNode)
	{
		newNode.setNext(top);
		top = newNode;
	}
	
	public Object peek()
	{
		return top.getData();
	}
	
	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		LinkedList list = new LinkedList();
		LinkedList.Node node1 = list.new Node(1);
		stack.push(node1);
		LinkedList.Node node2 = list.new Node(2);
		stack.push(node2);
		LinkedList.Node node3 = list.new Node(3);
		stack.push(node3);
		LinkedList.Node node4 = list.new Node(4);
		stack.push(node4);
		LinkedList.Node node5 = list.new Node(5);
		stack.push(node5);
		LinkedList.Node node6 = list.new Node(6);
		stack.push(node6);
		LinkedList.Node node7 = list.new Node(7);
		stack.push(node7);
		LinkedList.Node node8 = list.new Node(8);
		stack.push(node8);
		
		System.out.println("Popped Node is: " + stack.pop());
		System.out.println("Popped Node is: " + stack.pop());
		System.out.println("Peeped Node is: " + stack.peek());
		System.out.println("Popped Node is: " + stack.pop());
		System.out.println("Popped Node is: " + stack.pop());
		
	}

}
