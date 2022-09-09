public class ReverseStringWordWise {
    public static void ReversePrint(String str){
        int start=0;
        int count =str.length()+1;
        for(int i=str.length()+1; i<=count; i--){
            if(str.charAt(i)==' '){
                System.out.println(str.substring(i, count)+" ");
                count=i-1;
            }
        }
    
    }
    public static void main(String args[]){
        String str="hello world";
        ReversePrint(str);
    }
    
}
