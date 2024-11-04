class Node 
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}

}
class CLL
{
	Node head;
	Node tail;
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;	
	}
	public void print()
	{
		System.out.println("\n**********PRINTING the List");
		print(head);
		System.out.println("                Tail");
	}
	private void print(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println("["+node+"] "+node.data+" ["+node.next+"]");
		System.out.println("                 |\n                 V");
		print(node.next);
	}

	public void revPrint()
	{
		System.out.println("\n**********PRINTING the List in Rev");
		revPrint(head);
		System.out.println("                Head");
	}
	private void revPrint(Node node)
	{
		if(node==null)
		{
			return;
		}
		revPrint(node.next);
		System.out.println("["+node+"] "+node.data+" ["+node.next+"]");
		System.out.println("                 ^\n                 |");
	}
}
class Test
{
	public static void main(String[] args)
	{
		CLL list=new CLL();
		for(int i=10;i<51;i+=10)
		{
			list.add(i);
		}
		list.print();
		list.revPrint();
	}


}