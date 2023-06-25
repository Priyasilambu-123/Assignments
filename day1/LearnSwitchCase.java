package week1.day1;

public class LearnSwitchCase {
public static void main(String[] args) {
	
	String browserType = "internet explorer";
	switch (browserType) {
	case "chrome":
		System.out.println("the browser name is chrome");
		
		break;
	case "edge":
		System.out.println("the browser name is edge");
		
		break;
	case "firefox":
		System.out.println("the browser name is firefox");
		
		break;

	default:
		System.out.println("default browser");
		break;
	}
	
			
}
}
