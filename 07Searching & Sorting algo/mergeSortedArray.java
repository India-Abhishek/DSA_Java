public class mergeSortedArray {
    public static void sort(int [] arr1, int [] arr2, int arr3 [], int a ,int b, int c){
        int i=0;
        int j=0;
        int k=0;

        while(i<a && j<b){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        //copy the remaning elements from arr1
        while(i<a){ 
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        //copy the remaning elements from arr2
        while(j<b){ 
            arr3[k]=arr2[j];
            j++;
            k++;
        }
    }

    public static void print(int [] arr, int k){
        for(int i=0; i<k; i++){
            System.out.println(arr[i]+" ");
        }

    }

    public static void print(){}
    public static void main(String args[]) {
        int [] arr1 = { 1, 3, 4, 5,9};
        int [] arr2 = {2, 4, 6, 8};
        int i=arr1.length;
        int j=arr2.length;
        int [] arr3 = new int[i+j];
        int k=arr3.length;

        sort(arr1, arr2, arr3, i, j, k);
        print(arr3, k);
    }
    
}
