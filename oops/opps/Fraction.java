package opps;
// creating a Fraction class
public class Fraction {
    private int numernator;
    private int denominator;

//Constrecture to create a fraction
    public Fraction(int numernator, int denominator) throws Exception {
        this.numernator = numernator;
        if(denominator == 0) {
            Exception ex = new Exception("Denominator can not be 0 ");
            throw ex;
            // todo error out
        }
        this.denominator = denominator;
        simplify();
    }
// Creating setter and gettter to set & get the numerator and denominator
    public int getNumernator(){
        return numernator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumernator(int n){
        this.numernator=n;
        simplify();
    }

    public void setDenominator (int d) throws Exception{
        if(d == 0){
            Exception e = new Exception("Denominator can not be 0 ");
            throw e;
            //return;
        }
        this.denominator=d;
        simplify();
    }

//Creating a print function and checking weather if denominator is 1 ex-[2/1] then simply print numernator [2]
    public void print(){
        if(denominator == 1){
            System.out.println(numernator);
        }
        else{
        System.out.println(numernator+"/"+denominator);
        }
    }

//simplyfing the fraction
    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numernator, denominator); // chossing the smalest number

        // chacking if both (denominator and numenator) is divisible by that number >> if yes then update the gcd
        for(int i=2; i<=smaller; i++){
            if(numernator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        // divide both (denominator and numenator) with GCD and update their value
            numernator = numernator/gcd;
            denominator = denominator/gcd;
        

    }
// Creating a new static function for addition of fraction
    public static Fraction add(Fraction f1, Fraction f2){
        int newNumernator = f1.numernator * f2.denominator + f1.denominator * f2.numernator;
        int newDenominator = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newNumernator, newDenominator);
        return f;
    }
// Creating a new static function for multiplication of two fraction
    public static Fraction multiply(Fraction f1, Fraction f2){
        int newNumernator = f1.numernator * f2.numernator;
        int newDenominator = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newNumernator, newDenominator);
        return f;
    }

// Adding two Fraction
    public void add(Fraction f2){
        this.numernator = this.numernator * f2.denominator + this.denominator * f2.numernator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

//Multiply two fraction
    public void multiply(Fraction f2){
        this.numernator = this.numernator * f2.numernator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    
}
