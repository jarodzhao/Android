import java.util.*;

// �򵥷���ʾ��
public class GM
{
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) 
	{
		GM gm = new GM();
		gm.f(1);
	}
}
