
public class UserMainCode {
	public static int checkSum(int n) {
		int sum=0;
		
		while(n>0) {
			int digit=n%10;
			n/=10;
			
			if(digit%2 != 0) {
				sum+=digit;
			}
		}
		
		if(sum%2==0)
			return -1;
		
		return 1;
	}

}
