import java.util.*;

class Test 
{
	//���� JAVA ��������ʱ��
	public static void main(String[] args) 
	{
		long s1 = 0;
		long s2 = 0;
		long s3 = 0;
		int sum = 0;

		try
		{
			Random random = new Random();
			List<String> list = new ArrayList<String>();

			//ѭ��(���������)��ʼʱ��
			s1 = System.currentTimeMillis();

			for(int i=0;i<1000000;i++)
				list.add(random.nextInt() + "");

			// xxx ��ѭ�����ʱ��
			s2 = System.currentTimeMillis();

			//ͬʱҲ�� xxx ��ѭ��(����)��ʼʱ��
			for(String a : list)
			{
				if (a.indexOf("99999") > 0)
				{
					sum++;
					System.out.println(a);

					//ȡ��ע�ͺ�,�ɼ����ҵ���һ������Ҫ�����ֵ��ʱ
					//return;
				}
			}
		}
		catch (Exception e)
		{ }
		finally
		{
			// ����ѭ�����ʱ��
			s3 = System.currentTimeMillis();

			System.out.println();
			System.out.println(sum + " ��");
			System.out.println();
			System.out.println(s2 - s1);
			System.out.println(s3 - s2);
		}
	}
}
