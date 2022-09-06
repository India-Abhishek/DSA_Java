import java.util.Scanner;

public class ArraySum {

    public static int input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;

        System.out.println("Enter Elements of the array: ");
        sc.close();
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){        
        int sum= input();
        System.out.println("Sum of the array is: " + sum);
        
    }
    
}
