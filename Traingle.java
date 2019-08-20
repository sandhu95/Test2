
public class Traingle {
	
	//properties
	private int base;
	private int  height;
	
	//constructor
	public Traingle(int base, int height) {
		this.base=base;
		this.height=height;
	}
	
	//methods
	public void calculateArea() {
		double area= (0.5)*this.base* this.height;
		System.out.println("The area of the square is: "+ area);
	}
	
	
	//getters and setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
