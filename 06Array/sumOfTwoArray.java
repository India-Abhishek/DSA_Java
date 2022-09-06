import java.util.Scanner;

public class sumOfTwoArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st arr: ");
        int n1=sc.nextInt();
        int arr1[]= new int[n1];
        System.out.println("Enter elements in 1st array");
        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of 2nd arr: ");
        int n2=sc.nextInt();
        int arr2[]= new int[n2];
        System.out.println("Enter elements in 2nd array");
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();
        int sum[]=new int[n1>n2? n1:n2]; // if n1 is greater then value will be n1 else n2
        int count= 0;

        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int d=count;
            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d += arr2[j];
            }
            count= d/10;
            d= d % 10;
            sum[k]=d;

            i--;
            j--;
            k--;
        }
        if(count > 0){
            System.out.print(count);
        }
        for(int val: sum){
            System.out.print(val);
        }
    }
    
}
