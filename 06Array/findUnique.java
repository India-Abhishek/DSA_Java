import java.util.Scanner;

public class findUnique {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt(); 
        int arr[]= new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans=ans^arr[i]; // here we are using XOR if one element is comes again the it will cancle that ele if not then it will give that element
        }
        System.out.print("unique element is: "+ans);
    }   
}
