import java.util.*;
class LL
{
	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Linked List");
		ll.add("java ");
		ll.add("version 1.2");
		System.out.println(" Java implements double Linked-List\n "+ll);
		
		SingleLinkedList sll=new SingleLinkedList();
		sll.add(10);
	}

}
class SingleLinkedList
{
	Node head;
	public void add(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			System.out.println("***Added successfully***");
			return;
		}
	}

}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}

}