package selenium;

public class PrintArrayInReverseOrder {

	public static void main(String[] args) {
		int i;
		
	int[] myArray = { 2, 4, 6, 8, 9};
	
	System.out.println("Printing array in reverese order");	
	for(i = myArray.length -1; i >= 0; --i) { 
		System.out.print(myArray[i] + ",");
	}
		
	}	

}
