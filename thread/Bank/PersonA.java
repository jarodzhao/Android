public class PersonA extends Thread 
{
	Bank bank;

	// ͨ���������������ж���ȷ�������˽������ͬһ�����У��̣߳�
	public PersonA(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		while (Bank.money >= 100)
		{
			// ��̨ȡǮ����
			bank.Counter(100);
			try
			{
				sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
