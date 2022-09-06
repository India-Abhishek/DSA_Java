import java.util.Scanner;

public class ChackingPrime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        sc.close();
        int d=2;
        while (d<=n-1){
            if(n%d==0){
                System.out.println("Not Prime");
                return;
            }
            d+=1;
        }
        
        System.out.println("Prime number");
    }
    
}
