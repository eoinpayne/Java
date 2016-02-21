
public class GeneralEmployee extends Person implements IContact{
	
	private String jobTitle;
	private double salary;
	private String dob;
	
	//getters & setters
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getSalary() {		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setdob (String dob){
		this.dob = dob;
	}
	public String getdob(){		return dob;
	}
	
	
	public GeneralEmployee(String firstName, String lastName, String email, IContact contact, String dob) {
		super(firstName, lastName, email, contact);		
		this.dob = dob;
	}
	




}//closes class
