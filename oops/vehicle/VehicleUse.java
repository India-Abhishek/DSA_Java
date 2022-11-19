package vehicle;

public class VehicleUse {
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.setMaxSpeed(120);
        v.print();

        Car c = new Car();
        c.numGears = 6;
        c.color = "yellow";
        c.setMaxSpeed(320);

        c.print();
        //c.printCar();



        
    }
}
