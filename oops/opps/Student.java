package opps;

public class Student {
    String name;
    int roll;
    private String course;

// Creating Setter function to set object properties
     public void setName(String n){
        name = n;
    }

    public void setamount(int r){
        roll = r;
    }

// Creating gettier method to set object properties
    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

// Creating a constructor
    public Student(String StudentName, int StudentRoll){
        name = StudentName;
        roll = StudentRoll;
        course = "B.tech";//giving them by defult value
    }
//>> Since you created ur own constructor The defult constrector will not work any more.

// Creating a print function
    public void print(){
        System.out.println(name+" : "+roll+" : "+course);

    }

    
}
