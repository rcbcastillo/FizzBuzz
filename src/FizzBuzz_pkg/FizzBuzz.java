package FizzBuzz_pkg;

public class FizzBuzz {
	
	static void fizzBuzz(int A) {
		String message;
		
		if ( A % 3 == 0 && A % 5 == 0) {
			message = "FizzBuzz";
			System.out.println(message);
			
		} else if ( A % 3 == 0) {
			message = "Fizz";
			System.out.println(message);
			
		} else if ( A % 5 == 0) {
			message = "Buzz";
			System.out.println(message);
			
		} else {
			message = Integer.toString(A);
			System.out.println(message);			 
		}
	}
	
	public static void main (String[] args) {
		fizzBuzz(17); // 17
		fizzBuzz(21); // Fizz
		fizzBuzz(50); // Buzz
		fizzBuzz(15); // FizzBuzz
	}

}
