import java.util.Scanner;

public class TakingEleInArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt(); // taking the size from the user

        int arr[]= new int[size]; // creating an array with the size which is given by an user.

        for(int i=0; i<size; i++){ //taking input the elements in array.
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of array are: ");

        for(int i=0; i<size; i++){            // printing value of index by going one by one at index of the array.
            System.out.print(arr[i]+" ");
        }
        sc.close();
  
    }
    
}
