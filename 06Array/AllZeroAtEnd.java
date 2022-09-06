import java.util.Scanner;

public class AllZeroAtEnd {
    
    public static void zeroAtend(int arr[]){  
        int size=arr.length;          
        int count=0;
        System.out.println("Putting all zeros at end: ");
        for(int i=0; i<size; i++)         // here we are traversing the array
            if(arr[i] != 0)                       // when array index value is not '0'then
            arr[count++]=arr[i];                  // the count will increse and till the index value have not zero
        
        while(arr.length < size)    // here we will check if array length is less then size
            arr[count++]=0;          // count is at index that have non zero value now the count increse and go to next index and put '0' till the size of the array.
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);    
        System.out.println("Enter Size of the array: ");
        int size=sc.nextInt();
        System.out.println("Enter the Elements for array to put all zeros at end");
        int arr[]= new int[size];        
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        zeroAtend(arr);  
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }        
        sc.close();      
    }
}
