public class PersonB extends Thread 
{
	Bank bank;
	
	// ͨ���������������ж���ȷ�������˽������ͬһ�����У��̣߳�
	public PersonB(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		while (Bank.money >= 200)
		{
			// ATM ȡ�����
			bank.ATM(200);
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
