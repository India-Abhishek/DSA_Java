import java.util.Scanner;

public class charPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print char pattern");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=n; i++){
            char startingChar = (char)('A'+i-1);
            for(int j=1; j<=n; j++){
                System.out.print(startingChar);
                startingChar = (char)(startingChar+1);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
        
        for(int i=1; i<=n; i++){
            char ch=(char)('A'+i-1);
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            char ch=(char)('A'+i-1);
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    
}
