//18020569

public class Cat extends Animal{
    private String color;
    private String name;
	
    /** Construct default cat */
    public Cat() {
    }

    /** Construct a cat with specified food and legs*/
    public Cat(String food,int legs) {
        setEats(food);
        setNoOfLegs(legs); 
    }

    /** Construct a cat with the specified legs,color and name **/
    public Cat(String food,int legs, String color,String name) {

        this.color = color;
	this.name=name;
        setEats(food);
        setNoOfLegs(legs);       
    }

    /** Return color */
    public String getColor() {
        return color;
    }
    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    } 

    /** Print the name */
     public void printName(String name) {
     System.out.println("Name of the cat is " + name);
      }
}
