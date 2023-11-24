import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		long id;                 
		String firstName;          
		String lastName;            
		String email;              
		String contactNumber;       
		String licenseNumber; 
		String licenseStartDate;     
		String licenseExpiryDate;
		Member member1=null;
		Member member2=null;
		
		for(int i=0;i<2;i++) {
			System.out.println("Member"+(i+1)+" :");
			System.out.println("id:");
			id=scanner.nextLong();
			scanner.nextLine();
			
			System.out.println("first name:");
			firstName=scanner.nextLine();
			
			System.out.println("last name:");
			lastName=scanner.nextLine();
			
			System.out.println("email:");
			email=scanner.nextLine();
			
			System.out.println("contact number:");
			contactNumber=scanner.nextLine();
			
			System.out.println("license number:");
			licenseNumber=scanner.nextLine();
			
			System.out.println("license start date:");
			licenseStartDate=scanner.nextLine();
			
			System.out.println("license expiry date:");
			licenseExpiryDate=scanner.nextLine();
			
		
			try {
				Date startDate = new SimpleDateFormat("dd-MM-yyyy").parse(licenseStartDate);
				Date expiryDate = new SimpleDateFormat("dd-MM-yyyy").parse(licenseExpiryDate);
				
				if(i==0)
					member1=new Member(id, firstName, lastName, email, contactNumber, licenseNumber,
							startDate, expiryDate);
				else
					member2=new Member(id, firstName, lastName, email, contactNumber, licenseNumber,
							startDate, expiryDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
		}
		
		System.out.println("\nMember 1 \nName: " + member1.getFirstName() + " , " + 
							member1.getLastName());
		
		System.out.println("Member contact details: " + member1.getContactNumber() + " , " + 
				member1.getEmail());
		
		System.out.println("\nMember 2 \nName: " + member2.getFirstName() + " , " + 
				member2.getLastName());
		System.out.println("Member contact details: " + member2.getContactNumber() + " , " + 
				member2.getEmail());
		
		if(member1.equals(member2)) {
			System.out.println("\nMember 1 is same as Member 2");
		}
		else
			System.out.println("\nMember 1 and Member 2 are different");
	}

}
