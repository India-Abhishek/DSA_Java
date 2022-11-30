package opps;

public class Student {
    String name;
    int roll;
    private String course;

    private static int numStudent; // Creating a pvt static integer data type who stores number of students 

// Creating Setter function to set object properties
    public void setName(String n){
        name = n;
    }

    public void setRoll(int r){
        roll = r;
    }

// creating a static function which dosent depend on any object
    public static int getNumStudent(){
        return numStudent;
    }

// Creating gettier method to set object properties
    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

// Creating a constructor 
    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
        course = "B.tech";//giving them by defult value
        numStudent++; // incrementing value of numStudent whenever we are creating a new student oblect
    }
//>> Since we created ur own constructor The defult constrector will not work any more.

// Creating a print function
    public void print(){
        System.out.println(name+" : "+roll+" : "+course);

    }
    
}
