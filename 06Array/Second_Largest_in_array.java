import java.util.*;

public class Second_Largest_in_array {
    public static void secLargest(int [] input){
        int largest=Integer.MIN_VALUE; 
        int secLargest= Integer.MIN_VALUE; 

        for(int i=0; i<input.length; i++){
            if(input[i]>largest){          //search largest element in array
                secLargest = largest;      // store the previous largest value in sec largest
                largest=input[i];          // update the new largest value by traversing the array
                
            }

            
            // check if the item is not greater then the largest value
            // and also not greater then sec larg and it should be smaller then the largest ele of the array 

            else{
                if(input[i]>secLargest && input[i]<largest){ 
                    secLargest= input[i];
                }
            }
        }       
        
        System.out.println("Second largest element in array is: "+secLargest);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        // input items in array
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at "+i+ " index: ");
            arr[i]=sc.nextInt();
        }
        //printing array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // Finding sec largest
        secLargest(arr);

        sc.close();

    }
    
}
