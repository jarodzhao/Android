public class Bank 
{
	// �˻��ܶ�Ϊ 1000
	protected static int money = 1000;

	public void Counter(int money) {
		Bank.money -= money;
		System.out.println("��̨ȡ���� " + money + ", ��ʣ�� " + (Bank.money));
	}

	public void ATM(int money) {
		Bank.money -= money;
		System.out.println("ATM ȡ���� " + money + ", ��ʣ��" + (Bank.money));
	}
}
