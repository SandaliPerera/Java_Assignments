class Person{
	int nic;
	String name;
	double height;
	double weight;
	int salary;

	void setPersonalDetails(int nic,String name,double height,double weight,int salary){
	
		this.nic=nic;
		
		this.name=name;
		
		this.height=height;
		
		this.weight=weight;

		this.salary=salary;
	}

	void showPersonalDetails(){
				
		System.out.println("NIC="+ nic+", Name= "+name+", Height = "+height+", Weight = "+weight+ ", salary ="+salary);

	}
}
public class RunPerson{
	public static void main(String[] args){

	Person p1 = new Person();
	p1.setPersonalDetails(12345,"Anne",5.2,45.8,52000);
	p1.showPersonalDetails();

	Person p2 = new Person();
	p2.setPersonalDetails(23456,"Bob",6.5,57.6,50000);
	p2.showPersonalDetails();

	p1.setPersonalDetails(34567,"Cindy",4.8,45.1,35000);
  	p1.showPersonalDetails();
 }

}