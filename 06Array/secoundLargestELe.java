public class secoundLargestELe{
public static void secLargest(int []input){
    //Arrays.sort(input); //This is shoring algo. u can easly use this and get the output add array.length-2.
    int max=0;
    int secMax=0;
    for(int i=0; i<input.length; i++){
        if(input[i]>max){
            max=input[i];
        }
    }
    System.out.println("1st max value"+max);
    //searching 2nd max
    for(int j=0;j<input.length; j++){
        if(input[j]>secMax && input[j]!=max){
        secMax=input[j];
        }
    }
    System.out.println(secMax); 
    }
    public static void main(String args[]){;
        int arr[]=new int[]{238,43,643,82,2,5,9};
        secLargest(arr);       

    }
    
}
