
public class bubbleSort {
    public static void sort(int[] input){
        int max=0;     
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input.length -i -1; j++){ //"-i"dont go on that index which already have been sorted
                if(input[j]>input[j+1]){
                    max=input[j];
                    input[j]=input[j +1];
                    input[j +1]=max;
                }
            }
        }
    }
    public static void main(String args[]){
        int [] arr={213,54,65,97,54};
        sort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]+" ");
        // }

        for(int i : arr){
            System.out.println(i);
        }
    }    
}
