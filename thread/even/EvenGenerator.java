
// �̳г����� IntGenerator
public class EvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;

	// ʵ�ֳ������еķ���
	public int next() {
		++currentEvenValue;
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
	
		// ֱ�ӵ���Ĭ�ϰ��µľ�̬���еľ�̬����
		EvenChecker.test(new EvenGenerator());
	}
}


