import java.util.Scanner;

public class GreatestInThree {
    public static int gre(int a, int b, int c){
        if(a>b & a>c){
            return a;
        }
            else if(b>c & b>c){
               return b;
            }
        else{
            return c;
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sol=gre(a, b, c);
        System.out.println("Gretest Number is: "+sol);
        
        sc.close();
    }
}

