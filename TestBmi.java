//index_no 18020569

class BMI{

	private double weight;
	private double height;

	public void setValues(double weight,double height){
		this.weight= weight;
		this.height= height;
	}
	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}
	public double bmi(){
		return weight/Math.pow(height,2);
	}
}

public class TestBmi{
	public static void main(String arg[]){
		BMI val1 = new BMI();
		val1.setValues(43.3,1.65);
		System.out.println("The BMI value is : "+ val1.bmi());	
	}
}
	