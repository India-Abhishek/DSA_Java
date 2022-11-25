public class Factorial {
    // Creating a function for factorial
    public static int fact(int n){
        if(n == 0){ 
            return 1;
        }

        int smallAns = fact(n - 1);
        return smallAns * n;        
    }
    public static void main(String args[]){
        int n = 3;
        int ans = fact(n); // calling fact function
        System.out.println(ans);

    }
    
}
