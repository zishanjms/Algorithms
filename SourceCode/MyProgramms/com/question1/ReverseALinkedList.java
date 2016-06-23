package com.question1;

public class ReverseALinkedList {

	public static void main(String[] args) {
		
		Link myLink = new Link(1);
		myLink.next = new Link(2);
		myLink.next.next = new Link(3);
		myLink.next.next.next = new Link(4);
		myLink.next.next.next.next = new Link(5);
		
		System.out.println("Original Linked List: " +myLink);
		
		myLink = reverseALinkedList(myLink);
		
		System.out.println("Reversed Linked List: "+myLink);
		

	}

	public static Link reverseALinkedList(Link link)
	{
		if(link==null || link.next==null)
			return link;
		
		Link reverseRemainingLink = reverseALinkedList(link.next);
		
		link.next.next = link;
		link.next = null;
		
		return reverseRemainingLink;
	}
	
}

class Link
{
	int value;
	Link next;
	
    public Link(int value)
	{
		this.value = value;
	}
	
	@Override
	public String toString() {
		String outputStr = "";
		Link current = this;
		while(current!=null)
		{
			outputStr += current.value + " --> ";
			current = current.next;
		}
		return outputStr;
	}
	
}