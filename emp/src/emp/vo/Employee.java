package emp.vo;

import java.time.LocalDate;

public class Employee {
	// 필드
	// 생성자
	// getter, setter
	// 출력 메소드

	private Long id;
	private String dept;
	private String name;
	private int salary;
	private LocalDate startDate;
	private LocalDate endDate;

	public Employee() { }

	public Employee(Long id, String dept, String name, int salary, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.dept = dept;
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", name=" + name + ", salary=" + salary + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
