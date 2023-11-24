import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number=scanner.nextInt();
		
		int result = UserMainCode.checkSum(number);
		
		if(result==1) {
			System.out.println("Sum of odd digits is odd");
		}
		else
			System.out.println("Sum of odd digits is even");
	}

}
