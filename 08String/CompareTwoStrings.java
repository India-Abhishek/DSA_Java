public class CompareTwoStrings {
    public static void main(String args[]){
    // case 1: comparing 2 arrays first
    int [] arr1={1,2,3};
    int [] arr2={1,2,3};
    if(arr1==arr2){
        System.out.println("array are Equal");
    }
    else{
        System.out.println("array are Unequal");
    }
    // when e compare two array they  compare refrence of the array 
    // not the content of the array

    // case 2: comparing 2 string
     String str1="abcde";
     String str2="abcde";
     if(str1== str2){
        System.out.println("str are Equal");
    }
    else{
        System.out.println("str is Unequal");
    }

    // output will be equal because the content of both str is same
    //so both are referring same address
    // and we are comparing references here

    // printing prifix
    printPrifix(str1);
    // didn't print last character because string.length doesnt add last character
    }

    public static void printPrifix(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.substring(0, i));
        }
    }

 
    
}
