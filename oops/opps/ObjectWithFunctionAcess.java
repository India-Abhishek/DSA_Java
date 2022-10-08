package opps;

public class ObjectWithFunctionAcess {
    public static void main(String  [] args){
        //Creating an object
        ObjectWithFunction obj1 = new ObjectWithFunction();

        // Calling Setter method to set object properties
        obj1.name ="Tab";
        obj1.amount = 5999;

        // Calling gettier method to print/fetch object properties
        System.out.println(obj1.getName()+" "+obj1.getAmoun());

        ObjectWithFunction obj2 = new ObjectWithFunction();
        obj2.setName("Cover");
        obj2.setamount(299);

        System.out.println(obj2.name+" "+obj2.getAmoun());
    }
}
