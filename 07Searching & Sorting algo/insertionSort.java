    public class insertionSort {
    public static void sort(int [] input){
        for(int i=1; i<input.length; i++){
            int j= i-1;
            int temp=input[i];
            while(j>=0 && input[j]>temp){
                input[j+i]=input[j];
                j--;
            }
            input[j+1]=temp;          
        }
    }
    public static void main(String args[]){
        int [] arr={12,64,32,54,643};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }       
    }
    
}
