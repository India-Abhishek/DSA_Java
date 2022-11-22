package vehicle;

public class Car extends Vehicle{
    int numGears;
    boolean isPetrol;

    public void print(){
        // System.out.println("Vehicle Color : " + color);
        // System.out.println("Vehicle Max Speed : " + getMaxSpeed());
        super.print();
        System.out.println("Vehicle numGears : " + numGears);
        System.out.println("Vehicle isPetrol : " + isPetrol);

    }
    
}
