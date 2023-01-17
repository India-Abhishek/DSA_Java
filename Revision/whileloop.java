public class whileloop {
    public static void main(String[] args) {
        int n=17;
        int i=1;
        int count=0;
        while(i<=n){
            System.out.println(i);
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
