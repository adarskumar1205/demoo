import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a choice: \n\t 1.Rectangle \n\t 2.Circle");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			shape=new Rectangle(5.00,7.89);
			break;
		case 2:
			shape = new Circle(3.99);
			break;
			
		default:
			System.out.println("lets try again");
		}
		
		if(shape!=null)
			shape.calcArea();

	}

}
