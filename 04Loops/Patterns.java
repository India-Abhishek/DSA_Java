// Printing n*n type of patterns.

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;    
        } 
        n--;    
    }
    
}
