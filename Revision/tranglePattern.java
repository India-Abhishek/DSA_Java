import java.util.Scanner;

public class tranglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print trangle Number patterns: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+j-1);
            }
            System.out.println();
        }
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        System.out.println("Enter a number to print trangle STAR pattern: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Enter a number to print Reverse number pattern: ");
        int num2 = sc.nextInt();
        for(int i=1; i<=num2; i++){
            for( int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
        sc.close();

    }
    
}
