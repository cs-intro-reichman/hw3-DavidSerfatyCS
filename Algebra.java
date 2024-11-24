// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {

		int number = x1;
		int nOfTimes = x2;
		

		for (int i = 0; i < nOfTimes; i++) {
			number++;
		}
		return number;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		
		int number = x1;
		int nOfTimes = x2;
		
		for (int i = 0; i < nOfTimes; i++) {
			number--;
		}
		return number;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {

		
		int firstMultiple = plus(0, x1);
		int product = 0;

		for (int i = 0; i < x2; i++) {
			
		product = plus(product, firstMultiple);
		}

		return product;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		
		if ( n == 0 ) return 1;
		else if ( n == 1 ) return x;

		int product = x;

		for (int i = 0; i <= n-2; i++) {
		product = times(product, x);
		}
		return product;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		
		int divisor = x2;
		int i = 1;

		while (divisor < x1) { 
			divisor = plus(divisor, x2);
			i++;

		}
		boolean notBiggerThan = divisor > x1;
		if (notBiggerThan) return minus(i, 1);
		return i;
	}

	// Returns x1 %
	public static int mod(int x1, int x2) {
		int division = div(x1, x2);
		int composition = times(x2, division);

		return minus (x1, composition);
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {

		int a = 2;
		int check = 2;
		boolean equalTo = a == x;

		while (!equalTo) {
			a = pow(check, 2);
			check++;
		}

		return a;
	}	  	  
}