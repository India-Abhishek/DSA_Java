import java.util.Scanner;
public class checkArrayRoatation {
    public static void output(){
        
        int index=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=sc.nextInt();
        //taking input
        System.out.println("Enter elements of the array: ");
        int arr[]= new int[size];
        // inserting values in array
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();                    
                   
        }
        int min=arr[0];
        for(int i=0; i<size; i++){
            if(min>arr[i]){
                index=i;
            }
            System.out.print(arr[i]+" ");             
        }
        sc.close();
        System.out.println("\nArray has been rotated at Index no.: "+index);      

    }
    public static void main(String args[]){
        output();
    }    
}
