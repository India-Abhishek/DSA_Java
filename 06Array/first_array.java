import java.util.Scanner;

public class first_array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int size =sc.nextInt();
        
        int arr[]= new int[size];

        System.out.println("Enter Elements: ");
        
        for( int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Elements are: ");
        for( int i=0; i<size; i++){
            System.out.print (arr[i]+ " ");
        }
      }
    
}
