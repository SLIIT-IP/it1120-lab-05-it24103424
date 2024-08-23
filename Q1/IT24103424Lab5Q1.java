import java.util.Scanner;

public class IT24103424Lab5Q1{

	public static void main(String[] args) {
		
		int largestNumber, smallestNumber;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second integer: ");
		int secondNumber = input.nextInt();
		System.out.print("Enter the third integer: ");
		int thirdNumber = input.nextInt();

		System.out.println("");

		System.out.println("User entered numbers are : "+firstNumber +" "+secondNumber+" "+thirdNumber);


		//Smallest number
		if (firstNumber<secondNumber) {
			smallestNumber = firstNumber;
		}
		else{
			smallestNumber = secondNumber;
		}

		if (smallestNumber<thirdNumber) {
			System.out.println("The Smallest number is: "+smallestNumber);
		}
		else{
			smallestNumber = thirdNumber;
			System.out.println("The Smallest number is: "+smallestNumber);
		}

		//Largest number

		if (firstNumber>secondNumber) {
			largestNumber = firstNumber;
		}
		else{
			largestNumber = secondNumber;
		}

		if (largestNumber>thirdNumber) {
			System.out.println("The Largest number is: "+largestNumber);
		}
		else{
			largestNumber = thirdNumber;
			System.out.println("The Largest number is: "+largestNumber);
		}
		
	}
}