import java.util.Scanner;

public class UsingFunctionLargestAmongThree {
    public static int [] input(){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];

        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int gretestEle(int arr[]){
        int max=arr[0];
        int size=arr.length;
        for(int i=1; i<size; i++){
            if (arr[i]>max){
                max=arr[i];   
            }
        }    
        return max;
    }

    public static void main(String args[]){
        System.out.println("Firstly Enter the size of the array And then also Enter elements: ");

        int arr[]=input();
        int large =gretestEle(arr);
        System.out.println("Largest element of the array: "+ large);
    }

}