import java.util.Scanner;

public class ReverseAnumber {

    public static int reverse(int num){
        
        int number = num;
        int rev = 0;
// Logic 1
        while (number != 0 ){
            rev = rev*10 + number%10;
            number = number/10;
        }

        return rev;
    }
    public static void main(String[] args) {

        System.out.println("Enter number to check palindrome: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = reverse(number);
        System.out.println("rever of the input number: "+ result);
        System.out.println(number == result);

        int num2 = sc.nextInt();

// Logic 2 

        StringBuffer rev2; //defined a string buffer object
        StringBuffer str = new StringBuffer(String.valueOf(num2)); // defined a new string buffer and assiging the string value of num2
        rev2 = str.reverse(); // reversing with reverse function
        System.out.println(str == rev2); //comparing.







    }
}
