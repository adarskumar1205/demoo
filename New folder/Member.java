import java.util.Date;
import java.util.Objects;

public class Member {
	private long id;                 
	private String firstName;          
	private String lastName;            
	private String email;              
	private String contactNumber;       
	private String licenseNumber; 
	private Date licenseStartDate;     
	private Date licenseExpiryDate; 

	public Member() {
		super();
	}
	
	public Member(long id, String firstName, String lastName, String email, String contactNumber, String licenseNumber,
			Date licenseStartDate, Date licenseExpiryDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.licenseNumber = licenseNumber;
		this.licenseStartDate = licenseStartDate;
		this.licenseExpiryDate = licenseExpiryDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public Date getLicenseStartDate() {
		return licenseStartDate;
	}
	public void setLicenseStartDate(Date licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}
	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}
	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactNumber, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(contactNumber, other.contactNumber) && Objects.equals(email, other.email);
	}
	   
	
	

}
