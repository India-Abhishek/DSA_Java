//sum of n numbers
import java.util.Scanner;

public class for_loop2 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0; 
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            sum=sum+i;         // adding value in sum every time till condition true (i<=n)
        }
        System.out.println(sum);
    }
    
}
