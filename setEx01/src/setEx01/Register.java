package setEx01;

public class Register {
	private int id;
	private String userid;
	private String passwd;
	
	public Register() {}

	public Register(int id, String userid, String passwd) {
		this.id = id;
		this.userid = userid;
		this.passwd = passwd;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	
	

	public void disp() {
		System.out.println("회원번호 : "+id+", 회원아이디 : "+userid+", 회원비밀번호 : "+passwd);
	}
	
	
}
