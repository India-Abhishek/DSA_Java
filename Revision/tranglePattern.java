public class tranglePattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+j-1);
            }
            System.out.println();
        }
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    
}
