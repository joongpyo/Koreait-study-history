package jdbcPrj05;

public class Member {
	private int id;
	private String email;
	private String passwd;
	private String name;
	private String depart;
	private String position;
	private int salary;
	private String startDate;
	private String endDate;
	
	
	public Member() {}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;	
	}
		
	


	@Override
	public String toString() {
		return "회원번호: "+id+", "
				+ "이메일: "+email+", "
				+ "비밀번호: "+passwd+", "		
				+ "이름: "+name+", "				
				+ "부서명: "+depart+", "					
				+ "직위: "+position+", "
				+ "급여: "+salary+", "
				+ "입사일: "+startDate+", "
				+ "퇴사일: "+endDate;
	}
	
	
	
}
