import java.util.concurrent.*;
import java.util.*;

class ThreadWithResult
{
	public static void main(String[] args){
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<>();

		// ѭ�� 10 �Σ��� i ֵ�������߳���
		for(byte i=0;i<10;i++)

			// submit ����ִ���̣߳��������߳�ִ�еĽ��
			results.add(exec.submit(new CallableDemo(i)));

		// ���� results ��������е�����ֵ��Future��
		for(Future<String> fs:results){
			try
			{
				System.out.println(fs.get());
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
				return;
			}
			catch (ExecutionException e)
			{
				System.out.println(e);
			}
			finally
			{
				exec.shutdown();
			}
		}
	}
}

// ���Է��ؽ�����̶߳���
class CallableDemo implements Callable<String> 
{
	private int id;
	
	// �����߳�ʱ����һ������ id
	public CallableDemo(int id){
		this.id = id;
	}

	// ����̹߳���ʵ��ʱ���յ� id
	public String call(){
		return id + " thread...";
	}
}
