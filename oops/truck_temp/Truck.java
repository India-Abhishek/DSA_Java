package truck_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle{
    int maxLoading;

    public Truck(int maxLoading, String color, int maxSpeed){
        super(color, maxSpeed);
        this.maxLoading = maxLoading;
    
    }

    public void print(){
        super.print();
        // here we called super class print so we dont have to write for SYS.out 
        // for that object which we are already printing in the super class 
        //we simply use super keyword to access parent's class constrector.
        System.out.println("truck capacity in kg : " + maxLoading);
        
    }
    


    public static void main(String args[]){
        Truck t = new Truck(4600, "Black", 256);
        // t.color = "Black";
        // t.maxLoading = 10000;
        // t.setMaxSpeed(265);
        Vehicle t2 = new Truck(20000, "pink", 320);
        t.print();
        t2.print();


    }
}