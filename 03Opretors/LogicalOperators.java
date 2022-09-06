import java.util.Scanner;

public class LogicalOperators {
    public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();

    boolean aisL= (a>=b) && (a>=c);
    System.out.println(aisL);
    System.out.println((a>=b) || (a>=c));
    System.out.println(!(a>=b));    
    }
}
