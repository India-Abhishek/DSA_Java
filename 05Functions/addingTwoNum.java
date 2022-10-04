import java.util.Scanner;

public class addingTwoNum {
    public static int add(int n, int m){
        int sum= n+m;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sol=add(a, b);
        
        System.out.println(sol);
    
        sc.close();
    }
    
}
