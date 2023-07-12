package week1.day2;

public class Calculator {
public int addThreeNumbers(int a,int b,int c) {
	return a+b+c;
}
	public float subTwoNumbers(int num1,float num2)
	{
		return num1-num2;
	}
	public int divTwoNumbers(int e,int f)
	{ 
		return e/f;
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.addThreeNumbers(2, 5, 3);
		System.out.println("addition="+cal.addThreeNumbers(2, 5, 3));
		float result=cal.subTwoNumbers(5, 10.5f);
				System.out.println("sub="+result);
		cal.divTwoNumbers(20, 2);
		System.out.println("divide="+cal.divTwoNumbers(20, 2));
	}
}
