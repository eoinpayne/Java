
public class Contractor extends Person {
	private String companyContact;
	private String company;

	//getters and setters
	public String getCompanyContact() {
		return companyContact;
	}
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//constructor
	public Contractor(String firstName, String lastName, String email, IContact contact) {
		super(firstName, lastName, email, contact);
	
	}	
}
