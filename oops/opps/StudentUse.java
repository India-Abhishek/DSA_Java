package opps;

public class StudentUse {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name="Abhishek";
        s1.roll=123;

        System.out.println(s1.name+" "+s1.roll);

        // Using constructor creating an object
        ConstrectorStudent s2 = new ConstrectorStudent("Anand", 8430);
        System.out.println(s2.name);
    }
    
}