import java.util.Scanner;

public class PrintingNnum {
    public static void numbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        int ans=numbers(num);
        System.out.println(ans);
        
        

    }
    
}
