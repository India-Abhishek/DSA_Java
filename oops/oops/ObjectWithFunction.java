package oops;

public class ObjectWithFunction {
    String name;
    int amount;

// Creating function
    // Creating Setter function to set object properties
    public void setName(String n){
        name = n;
    }

    public void setamount(int r){
        amount = r;
    }

    // Creating gettier method to set object properties
    public int getAmoun(){
        return amount;
    }

    public String getName(){
        return name;
    }
}
