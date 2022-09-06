public class incrementingValueOfArr {

    public static void increment(int inputArr[]){   // taking arr address and then reading the values of it.
        for(int i=0; i<inputArr.length; i++){       // taking input.
            inputArr[i]++;                          // incrementing arr  element value.
        }
    }
    public static void printArr(int input[]){ 
        int size= input.length;                      //printing an array.
        for (int i=0; i<size; i++){           
            System.out.print(input[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        increment(arr);        // passing arr address
        printArr(arr);        

    }
}