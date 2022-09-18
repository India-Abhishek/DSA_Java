public class Largest_col_sum {
    public static void print(int [][] input){
        int rows= input.length;
        int cols= input[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sum(int [][] input){
        int rows=input.length;
        int cols=input[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0; j<cols; j++){
            int sum=0;
            for(int i=0; i<rows; i++){
                sum += input[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10}}; 
        print(arr);
        sum(arr);

    }
    
}
