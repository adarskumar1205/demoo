import java.util.Arrays;

public class TestArray2 {
	public static void main(String[] args) {
		int[] num=new int[] {32,54,34,65,32,34};
			
		Arrays.sort(num);
		int j=0;
		for(int i=0;i<num.length-1;i++) {
			if(num[i]!=num[i+1]) {
				num[j++]=num[i];
			}		
		}
		
		num[j++]=num[num.length-1];
		
		for(int i=0;i<j;i++) {
			System.out.println(num[i]);
		}
	}

}
