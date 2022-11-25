import java.util.Scanner; //Importing inbuild Scanner
public class addTonum {
    public static void main(String args[]) {
    
        Scanner scan= new Scanner(System.in); //Creating a Scanner which is taking input from system

        System.out.println("Enter 1st number");
        int i=scan.nextInt(); // using funcilty of scanner... taking input is as Integer!
        System.out.println("Enter 2nd number");
        int j=scan.nextInt();
        scan.close();
        int sum=i+j; //adding 

        System.out.println("Addition = "+sum);
        
    }
    
}
