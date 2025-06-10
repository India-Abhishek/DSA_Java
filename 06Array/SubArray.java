public class SubArray {
    public static void main(String[] args) {
        //int arr [] = new int[5];
        int arr [] = {23,5,23,12,54};

        // for(int n: arr){
        //     System.out.println(n);
        // }

        for(int st=0; st<arr.length; st++){
            for(int end=st; end<arr.length; end++){
                for(int i=st; i<=end; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
