import java.util.*;
import java.text.*;

class Test
{
	public static void main(String[] args) throws ParseException
	{
		String a = "-1";

        System.out.println(a == "-1");
        
	}
}


public <T> List<T> screenedList(List<T> list, Class<T> clz, String exec_status, String exec_time) throws Exception
	{
		int status = -1;	// ��ʼ��״ֵ̬
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(new Date());

		Iterator<T> iter = list.iterator();
		
		while (iter.hasNext())
		{
			T obj = iter.next();
			Method method = clz.getDeclaredMethod("getExec_time");
			String execTime = (String) method.invoke(obj);
			
			if(execTime == null) {
				iter.remove();			// ��ʷ���ݣ�û��ִ��ʱ�䣬ֱ���ų�
				continue;
			} else if(exec_status != null && !exec_status.equals("") && !exec_status.toLowerCase().equals("null")) {
				String[] days = execTime.split(",");
				
				String startDay = days[0];
				String endDay = "";
				
				if(days.length > 1)
					endDay = days[days.length -1];
				else
					endDay = days[0];
				
				long start = sdf.parse(startDay).getTime();
				long end = sdf.parse(endDay).getTime();
				long to = sdf.parse(today).getTime();
				
				if(to < start) {
					status = 0;
				} else if((to >= start) && (to <= end)) {
					if(execTime.contains(today))
						status = 1;
					else
						status = 2;
				} else if(to > end) {
					status = 3;
				}
				
				// �ȶ�״ֵ̬��ȷ���Ƿ��Ƴ�
				if(status != Integer.parseInt(exec_status))
					iter.remove();		// ��״̬
			}
		}
		return list;
	}