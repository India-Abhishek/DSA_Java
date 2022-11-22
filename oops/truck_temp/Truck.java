package truck_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle{
    int maxLoading;

    public void print(){
        super.print();
        System.out.println("truck capacity : " + maxLoading);
        
    }
    


    public static void main(String args[]){
        Truck t = new Truck();
        t.color = "Black";
        t.maxLoading = 10000;
        t.setMaxSpeed(265);

        t.print();


    }
}