package Assignment6;

public class Main2 
{
	double avg;
	int square;

	public static void main(String[] args) 
	{
		Main2 obj = new Main2();
		Thread t1 = new Thread(new Runnable()
		{
			public void run() 
			{
				obj.PrintAvg();
			}
		},"Thread-1");
		Thread t2 = new Thread(new Runnable()
		{
			public void run() 
			{
				obj.PrintSq();
			}
		},"Thread-2");
		t1.start();
		t2.start();

	}

	public void PrintAvg() 
	{
		for(int i=1;i<=50;i++) 
		{
			 avg=i/2;
		}
		System.out.println(Thread.currentThread().getName()+"avg " + avg);
		
	}
	public void PrintSq() 
	{
		int array[]= {10,15,20,25,30};
		
		for (int i=0;i< array.length;i++) 
		{
			array[i] = (int)Math.pow(array[i], 2);
		}
		for (int value : array) 
		{
			System.out.println(Thread.currentThread().getName()+value);
		}
	}

}
