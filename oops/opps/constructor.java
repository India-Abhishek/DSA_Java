package opps;

public class constructor {
     int id;
     String name;

     void display(){
        System.out.println(id+" "+name);
     }
     
     public static void main(String[] args) {
        constructor s1 = new constructor();
        constructor s2 = new constructor();

        s1.display();
        s2.display();
     }
    
}
