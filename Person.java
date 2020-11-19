class PersonDetails{
int nic;
String name;
double height;
double weight;
int salary;

	void setPersonalDetails(int nic, String name, double height, double weight,int salary){
		this.nic=nic;
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.salary=salary;
	}

	void showPersonalDetails(){
		System.out.println(nic+" "+name+" "+height+" "+weight+" "+salary);
	}
}
public class Person{
	public static void main(String args[]){
		PersonDetails p1 = new PersonDetails();
		p1.setPersonalDetails(12345,"sanu",5.6,65.3,250000);
		p1.showPersonalDetails();
	}	
}