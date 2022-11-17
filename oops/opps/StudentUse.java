package opps;

public class StudentUse {
    public static void main(String [] args){      
/*

        Student s1 = new Student();
        s1.name="Abhishek";
        s1.roll=123;

        System.out.println(s1.name+" "+s1.roll);

        //Creating an object
        Student s2 = new Student();

        // Calling Setter method to set object properties
        s2.name ="Aman";
        s2.roll = 201390;

        // Calling gettier method to print/fetch object properties
        System.out.println(s2.getName()+" "+s2.getRoll());    

*/

        // Using constructor create an object
        Student s3 = new Student("Anand", 8430);
        Student s4 = new Student("Abhishek", 345);
        //System.out.println(s3.name);

        //since you using ur own constructor The defult constrector will not work any more.

        // Print using print function.
        s3.print();
        System.out.println("number of student = " + Student.getNumStudent());
        

    }
    
}
