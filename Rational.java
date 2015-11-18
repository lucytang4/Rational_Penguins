/*
Team Penguins-- Jordan Louie, Lucy Tang
APCS1 pd5
HW32--Irrationality Stops Here
2015-11-17
*/

public class Rational{
    private int _numerator;
    private int _denominator;

    //default constructor
    public Rational(){
	_numerator = 0;
	_denominator = 1;
    }

    //overloaded constructor
    public Rational(int num, int denom){
	this();
	if (denom == 0)
	    System.out.println("invalid denominator value");
	else{
	    _numerator = num;
	    _denominator = denom;
	}
    }

    //return string of rational number
    public String toString(){
	String n = Integer.toString(_numerator);
	String d = Integer.toString(_denominator);
	return n + "/" + d;
    }

    public double floatValue(){
	return (double)(1. * _numerator / _denominator);
    }

    //multiplys 
    public void multiply(Rational r) {
	_numerator = _numerator * r._numerator;
	_denominator = _denominator * r._denominator;	
    }

    //divides
    public void divide(Rational r) {
	_numerator = _numerator * r._denominator;
	_denominator = _denominator * r._numerator;	
    }

    public static void main(String[] args) {
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2

	System.out.println("r = " + r + " = " + r.floatValue());
	//should be 2/3  = 0.6666666666666666
	System.out.println("s = " + s + " = " + s.floatValue());
	//should be 1/2 = 0.5

	//test multiply
	System.out.print(r + " x " + s + " = ");
	r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
	System.out.println(r);

	System.out.print(s + " x " + r + " = ");
	s.multiply(r); //Multiplies s by r, changes s to 2/12.  r remains 2/6
	System.out.println(s);

	System.out.println("r = " + r); //should be 2/6
	System.out.println("s = " + s); //should be 2/12

	//test divide
	System.out.print(s + " / " + r + " = ");
	s.divide(r); //Divides s by r, changes s to 12/24.  r remains 2/6
	System.out.println(s);

	System.out.print(r + " / " + s + " = ");
	r.divide(s); //Divides r by s, changes r to 48/72.  s remains 12/24
	System.out.println(r);

	System.out.println("r = " + r + " = " + r.floatValue());
	//should be 48/72 = 0.6666666666666666
	System.out.println("s = " + s + " = " + s.floatValue());
	//should be 12/24 = 0.5
    }
}
