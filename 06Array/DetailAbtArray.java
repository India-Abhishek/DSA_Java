import java.util.Scanner;

public class DetailAbtArray {

    public static int[] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt(); // taking the size from the user

        int arr[]= new int[size]; // creating an array with the size which is given by an user.
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<size; i++){ //taking input the elements in array.
            arr[i]=sc.nextInt();
        }
        sc.close();        
        return arr;
    }

    public static int[] sum(int arr[]){
        System.out.println("Elements of array are: ");
        int size= arr.length;
        for(int i=0; i<size; i++){            // printing value of index by going one by one at index of the array.
            System.out.print(arr[i]+" ");
        }
        return arr;
  
    }
       
    public static void main(String args[]){
        int arr[]=input();
        int result[]=sum(arr);
        System.out.println("\n\n Your array details is: " +result );
        System.out.println("the first squre it's means it is an arry and 'I' means the data type of array and after @ that is actully the address of the location");       
    } 
    
}