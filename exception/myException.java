
class myException extends Exception 
{
	private final long serialVersionUID = 1L;

	private int code;
	private String msg;

	public myException() {
	}

	public myException(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
   
}
