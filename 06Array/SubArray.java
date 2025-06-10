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

System.out.println("--maximum subarray sum---Brute force approach = O(n2)--");

        int arr2 [] = {-2,1,-3,4,-1,2,1-5,4};
        int maxSum = Integer.MIN_VALUE;

        for(int st=0; st<arr2.length; st++){
            int currSum = 0;
            for(int end=st; end<arr2.length; end++){
                currSum += arr2[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("maximum sub array sum = "+maxSum);

System.out.println("--maximum subarray sum---Kadane's algorithm = O(n)--");

        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i : arr2){
            current += i;
            max = Math.max(current, max);
            if(current<0){
                current = 0;
            }
        }

        System.out.println(max);

    }
    
}
