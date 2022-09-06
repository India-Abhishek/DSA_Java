import java.util.Scanner;

public class Array1D {
    
        public static void main(String[] args) {
           
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter size of arr: ");
            int n=scan.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter elements in array");
            for(int i=0; i<n; i++){
                arr[i]=scan.nextInt();
            }
            scan.close();
    
            System.out.println("Array elements are: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

