class TestException
{
	public static void main(String[] args) 
	{
		try
		{
			if(1 > 2) {
				throw new myException(0, "һ��������");
			} else {
				throw new myException(1, "�����...");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.msg);
			e.printStackTrace();
		}
	}
}
