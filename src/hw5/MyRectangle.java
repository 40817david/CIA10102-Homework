package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	//建構子
	
	public MyRectangle() {
		super();
	}
	
	public MyRectangle(double width , double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	//方法
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		double area = 0;
		area = width * depth ;
		return area;
	}
}
