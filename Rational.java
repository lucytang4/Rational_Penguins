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
	if (denom = 0){
	    System.out.println("invalid denominator value");
	    this();
	}
	else{
	    _numerator = num;
	    _denominator = denom;
	}
    }

    //return string of rational number
    public String toString(){
	String n = Integer.toString(_numerator);
	String d = Integer.toString(_denominator);
	return n + "\/" + d;
    }
}