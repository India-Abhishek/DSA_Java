import java.util.Scanner;

public class rowWiseSum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int row=sc.nextInt();

        System.out.println("Enter no of col : ");
        int col=sc.nextInt();

        int arr1[][]=new int[row][col];
        //input array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        // sum of all ele of rows
        for(int i=0; i<row; i++){
            int sum=0;
            for(int j=0; j<col; j++){
                sum+=arr1[i][j];
            }
            System.out.println(sum);
        }
    }   
    
}
