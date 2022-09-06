public class ArrayUse {
    public static void main(String args[]){
        int arr[]=new int[10]; //Creating a new int type array of size 10.

        arr[3]=15; //we are giving a value to the index number or can say storing a value to that index.

        System.out.println(arr[3]);// printing the index value

        char arr2[]=new char[15]; // creating character type of array.
        double Darr[]=new double[9]; // creating double type of array.

        arr2[5]='a';
        Darr[8]=10.5;
        System.out.println(arr2[5]);
        System.out.println(Darr[8]);
    }
    
}
