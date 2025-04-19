public class Operators {
    public static void main(String[] args) {
        // arithmetic operations with same variable
        int num1 = 7;
        int num2 = 5;
        int num3 = 10;
        num1 += 2;
        System.out.println(num1);
        num1 -=2;
        System.out.println(num1);
        num1++;                     //Post increment
        int result  = ++num2;  //Pre increment >>stores the incremnet value of num2
        int result2 = num3++; // stores the initial value of num3 and then incremnet.
        System.out.println(num1 +"\n 5 after pre incement ="+ result+ "\n10 post increment =" + result2 + "\n 10after post incremnt 10 in now ="+num3); 
        num1--;                     //decrement
        System.out.println(num1); 
    }
    
}
