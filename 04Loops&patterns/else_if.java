import java.util.Scanner;

public class else_if {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        s.close();

        if((a>=b) && (a>=c)){
        System.out.println("Greatest="+a);
        }
        else if ((b>=a) && (b>=c)){
            System.out.println("Greatest="+b);
        }
        else {
            System.out.println("Greatest= "+c);
        }
    }
    
}
