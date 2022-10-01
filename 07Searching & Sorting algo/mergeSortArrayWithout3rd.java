// Sol for leetcode Q88.https://leetcode.com/problems/merge-sorted-array/
public class mergeSortArrayWithout3rd {
    public static void mergeSort(int [] arr1, int m, int [] arr2, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (j>=0){
            if (i>=0 && arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
                k--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
                k--;
            }
        }       
        for(int x=0; x<arr1.length; x++){
            System.out.println(arr1[x]+" ");
        }
    }
    // public static void print(int [] arr){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.println(arr[i]+" ");
    //     }
    // }
    public static void main(String args[]){
        int [] arr1={1,2,3,0,0,0};
        int [] arr2={2,5,6};
        int a=3;
        int b=3;
        mergeSort(arr1, a, arr2, b);
        //print(arr1);
    }
}
