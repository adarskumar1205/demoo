import java.util.Scanner;

public class TestStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter object details");
		String str = scanner.next();
		
		String[] strArr=str.split(",");
		
		int id=Integer.parseInt(strArr[0]);
		double mark=Double.parseDouble(strArr[2]);
		
		Student student1 = new Student(id,strArr[1],mark);
		
		System.out.println(student1.getStudId());
		System.out.println(student1.getName());
		System.out.println(student1.getMarks());
	}

}
