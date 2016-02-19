
public class storageContainer {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		students s1 = new students ("Stuart");
		students s2 = new students ("Joe");
		students s3 = new students ("Fred");
	
		IStorage container = new ContainerOfStorage();
		container.add(s1);
		System.out.println(container.size());
	
	}

}
