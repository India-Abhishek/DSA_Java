import java.util.Scanner;

public class binarySearch {
    public static int search(int[] input, int ele){
        int start=0;
        int end=input.length -1;
        while (start<= end){
            int mid=(start+end)/2;
            if(ele==input[mid]){
                return mid;
            }
            else if(ele>input[mid]){
                //if ele is greater then mid then then we start searching from start from right side of mid.
                start = mid+1; 
            }
            else{
                end=mid-1;
            }
            //mid=(start+end)/2;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,6,9,12,67,97}; //Array        
        System.out.println("Enter element to search: ");
        int ele=sc.nextInt();
        int foundAt=search(arr, ele);
        System.out.println("Found at index no: "+foundAt);
    }

    
}
