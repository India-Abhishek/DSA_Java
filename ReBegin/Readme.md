java is platform independent
>>Run your application on any machine (Any hardware) but it should have JVM.
>> JVM is platform dependent
>> But to run your application on other machine it requires JRE and JVM thats makes WORA (write once and run anywhere)


>>write a java program & save in .java file 
    >> (JAVAC) converts into byte code by java complier 
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
    b=(byte)a; //converting my integer value into byte 