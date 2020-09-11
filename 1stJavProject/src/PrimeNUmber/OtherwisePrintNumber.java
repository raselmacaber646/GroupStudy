package PrimeNUmber;

public class OtherwisePrintNumber {
	
	
	
	
public static void main(String[] args) {
	

	for (int i = 1; i < 100; i++) {
		if (i % 3 == 0) {
			System.out.println("Hi");
		}

		else if (i % 5 == 0) {
			System.out.println("Hello");
		}

		else if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("Hi Hello");
		} else {
			System.out.println(" the number is : "+i);
		}

	}
}}

