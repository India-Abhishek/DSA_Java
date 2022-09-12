import java.util.Scanner;

public class arrayUse {
    public static void main(String args[]){
        // initilize 2d Array
        int array[][]= new int [3] [4]; 
        //Acess 2Darray
        System.out.println(array[1][2]); // output= 0 coz araay is empty RN
        //initilize value
        array[1][2]=40;
        System.out.println(array[1][2]); // make sure the index should be valid

        //initilize value
        int arr2[][]={{1,2,3,4},{5,6,7,8,9}};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of Rows: ");
        int row= sc.nextInt();

        System.out.println("Enter no of COl ");
        int col= sc.nextInt();

        int arr3[][]= new int  [row] [col];

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                
                System.out.println("Enter ele at "+i+" row "+j+" col");
                arr3[i][j]= sc.nextInt();
                
            }
        }

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                
                System.out.print(arr3[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    
    
}
