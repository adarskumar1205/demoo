
public class Student {
	private int studId;
	private String name;
	private double marks;
	private static int count;
	
	public Student() {
		super();
		count++;
		System.out.println("Student object is created");
		System.out.println("Total students : "+count);
	}
	
	
	public Student(int studId, String name, double marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.marks = marks;
	}


	public int getStudId() {
		return studId;
	}
	
	public void setStudId(int studId) {
		this.studId = studId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	


}
