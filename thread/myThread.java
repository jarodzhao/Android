import java.util.concurrent.*;

public class myThread implements Runnable
{
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public myThread(){}

	public myThread(int countDown){
		this.countDown = countDown;
	}

	public String status(){
		String ref = "";
		if(countDown > 0)
			ref = "#" + id + " --> " + countDown;
		else
			ref = id + " ���̽�������";
		return ref;
	}

	// ʵ�� Runnable �ӿڵ�������� run() ����
	// ����ȽϺ�ʱ������񣬿��԰�һ������ֳɶ���߳�
	public void run(){
		try
		{
			while(countDown-- > 0){
				System.out.println(status());

				// ��CPU��һ���߳��л�����һ���߳�
				// Thread.yield();
				
				// ��������������
				TimeUnit.MILLISECONDS.sleep(2000);
			}
		}
		catch (InterruptedException e)
		{
			System.err.println("Interrupted");
		}
	}
}
