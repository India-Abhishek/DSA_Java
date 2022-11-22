package vehicle;

public class Vehicle {
    protected String color;
    private int maxSpeed;

// // constrector for vehicle
//     public Vehicle(String color, int maxSpeed){
//         this.color = color;
//         this.maxSpeed = maxSpeed;
//     }

// setter for max speed
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

// getter for max speed
    public int getMaxSpeed() {
        return maxSpeed;
    }

//Print function
    public void print(){
        System.out.println("Vehicle Color : " + color);
        System.out.println("Vehicle Max Speed : " + maxSpeed);

    }
    
}
