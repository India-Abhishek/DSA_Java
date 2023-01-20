import java.util.Scanner;

public class CharPattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('A'+i-1);
            while(j<=n){
                System.out.print(ch);
                ch=(char)(ch+1);

                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}