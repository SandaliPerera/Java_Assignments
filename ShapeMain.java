class Shape{
	public void getArea();
}

class Rectangle extends Shape{

	public void getArea(double length,double width){
		System.out.println(length*width);
	}
}
class Triangel extends Shape{
	//@Override

	public void getArea(double base,double height){
		 System.out.println(length*width*0.5);
		
	}
}

class Circle extends Shape{
	//@Override

	public double getArea(double radius){
		System.out.println(radius*radius*3.14);
	}
}

class ShapeMain{

	public static void main(String[] args){

		Rectangle R1 = new Rectangle(15.5,10.1);
		//System.out.println(R1.getArea());
		getArea();

		Triangle T1 = new Triangle(10.5,5.5);
		//System.out.println(T1.getArea());
 		getArea();
		Circle C1 = new Circle(7.7);
		//System.out.println(C1.getArea());
 		getArea();
	}
}