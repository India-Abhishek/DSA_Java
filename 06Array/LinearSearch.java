import java.util.Scanner;

public class LinearSearch {

    public static int input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter Elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to Search and find the index: ");
        int find=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==find){
                return i;
            }
            sc.close();
        }
        
        return -1;
    }
    public static void main(String args[]){
        int index=input(); // dont be confused bro we are passing the input function. HEHE!
         
        if (index!=-1)
        System.out.println("Element Found at index no: "+index);
        else
        System.out.println("Element not found");
    }   
}
