import java.util.Scanner;

public class Arraytry {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter Element of Array:");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of Array:");
        sc.close();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
    
}
