class Node 
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class QN
{
	Node firstN;
	Node lastN;
	public void add(int data)
	{
		Node newNode =new Node(data);
		if(isEmpty())
		{
			firstN=lastN=newNode;
			return;
		}
		lastN.next=newNode;
		lastN=newNode;
	}
	public int remove()
	{
		if(isEmpty())
		{
			return -1;
		}
		int data=firstN.data;
		firstN=firstN.next;
		return data;
	}
	public boolean isEmpty()
	{
		return firstN==null;
	}
}
class CQ
{
	public static void main(String[] args)
	{
		QN q=new QN();
		for(int i=10;i<51;i+=10)
		{
			q.add(i);
		}
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
	}
}