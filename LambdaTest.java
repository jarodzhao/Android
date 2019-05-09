import java.util.*;

class LambdaTest 
{
	public static void main(String[] args) 
	{
		String nick[] = {
			"jarodzhao",
			"ht_z",
			"zhaoht",
			"zhaohaitao",
			""
		};

		List<String> nicks = Arrays.asList(nick);



//		for ����
//		for(String nk : nick)
//			System.out.println(nk);


		// lambda ���ʽ
		nicks.forEach(nk -> System.out.println(nk));


		// ˫ð�Ų�������double colon operator��
		nicks.forEach(System.out::println);


	}
}
