// Leet code Question no 151 https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseStringWordWise {

    public static String reverseWords(String s) {
        int i = s.length()-1;
        String ans="";
        
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
                int j=i;
            if(i<0) break;

            while(i>=0 && s.charAt(i) != ' ') i--;
                if(ans.isEmpty()){
                    ans= ans.concat(s.substring(i+1, j+1));  
                }
                else{
                    ans= ans.concat(" "+s.substring(i+1, j+1));
                } 
        }
        return ans;
    }
    public static void main(String args[]){
        String str="the sky is blue";
        System.out.println(reverseWords(str));

    }
}
