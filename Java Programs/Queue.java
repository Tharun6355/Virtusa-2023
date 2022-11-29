import java.util.*;

class Main 
{
    int arr[], front, rear, cap, n1;  		
	
	Main(int n)
	{
		arr = new int[n];
		cap = n;
		front = 0;
		rear = -1;
		n = 0;
	}

	public void deMain()
	{

		if (isEmpty())
		{
			System.out.println("No items in the Main,cannot delete");
			System.exit(1);
		}

		System.out.println("Deleting " + arr[front]);

		front = (front + 1) % cap;
		n1--;
	}

    public void enMain(int val)
	{

		if (isFull())
		{
			System.out.println("OverFlow!!Cannot add more values");
			System.exit(1);
		}

		System.out.println("Adding " + val);

		rear = (rear + 1) % cap;
		arr[rear] = val;
		n1++;
	}

	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Main empty!!Cannot delete");
			System.exit(1);
		}
		return arr[front];
	}


	public int size()
	{
		return n1;
	}


	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	public Boolean isFull()
	{
		return (size() == cap);
	}

	public static void main (String[] args)
	{

		Main q = new Main(5);

		q.enMain(10);
		q.enMain(20);
		q.enMain(30);
		
		System.out.println("Front element is: " + q.peek());
		q.deMain();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Main size is " + q.size());

		q.deMain();
		q.deMain();
		
		if (q.isEmpty())
			System.out.println("Main Is Empty");
		else
			System.out.println("Main Is Not Empty");
	}
}
