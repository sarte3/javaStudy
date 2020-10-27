package a1;

public class StudentDTO {

	private String name;
	private String department;
	private String id;
	private double grade;
	
	StudentDTO(){}
	
	StudentDTO(String name, String department, String id, double grade){
		this.name=name;
		this.department=department;
		this.id=id;
		this.grade=grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
