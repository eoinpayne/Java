
public class GeneralEmployee extends Person implements IContact{
	
	private String jobTitle;
	private double salary;
	
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
	
	public GeneralEmployee(String firstName, String lastName, String email, IContact contact) {
		super(firstName, lastName, email, contact);
		
	}
	




}//closes class
