package vehicle;

import java.util.Scanner;

import truck_temp.Truck;

public class VehicleUse {
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.setMaxSpeed(120);
        //v.print();

        Car c = new Car(25, "Green", 280);
        //c.numGears = 6;
        //c.color = "yellow";
        //c.setMaxSpeed(320);

        Vehicle v2 = new Car(4, "blue", 120);
        

        //c.print();
        v2.print();
        //c.printCar();

        Vehicle t = new Truck(2999, "White", 190);

        t.print();

        Scanner sc = new Scanner(System.in);
        int speed;
        System.out.println("Enter Speed : ");
        speed = sc.nextInt();

        String color;
        System.out.println("Enter Color : ");
        color = sc.next();

        int maxloading;
        System.out.println("Enter capacity of Truck max loading :");
        maxloading = sc.nextInt();

        Vehicle t4 = new Truck(maxloading, color, speed);
        System.out.println("--------- Input Vehicle Details ---------");

        t4.print();



        sc.close();        
    }
}
