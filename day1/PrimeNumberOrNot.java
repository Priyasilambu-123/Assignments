package week1.day1;

public class PrimeNumberOrNot {
public static void main(String[] args) {
	for (int i = 2; i <=5; i++) {
	if (i<2) {	

	System.out.println("this number"+i+"is not a prime number");	
	}
	else if (i%2==0) {
		System.out.println("this number"+i+"is not a prime number");	
	}
	else {
		System.out.println("this number"+i+"is a prime number");	

	}
	}
}
}
