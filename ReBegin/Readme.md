java is platform independent
>>Run your application on any machine (Any hardware) but it should have JVM.
>> JVM is platform dependent
>> But to run your application on other machine it requires JRE and JVM thats makes WORA (write once and run anywhere)


>>write a java program & save in .java file 
    >> (JAVAC) converts the code into byte code by java complier by JDK
        >> then JVM run Byte code (JVM runs only one file and it should have main method [public static void main(String[] args )])
            >>When we wants to run something we need JRE (java runtime environment)
              JVA with library is a part of JVM


java -- for run the application 
javac -- to run the code

>> Print is use for print in same line 
>> Println use for print in next line

//--------------------------------------------------------//

DATA TYPES - 2TYPES

//--------------------------------------------------------//

1. Primitive
    >> integer  --Byte(1byte), Short(2bytes), Int(4bytes), Long(8bytes) = to store a numbers from -ve to +ve range
    >> Float    --Double(8bytes), Float(4bytes) = to store point values
    >> Character-- Char(2bytes) =  to store the char values
    >> Boolean  -- Boolean = True/False

//-----------------------------------------------------------//

Type conversion and Type casting
Converting the type of variable from one to another.
Every variable need a name and type as well.

//-----------------------------------------------------------//
>>extra note: to count the zero in int variable we can put underscore between the numbers.
ex: int a = 10_00_00_000;
output : a = 100000000

Every variable needs a name and variable Types as well.
Ex: assigning a integer variable to byte or byte to integer
    byte b = 127;
    int a = 256;
    b=a; // this will not work because size of an byte can not store the big range/size of integer.
    a=b; // this will work as type of a has a bigger range.
    b=(byte)a; //converting my integer value into byte (casting)

Java also promote the value 

EX: byte a1 = 10;
    byte a2 = 30;

    nt result = a1*a2; // byte * byte  = 300 now the value will go out of range og byte.
                        // so the value will be promoted into integer value by JAVA and we can store it into integer.
 //-----------------------------------------------------------//

 Operator
  >>To perfrom operations on diffrent values we use operators
 //-----------------------------------------------------------//

    1. Arithmetic Operators
    These operators are used to perform basic arithmetic operations.

    Addition: +
    Subtraction: -
    Multiplication: *
    Division: /
    Modulus: %

    2. Unary Operators
    These operators operate on a single operand.

    Unary plus: +
    Unary minus: -
    Increment: ++
    Decrement: --
    Logical complement: !

    3. Relational Operators
    These operators are used to compare two values.

    Equal to: ==
    Not equal to: !=
    Greater than: >
    Less than: <
    Greater than or equal to: >=
    Less than or equal to: <=

    4. Logical Operators
    These operators are used to perform logical operations.

    AND: &&
    OR: ||
    NOT: !

    5. Bitwise Operators
    These operators are used to perform bit-level operations.

    Bitwise AND: &
    Bitwise OR: |
    Bitwise XOR: ^
    Bitwise Complement: ~
    Left shift: <<
    Right shift: >>
    Unsigned right shift: >>>

    6. Assignment Operators
    These operators are used to assign values to variables.

    Simple assignment: =
    Add and assign: +=
    Subtract and assign: -=
    Multiply and assign: *=
    Divide and assign: /=
    Modulus and assign: %=
    Bitwise AND and assign: &=
    Bitwise OR and assign: |=
    Bitwise XOR and assign: ^=
    Left shift and assign: <<=
    Right shift and assign: >>=
    Unsigned right shift and assign: >>>=
    
    7. Conditional (Ternary) Operator
    This operator is used to evaluate a boolean expression and return one of two values.

    Ternary: ? :
 //-----------------------------------------------------------//

Loops refer basic/conditional.java

 //-----------------------------------------------------------//



                            OOPs
                 Object orinted programing



 //-----------------------------------------------------------//

what is object



 //-----------------------------------------------------------//

 Method

 method overloading =  we can have multiple method with same name but with diffrent paramenters or with diffrent type

 ---------------
 Array- to store multiple value in a variable we use array.
 