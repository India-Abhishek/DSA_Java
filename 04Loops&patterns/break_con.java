//printing numbers
import java.util.Scanner;

public class break_con {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            if ( i==5 ){
                continue;// it will skip the that part if the condition is true and will continue normally. 
            }
            else if( i==9 ){
                break; // if condition is true it will break and jump out from loop
            }
            System.out.println(i);
            
        }
        sc.close();
    }
    
}
