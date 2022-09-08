public class InsertionSort {
    public static void insertionSort(int n , int[] arr) {
        for(int i=1; i<n; i++){
            int temp=arr[i];
            int j= i-1;
            for(; j>=0; j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];                        
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
        int [] arr={9,3,6,2,0};
        int n=arr.length;
        insertionSort(n, arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}

// for practice https://www.codingninjas.com/codestudio/problems/insertion-sort_3155179
