
public class Traingle extends Shape implements TwoDimensionalShapeInterface {
	
	//properties
	private double base;
	private double  height;
	private double area;
	private String color;

	Shape Sh = new Shape();

	//constructor
	public Traingle(double base, double height, String color) {
		this.base=base;
		this.height=height;
		this.color= color;
		Sh.setCheck(2);
	}
	
	//methods
	public double calculateArea() {
		this.area= (0.5)*this.base* this.height;
		//System.out.println("The area of the square is: "+ area);
		return area;
	}
	
	public void printInfo() {
		System.out.println("The area of the traingle is: "+ this.area);
		System.out.println("The color of the traingle is: "+ this.color);
		System.out.println("The dimensions of the traingle are: ");
		System.out.println("Height: "+ this.height+ "    "+ "Base: " + this.base);
	}

	
	
	//getters and setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
