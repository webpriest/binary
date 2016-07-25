import java.util.Scanner;

/**
 * CreateBinary.java
 * Purpose: to accept integer value as user input and convert to binary, and to find the maximal number of zeros surrounded by 1s 
 * @author Theophilus Aika
 * @version 1.0 25/07/2016
 * */

public class CreateBinary {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int intValue = 0;
		// Accept the integer value
		System.out.println("Enter an integer value: ");
		intValue = input.nextInt();
		
		// Cast the value as integer
		Integer N = new Integer(intValue);
		
		// Call function to convert to binary and return number of maximal 0 values surrounded by 1s
        getBinary(N);
	
	}
	
	// Function to convert integer to binary and return maximum number of zeros between 1s
	public static void getBinary(int N) {
		if (N < 0 || N > 1000000000) {
			System.out.println("Please use a number between 0 and 1000000000");
		}
		else {
			String binary = Integer.toBinaryString(N);
	        System.out.println("Binary value: " + binary);
	        
	        int maxValue = 0;
	        int countZeros = 0;
	        
	        // Loop through the binary number
	        for (int count = 0; count < binary.length(); count++) {
	        	// If the character/number is 1, start counting the zeros (0) afterwards
	        	if(binary.charAt(count) == '1'){
	        		// If the last count is greater than the maximum value, replace the previous maximum value
	        		if(countZeros > maxValue){
	        			maxValue = countZeros;
	        		}
	        		countZeros = 0;
		        } else{
		        	countZeros++;
		        }
	        }
	        // Output the result
	        System.out.println("Maximum Contiguous Zeros (surrounded by 1s) = " + maxValue);
		}
	}
}
