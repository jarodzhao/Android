
public class TestThread 
{
	public static void main(String[] args) 
	{
		//myThread myt = new myThread(50);
		//myt.run();
		//System.out.println("hello......");

		Thread t = new Thread(new myThread(50));
		Thread t2 = new Thread(new myThread(10));

		// �����߳�ͬʱ����
		t.start();
		t2.start();

		System.out.println("===========hello===========");


	}
}
