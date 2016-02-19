package principlePractice;

public class Circle implements IShapes{
	private double radius;
	private double area;
	
	
	public Circle(double radius) {
		this.radius = radius;
		this.area = Math.PI * radius * radius;
		
	}
	public double area(){
		return this.area;
	}
	
}

