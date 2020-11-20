//18020569

public class Animal {
    private String eats = "";
    private int noOfLegs;

    /* Construct a default animal */

    public Animal() {
    }

    /* Construct an animal with the specified food type and legs */

    public Animal(String food, int legs) {
        this.eats = food;
        this.noOfLegs = legs;
    }
    /* get new eats */

    public String getEats() {
        return eats;
    }
    /* Set new Eats */

    public void setEats(String eats) {
        this.eats = eats;
    }
    /* Return no Of Legs */
    public int getNoOfLegs() {
        return noOfLegs;
    }
    /* print */
    public int setNoOfLegs(int noOfLegs) {
	this.noOfLegs=noOfLegs;
	return noOfLegs;

//        System.out.print("Eats: " + eats + " and no of legs: " + noOfLegs);
    }
     
}
