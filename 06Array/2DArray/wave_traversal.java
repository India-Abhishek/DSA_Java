import java.util.*;
class wave_traversal{
    public static void traverse_wave(int [][] input){
        for(int j=0; j<input[0].length; j++){
            if(j%2==0){
                for(int i=0; i<input.length; i++){
                    System.out.println(input[i][j]);
                }
            }
            else{
                for(int i=input.length -1; i>=0; i--){
                    System.out.println(input[i][j]);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // initialize  2d array
        System.out.println("Row: ");
        int row=sc.nextInt();
        System.out.println("Col: ");
        int col=sc.nextInt();

        int arr[][]= new int[row][col];
        // Take input in 2d array
        System.out.println("Enter elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // print 2d array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        traverse_wave(arr);
        sc.close();
    }
}