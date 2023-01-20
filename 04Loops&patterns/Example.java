/*
Problem: Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
*/

import java.util.Scanner;

public class Example {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        sc.close();

        if((i>=65) && (i<=81)){
            System.out.println("0");
        }
        else if((i>=97) && (i<=123)){
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }
    
}
