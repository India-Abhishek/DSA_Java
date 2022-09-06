import java.util.Scanner;

public class DataTypeInOu {
    public static void newPro() {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int i    = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();              // gets rid of the pesky newline
        String s = scan.nextLine();
        scan.close();
        
        /* Print output */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            String str=scan.next();
            double d=scan.nextDouble();    
            scan.close();    
            System.out.println("String: " + str);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }    
}

