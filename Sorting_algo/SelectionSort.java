package Sorting_algo;
public class SelectionSort {
    public static void Selectionsorting(int [] input){
        for(int i=0; i< input.length; i++){
            int min=input[i];
            int minIndex=i;
            for(int j=i+1; j<input.length; j++){
                if(input[j]<min){
                    min=input[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                input[minIndex]=input[i];
                input[i]=min;
            }  
        }
        // for(int i=0; i<input.length; i++){
        //     System.out.println(input[i]+" ");     
        // }

        
    }
    public static void main(String args[]){
        int[] arr={1,5,7,5,77,9};
        Selectionsorting(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");     
        }
        

    }
}
