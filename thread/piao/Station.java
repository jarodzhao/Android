import java.util.Random;

// ��Ʊ����
public class Station extends Thread {

	public Station(String name) {
		super(name);
	}

	// ��Ʊ��
	static int tick = 20;

	// ������������ Կ��
	static Object ob = "aa";

	@Override
	public void run(){
		while (tick > 0) {
			synchronized(ob) {	//ʹ��Կ������ tick ???
				if (tick > 0) {
					System.out.println(getName() + "�����˵� " + tick + " ��Ʊ");
					tick--;
				} else {
					System.out.println("Ʊ�Ѿ�������");
				}
			}
			try {
				sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
