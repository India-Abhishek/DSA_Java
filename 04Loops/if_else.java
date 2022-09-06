import java.util.Scanner;
public class if_else {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        int i=scan.nextInt();
        scan.close();
        int rem= i%2;
        
        if(rem==0)
        {
        System.out.println("Even Number");
        }
        else
        {
        System.out.println("Odd Number");
        }

    }
    
}
