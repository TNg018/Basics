//cNguyen
//Data Structures Spring 2022
//0.1b #7 Take two integer parameters, a and b, and return the sum of all integers from a to b
//if a is less than or equal to b, then zero

public class LoopSum {
  public static void main(String[] args) {
        display_LoopSum(11,10);
  }
  private static void display_LoopSum(int a, int b) {
  	int sum = 0;
  	if (a > b) {
  		for (int i = b; i<=a; i++) {
  			sum += i;
  		}
  		System.out.println("Sum of numbers between " + a + " and " + b + " is " + sum);
  	}
  	else {                                                                                  // if a is less than or equal to b, then zero
  		sum = 0;
  		System.out.println("Sum of numbers between " + a + " and " + b + " is " + sum);
  	}
  	
  	}
}
