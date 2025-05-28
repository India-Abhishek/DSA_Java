public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {32,123,5,7,3,12};
        for(int i : arr){
            System.out.println(i);
        }

        int search = 3;

        int find = 0;
        int index = 0; 

        for(int j=0; j<arr.length-1; j++){
            if(arr[j]==search)
                index = j;
        }
        
        // for(int j : arr){
        //     if(j==search){
        //         find = j;
        //     }
        // }

        System.out.println("the element "+search+" is Found at index: "+index);

        
    }
}
