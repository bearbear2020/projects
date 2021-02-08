import java.util.Random;

public class Lab31a
{
	public static void main(String args[])
	{
		System.out.println("\nLab31 100 Point Version\n");
		MyList list1 = new MyStack(100);
		MyList list2 = new MyQueue(100);
		MyList list3 = new MySet(100);
		MyList list4 = new MyOrdList(100);
		Random rnd = new Random(12345);
		for (int k = 1; k <= 20; k++)
		{
			int rndInt = rnd.nextInt(20) + 10;
			addData(list1,rndInt);
			addData(list2,rndInt);
			addData(list3,rndInt);
			addData(list4,rndInt);
		}
		showData(list1,list2,list3,list4);
		System.out.println();
		
		for (int k = 1; k <= 5; k++)
		{
			removeData(list1);
			removeData(list2);
			removeData(list3);
			removeData(list4);
		}
		showData(list1,list2,list3,list4);	
		System.out.println();
	}

	private static void removeData(MyList list) {
		list.remove();
		
	}

	private static void showData(MyList list1, MyList list2, MyList list3, MyList list4) {
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
	}

	private static void addData(MyList list, int rndInt) {
		list.add(rndInt);
	}
	
}


abstract interface MyList
{
	public abstract void add(int x);
	
	public abstract int remove();
	
	public abstract boolean isEmpty();
	
	public abstract int getSize();
}

