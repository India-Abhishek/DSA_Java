package vehicle;

public class Car extends Vehicle{
    int numGears;
    boolean isPetrol;

    public Car(int numGears, String color, int maxSpeed){
        super(color, maxSpeed);
        this.numGears = numGears;
    }

    public void print(){
        // System.out.println("Vehicle Color : " + color);
        // System.out.println("Vehicle Max Speed : " + getMaxSpeed());
        super.print();
        // here we called super class print so we dont have to write for SYS.out 
        // for that object which we are already printing in the super class 
        //we simply use super keyword to access parent's class constrector.
        System.out.println("Vehicle num Gears : " + numGears);
        System.out.println("Vehicle is Petrol : " + isPetrol);

    }
    
}
