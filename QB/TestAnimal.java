//18020569

public class TestAnimal{

	 public static void main(String[] args) {
        
	Cat cat1 = new Cat("milk",4,"black","kitty");
	
	System.out.print(cat1.printName());
	System.out.print("Cat eats "+ cat1.getEats());
	System.out.print("Cat has "+cat1.setNoOfLegs()+"legs");
	System.out.print("Cat color is "+ cat1.setColor());	

	Duck duck1 = new Duck("vegetable",2,2);
	
	System.out.print("Duck eats "+ duck1.getEats());
	System.out.print("Duck has "+duck.setNoOfLegs()+"legs");
	System.out.print("Duck can "+ duck1.quack());	
    }

}