import java.util.Arrays;

public class TestArray1 {
	
	public static void main(String[] args) {
		int[] num=new int[] {32,54,34,65,32,34};
		
		//for(int i=0;i<num.length;i++) {
			
		Arrays.sort(num);
		
		for(int i=1;i<num.length;i++) {
			if(num[i]==num[i-1])
				System.out.println(num[i]);
		}
	}

}
