/*
Team Penguins-- Dorothy Ng, Lucy Tang
APCS1 pd5
HW33 -- Do You Even Add, Bro?
2015-11-18
*/

public class Rational{
    private int n;
    private int d;

    //default constructor
    public Rational(){
	n = 0;
	d = 1;
    }

    //overloaded constructor
    public Rational(int num, int denom){
	this();
	if (denom == 0)
	    System.out.println("invalid denominator value");
	else{
	    n = num;
	    d = denom;
	}
    }

    //return string of rational number
    public String toString(){
	String n = Integer.toString(n);
	String d = Integer.toString(d);
	return n + "/" + d;
    }

    public double floatValue(){
	return (double)(1. * n / d);
    }

    //multiplys 
    public void multiply(Rational r) {
	n = n * r.n;
	d = d * r.d;	
    }

    //divides
    public void divide(Rational r) {
	n = n * r.d;
	d = d * r.n;	
    }

    //adds
    public void add(Rational r) {
	n = (n * r.d) + (r.n * d);
	d = d * r.d;
    }

    //subtract
    public void subtract(Rational r){
	n = (n * r.d) - (r.n * d);
	d = d * r.d;
    }
    
    //greatest of given numbers
    public int max(int a, int b){//using integer inputs
	if (a < b){return b;}
	return a;
    }
    //smallest of given numbers
    public int min(int a, int b){//using integer inputs
	if (a < b){return a;}
	return b;
    }

    //finds le gcd of n and d
    public int gcd(){
	if (n == d) return n;
	int greater = max(n,d); //finds greater of two num
	int smaller = min(n,d); //finds lesser of two num
	int GCD = smaller;
	while (greater%GCD != 0 || smaller%GCD != 0){ //if nums arent divisible by same num
	    GCD = greater%smaller; //divide greater by smaller
	    greater = smaller;
	}
	return GCD;
    }

    public void reduce(){
	int GCD=gcd();
	n/=gcd;
	d/=gcd;
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
