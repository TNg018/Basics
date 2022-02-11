//Fibonacci Sequence
//Chloe Nguyen
//2.10.2022 Data Structures
//Compute the Fibonacci function using double recursion

import java.util.*;
import java.util.Scanner;

class Fibonacci {
	public static int fibs(int n) {
		if ((n<=1)&&(n>=0)) {																//if input is 0 or 1, output 0 or 1
			return n;
		} else {	
			return fibs(n-1) + fibs(n-2);													// recursive call
		}
	}
	public static void main(String args[]) {
		int count = 10;
		System.out.println("The first 10 numbers of the fibonacci sequence are: ");
		for (int i = 0; i < count; i++) { 
				System.out.print(fibs(i)+ " ");												// function call 
		}		
		System.out.println();													
	}
}