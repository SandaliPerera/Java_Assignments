//18020569

public class Duck extends Animal{
    private int noOfWings;
	
    /** Construct default duck */
    public Duck() {
    }

    public Duck(String food,int legs,int noOfWings) {

        this.noOfWings=noOfWings;
        setEats(food);
        setNoOfLegs(legs);       
    }

    /** Return noOfWings */
    public int noOfWings() {
        return noOfWings;
    }
    /** Set noOfWings */
    public void noOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    } 

     public void quack() {
	
      }
}
