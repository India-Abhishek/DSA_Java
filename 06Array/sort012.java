import java.util.Scanner;

public class sort012 {
    public static void sort(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){                                                          //this code is now complite RN.
            arr[i]=sc.nextInt();
        }
       int[]output=new int[size];
       System.out.println("Enter elements in array: ");
        for(int i=0; i>size; i++){
            for(int j=0; j<size; i++){
                if(output[j]>arr[i]){
                    output[j]=arr[i];
                }
            }
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");            
        }
        System.out.println();;
    }
    public static void main(String args[]){
        sort();
    }
}
