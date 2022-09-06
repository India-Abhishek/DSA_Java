import java.util.Scanner;

public class ArrUningFun {
    public static int[] input(){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int input[]= new int[size];
        
        for (int i=0; i<size; i++){
            input[i]=sc.nextInt();
        }
        sc.close();
        return input;      

    } 

    public static void printArr(int input[]){
        int size= input.length;
        for (int i=0; i<size; i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();

    }
        public static void main(String args[]){
        
        System.out.println("Firstly Enter the size of the array And then also Enter elements: ");

        int arr[]=input();
        printArr(arr);

    }    
}
