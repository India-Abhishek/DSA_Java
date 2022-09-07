
public class bubbleSort {
    public static void sort(int[] input){
        int start=0;
        int max=0;
        int maxindex=0;
        while(start <input.length){
            for(int i=0; i<input.length; i++){
                for(int j=1; j<input.length; j++){
                    if(input[j]==input[i]){
                        break;                                                
                    }

                    else if(input[j]>input[i]){
                        maxindex=j;
                        max=input[j];
                    }

                }
                if(maxindex != i){
                    input[i]=input[maxindex];
                    input[maxindex]=max;                   

                }
                
                System.out.println(input[i] +" ");
                
            }
        }

    }
    public static void main(String args[]){
        int [] arr={213,54,65,97,54};
        sort(arr);
    }    
    
}
