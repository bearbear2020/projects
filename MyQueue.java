import java.util.ArrayList;

 class MyQueue {
	
		static public int xValue;
		static public int yValue;
		static private int front;
		static ArrayList <Integer> TLX;
		static ArrayList <Integer>  TLY;
		public MyQueue(int x, int y)
		{
			xValue=x;
			yValue=y;
			TLX = new ArrayList<Integer>(GfxApp.returnSize());
			TLY = new ArrayList<Integer>(GfxApp.returnSize());
		}

		public static boolean isEmpty()
		{
			return (TLX.size() ==0 && TLY.size()==0);
		}

		public static void add(int x, int y)
		{   
		//if(TLX.size() ==50)
		//{
		//	removeX();
		//	removeY();
		//}
			TLX.add(x);
		TLY.add(y);
		
}

		
		public static Integer removeX()
		{
		
			return TLX.remove(front);
			
			
		}
		
		public static Integer removeY()
	{
			return TLY.remove(front);
		}


		public static Integer peekX()
		{
			return TLX.get(front);
		}
		
		public static Integer peekY()
		{
			return TLY.get(front);
		}
		
		public static Integer returnSize()
		{
			return (TLX.size());

		}

}

