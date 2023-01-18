public class nestedloopPatternTwo {
    public static void main(String[] args) {
        int row=4;
        int col=5;
        // inner loop
        for(int i = row; i>=1; i--){
            //Outer loop
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
