>>1 Class and objects
    1.1 Class consist of blocks, constructor, variables, methods, inner classes and inner interfaces
    1.2 Object is a real world entities 
        ex: A smartphone..  have storage, battary type, camera features ans so on.
        >>To create a object we use "NEW" keyword


>>2 Access Modeifier
    2.1.Default A.M.
        is only accessable whithin the package, it cannot be accessable outside of the package.
    2.2.Private A.M.
        is only Can accessable within the class.
    3.3.Public A.M.
        is accessable from any class or package.
    3.4.Protected A.M.
        can be accessed witthin its own package or outside of package in sub class of its class in the another package.


>>3 Setters and getters
    3.1Getters and Setters in java are two methods used for fetching and updating the value of a variable. 
    3.2getter is use to print the updated value of the object.
    3.3setter is use for update the value of the object.


>>4 Constructor
    Constructor is a function that creates a new objects
    Constructor dosent have any return type
    it simply construct object with entities
    You can have multiple constructor
    we can not call a constructor 2 times on an object. we can construct only one time on a object

>>5 Inherintance 
    The class that inherits properties from another class is called inherentance
    >>To inherent a a class in any other class we use "extend" keyword while creating a new class.

>>5.1 Encapsulation
    Binding up the code in a single usint is called encapsulation
    i.e. a class, a method.

>>5.3 Abstraction
    Hiding the process and showing only the functionalites

    abstration can be achived by two ways 
5.3.1.Abstract class = if a method is defined as abstract then its inharate class must  define the abstract.
    we cant create a object of a abstract class.

    i.e. 
    abstract class Car{
        public abstract void drive();

        public void playMusic(){
            System.out.println("Playing music...");
        }
    }

    class Swift extends Car{    //Concrete class
        public void drive(){
            System.out.println("Driving...");
        }

        public void autoPark(){
            System.out.println("this car can park it self");
        }
    }

2.interface =
    /*
 * Interface is like a class but - by default all the variable and methods are public abstract.
 * All the variable inside the interface are by default final and static.
 * Inheritance is also valid in interface
 */

    interface A{

        int num = 10;

        void show();
        void config();
    }

    interface A2{
        void run();

    }

    interface A3 extends A2{

    }

    // a class can implement one or more interfaces
    // whatever method we have defined in interface we have to initiate in our class.
    class B implements A,A3 {
        public void show(){
            System.out.println("Show method");
        } 

        public void config(){
            System.out.println("in config method");
        }

        public void run(){
            System.out.println("running");
        }
    }


>>6 Super Key
    super is used to refer immediate parent class instance variable.
    i.e. we are already having a print function in parent class. 
    >>so we can directly call that function from super class to sub class by using "Super" Key word and access data member from super class. 
    i.e. super.print();

>>7 Polymorphism
    Somthing taking multiple forms.
    represent any function in many types and many forms
    i.e. Vehicle can be in many types.
         Car, Truck, Bike 

        syntax-
         Vehicle v = car();

>>8 Exception Handling  
    A way of functions to tell u that we are doing something Wrong.
    i.e. we are trying accessing an array index in a array which is out of array size thats gives Exception that array index out of bound. 

    >>
    Type of Exception
    8.1 Runtime Exception
        occur coz of having bugs in the code.
        i.e. Array index out of bound
    8.2 Errors
        Extreme errors 
        i.e. Hard disk Failure 
    8.3 Named Exceptions
        expect that this exception will occur.
        i.e. wrong input.
    
>>9 Exception handling -- Try and Catch
    when we try and run a some code if code is correct then ok
    if it throw an excaption then catch will handel that exception

    syntax example:
    try{
            if(denominator == 0) {
                ZeroDenominatorException ex = new ZeroDenominatorException();
                throw ex;
                // todo error out
            }
        }
        catch(ZeroDenominatorException ex){
            System.out.println("You cant input 0 as a denominator");
        }

>>10 Massage Passing -- Objects communicate with one another by sending and receiving information to eachother.
    A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent.
