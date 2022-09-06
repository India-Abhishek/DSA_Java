import java.util.Scanner;

public class NcR {
    public static int fact(int n){
        int ans = 1;
        for(int i=1; i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input N: ");
        int n=sc.nextInt();

        System.out.println("Input R: ");
        int r=sc.nextInt();

        int num= fact(n);
        int dim1= fact(r);
        int dim2= fact(n-r);

        int ncr= num/(dim1 * dim2);

        System.out.println("NcR= "+ncr);

        
    }
    
}
