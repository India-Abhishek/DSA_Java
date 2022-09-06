// Realational operators helps us to figure it out who is big,small,equal,and not equal betweeen them!
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    int j=s.nextInt();

    boolean eq= (i==j);
    boolean less= (i<j);
    boolean gre= (i>j);
    boolean lessEq= (i<=j);
    boolean greEq= (i>=j);
    boolean notEq= (i!=j);
    System.out.println("i is equal to j=             "+eq);
    System.out.println("i is less than j=            "+less);
    System.out.println("i is greater than j=         "+gre);
    System.out.println("i is less than equal to j=   "+lessEq);
    System.out.println("i is greater than equal to j="+greEq);
    System.out.println("i is not equal to j=         "+notEq);    
    }
}
