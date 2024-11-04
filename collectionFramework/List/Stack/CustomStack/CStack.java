class Node 
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class CS
{
	Node topNode;
	public void push(int data)
	{
		Node newNode=new Node(data);
		newNode.next=topNode;
		topNode=newNode;
	}
	public int pop()
	{
		if(topNode==null)
		{
			return -1;
		}
		int data=topNode.data;
		topNode=topNode.next;
		return data;
	}	
	public int peek()
	{
		if(topNode==null)
		{
			return -1;
		}
		return topNode.data;
	}
	
	public String toString()
	{
		return toString(topNode)+"]";
	}
	public String toString(Node node)
	{
		if(node.next==null)
		{
			return "["+node.data;
		}
		return toString(node.next)+","+node.data;
	}
}
class CStack
{
	public static void main(String[] args)
	{
		CS stack=new CS();
		for(int i=0;i<1;i++)
		{
			for(int j=10;j<51;j+=10)
			{
				stack.push(j);
			}
			System.out.println(stack);
			for(int j=0;j<3;j++)
			{
				System.out.println("pop "+stack.pop());
				System.out.println(stack);
			}
			
		}
		
		System.out.println("peek "+stack.peek());
		System.out.println("peek "+stack.peek());
		
	}
}
