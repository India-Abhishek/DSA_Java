import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt(); //amount
      int r=s.nextInt();  // percentage
      int t=s.nextInt(); //time
      s.close();
      int si=(a*r*t)/100; //Simple Intrest Formula
      
      System.out.println("Enter Amount /n percentage /n time");


      System.out.println("Intrest="+si); //Printing Value

      // int i =(int)"c";
      // System.out.println(i);
    }
}
  