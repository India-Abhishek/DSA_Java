package opps;

public class DynamicArrayUse {
    public static void main(String args[]){
        DynamicArray d = new DynamicArray();

        for(int i=0; i<100; i++){
            d.add(i+10);
        }

        d.set(45, 3);
        System.out.println(d.get(2));
        System.out.println(d.get(3));

        //d.isEmpty();

        System.out.println(d.size());
        d.print();
    }
    
}
