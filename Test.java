// import java.util.Random;

class Test
{
	public static void main(String[] args)
	{
		//Random rand = new Random();
		//print(3 + 1.5);	// �Զ�ת��Ϊ Double ����

		while(condition()){
			print("---------------------------");
		}
		print("Exited 'while'");
	}

	// ������ķ���
	static boolean condition()
	{
		double i = Math.random();
		print(i);
		return i < 0.99;
	}

	// �����������
	static void print(Object o)
	{
		// �ж϶����Ƿ�Ϊ String ����
		if (o instanceof String)
			System.out.println(o);
		else {
			System.out.println(o.toString());
			System.out.println(o.getClass().toString());
		}
	}
}