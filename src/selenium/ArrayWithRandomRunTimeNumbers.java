package selenium;

public class ArrayWithRandomRunTimeNumbers {

	public static void main(String[] args) {
		int [] myArray = new int[5];
		
		for(int i = 0; i < myArray.length; i++) {
			
			myArray[i] = (int)(Math.random()*1000);
			System.out.print(myArray[i] + ",");
		}
		
		System.out.println("");
		System.out.println("----Printing in reverse order---");
		
		for(int j = myArray.length - 1; j >= 0; j--) {
			
			System.out.print(myArray[j] + ",");
		}

	}

}
