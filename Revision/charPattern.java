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
        for(int i=1; i<=n; i++){
            char startingChar = (char)('A'+i-1);
            for(int j=1; j<=n; j++){
                System.out.print(startingChar);
                startingChar = (char)(startingChar+1);
            }
            System.out.println();
        }
    
    }
    
}
