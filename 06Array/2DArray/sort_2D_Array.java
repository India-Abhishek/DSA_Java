public class sort_2D_Array {
    public static void sort(int []input){

    }
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
    public static void main(String args[]){
        int arr[][]={{8,5,2,1,7},{23,67,43,99,32}};
        print(arr);
    }    
}
