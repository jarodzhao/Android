import java.util.concurrent.*;

public class ThreadPool
{
	public static void main(String[] args) 
	{
		// �̣߳�ִ�У�������

		// �����������߳�
		ExecutorService exec = Executors.newCachedThreadPool();

		// ����ʹ��ͬһ�̣߳�����ִ������
		// ExecutorService exec = Executors.newSingleThreadExecutor();

		// ���� 5 ���߳�ͬʱ�������̶��߳�������
		// ExecutorService exec = Executors.newFixedThreadPool(3);
		
		// 5 ������
		for(byte i=0;i<5;i++)
			exec.execute(new myThread());

		exec.shutdown();
	}
}
