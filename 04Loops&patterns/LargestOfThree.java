import java.util.Scanner;

public class LargestOfThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();

        if(a>b && a>c){
            System.out.println("Gretest Number is="+a);
        }
            else if (b>a && b>c){
                System.out.println("Gretest Number is="+b);
            }
        
        else{
            System.out.println("Gretest Number is="+c);
        }
    }
    
}
