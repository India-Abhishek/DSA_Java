package vehicle;

public class VehicleUse {
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.setMaxSpeed(120);
        v.print();

        Car c = new Car(25, "Green", 280);
        //c.numGears = 6;
        //c.color = "yellow";
        //c.setMaxSpeed(320);

        Vehicle v2 = new Car(4, "blue", 120);
        

        c.print();
        v2.print();
        //c.printCar();



        
    }
}
