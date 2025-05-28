import java.util.Arrays;


public class BinarySearch {

    public static int search(int [] arr, int ele){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(ele == arr[mid]){
                return mid;
            }
            else if(ele > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int [] arr1 = {232,4,34,2,24,53,45,345};

        //System.out.println("array");
        for(int i : arr1){
            System.out.print(i+", ");
        }

        //System.out.println("\nstep 1 sort the array: ");
        Arrays.sort(arr1);
        for(int i : arr1){
            System.out.print(i+", ");
        }

        int find = search(arr1, 4);

       // System.out.println("\n find the mid of the array");
       System.out.println("element found at index: "+find);



    }
    
}
