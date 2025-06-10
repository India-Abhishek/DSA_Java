public class SubArray {
    public static void main(String[] args) {
        //int arr [] = new int[5];
        int arr [] = {23,5,23,12,54};

        // for(int n: arr){
        //     System.out.println(n);
        // }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
