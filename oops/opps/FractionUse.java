package opps;

public class FractionUse {
    public static void main(String args[]) throws ZeroDenominatorException{
        Fraction f1 = new Fraction(8, 14);
        f1.print();
        // 2/3

        Fraction f2 = new Fraction(3, 4);
        f2.print();
        // 3/4

        Fraction f3 =  Fraction.add(f1, f2);
        f3.print();

        // Todo Fraction multiplication
        // Fraction f4 =  Fraction.multiply(f1, f2);
        // f4.print();

        //f1.setDenominator(48);
        
    }
    
}
  