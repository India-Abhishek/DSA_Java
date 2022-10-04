import java.util.Scanner;

public class PrimeNum {
    public static boolean prime(int n){
        int d=2;
        while (d<n){
            if (n%d ==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n=sc.nextInt();
        
        boolean ans=prime(n);
        System.out.println("Input number is Prime number = "+ans);

        sc.close();

    }
    
}
