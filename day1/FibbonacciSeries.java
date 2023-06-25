package week1.day1;

public class FibbonacciSeries {
	public static void main(String[] args) {
		
		int firstNumber=0,secondNumber=1,sum,n=11;
		
		System.out.println("Fibbonacci series");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for (int i = 1; i <=n; i++)
		{
			
			sum=firstNumber+secondNumber;
			System.out.println(sum);
			firstNumber=secondNumber;
			secondNumber=sum;
			
		}
	}

}
