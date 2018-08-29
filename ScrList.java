import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ScrList {
    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("#" + i);
        }
        scrList(list, String.class);

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        scrList(list2, Integer.class);
    }

	// ����ĵ���
    public static <T> List<T> scrList(List<T> list, Class<T> clz) throws Exception {

        for (int i = 0; i < list.size(); i++) {

            T t = list.get(i);

			// ��ȡ����ķ���
            Method method = clz.getDeclaredMethod("toString");

			// ��ҪԤ��֪���÷������ص�����
            String ss = (String) method.invoke(t);

            System.out.println(t + " ---- " + t.getClass() + " ---- " + ss);

        }

        return list;
    }
}
