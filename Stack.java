public class Stack
{
	class node
	{
		int data;
		node next;
	}
	
	node start;	
	
	public Stack()
	{
		start=null;
	}
	
	public void push(int n)
	{
		node temp=new node();
		temp.data=n;
		temp.next=null;
		temp.next=start;
		start=temp;
	}
	
	public void peek()
	{
		System.out.println(start.data);
	}

	public static void main(String []args)
	{
		Stack student=new Stack();
		student.push(10);
		student.peek();
	}
}