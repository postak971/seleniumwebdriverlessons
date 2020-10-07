package selenium;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Begining");
		try {
		int divide = 10/0;
		
		System.out.println(divide);
		}catch(Exception e) {
			System.out.println("Error occured: " + e.getMessage());
		}
		
		System.out.println("Ending");

	}

}
