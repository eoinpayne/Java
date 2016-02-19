package principlePractice;

public class Rectangle implements IShapes{
	double width;
	double height;
	double area;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		this.area = width*height;
	}
}
