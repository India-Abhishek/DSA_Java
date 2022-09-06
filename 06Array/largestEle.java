import java.util.Scanner;
public class largestEle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        int max=-10000;

        System.out.println("Enter Size of an array: ");
        size =sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements: ");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0; i< arr.length; i++)
            if(arr[i]>max)
            max=arr[i];
        System.out.println("largest in given array is: "+max);
        
    }
    
}
