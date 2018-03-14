import java.util.*;
import java.util.Map.*;

class  AccClass
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		// HashMap �ĵ�����ʽ
		HashMap<String, String> hm = new HashMap<>();

		for (byte i=0;i<10 ;i++ ){
			hm.put("name #" + i, "jarod #" + i);
		}

		// ��һ�ֵ�����ʽ
		for (String key : hm.keySet()){
			System.out.println(key + "||" + hm.get(key));
		}
		
		System.out.println();

		// �ڶ��ֵ�����ʽ
		Iterator iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			Entry<String, String> entry = (Entry<String, String>) iter.next();
			System.out.println(entry.getKey() + "||" + entry.getValue());
		}
		
		System.out.println();

		// �����ֵ�����ʽ
		for (String v : hm.values() )
		{
			System.out.println(v);
		}

		System.out.println();

		// �����ֵ�����ʽ
		for (Entry<String, String> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + "||" + entry.getValue());
		}

		System.out.println();
		System.out.println(hm.values());
		System.out.println();
		
		// HashMap ������
        List<Entry<String,String>> list = new ArrayList<Entry<String,String>>(hm.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,String>>() {
            public int compare(Entry<String, String> o1,
                    Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

		for(Entry<String, String> mapping:list){
			System.out.println(mapping.getKey() +"||"+ mapping.getValue());
		}
	}
}