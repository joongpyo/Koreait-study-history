package tut07;

public class Register {
	//1.필드
	//2.생성자 : 기본 생성자 , 파일이름과 동일한지
	//3.getter, setter
	//4.메소드
	
	private String email;
	private String passwd;
	private String uname;
	
	public Register() {}
	
 	public Register(String email, String passwd, String uname) { //메인에서 받아서 필드에 저장
		this.email = email; //필드
		this.passwd = passwd;
		this.uname = uname;
	}

	//getter  - 필드에 있는 값을 가져옴
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String disp() {
		return "이메일: "+getEmail()+", 비밀번호: "+getPasswd()+", 이름 : "+getUname();
	}
	
	
	
}
