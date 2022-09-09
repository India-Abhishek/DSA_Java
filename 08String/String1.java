public class String1 {
   
    public static void main(String args[]){
        // we initilize char in single Quote '' but in String is in double Quotes " "
        //char c='c';
        String str="hello_world";
        // Printing character
        System.out.println(str.charAt(1));
        // System.out.println(stt[4]); Incorrect
        //sub String 
        System.out.println(str.substring(2, 7));
        // sub string from start to till end
        // if we want to print the whole string we can start from 0th index
        System.out.println(str.substring(3)); 
        // check if character is present in string or not
        // str.contains return boolen value (true or false )
        System.out.println(str.contains("hello"));
        System.out.println(str.contains("hey"));
        //print whole string
        System.err.println(str);
        // printing every character one by one from string
        print(str);
        // strings are immutable
        //example String str2 = "Yo Yo";
        //str2.setcharAt(1)='a'; >>'a' can't  be added at index no 1
        
        //concatenate strings
        //method 1
        str= str+"_is";
        System.out.println(str);
        // method 2 >>directly concatenate and print
        System.out.println(str.concat("_here"));
        // concatenate only concatenate string that doesnt change the old str value
        System.out.println(str);
           

    }

    public static void print(String s){
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    
}
