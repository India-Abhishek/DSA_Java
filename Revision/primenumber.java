import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check prime or not");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }

        if(count == 2){
            System.out.println(n+ " is Prime number");
        }
        else{
            System.out.println(n+ " is not a Prime number");
        }
        sc.close();

    }
    
}
