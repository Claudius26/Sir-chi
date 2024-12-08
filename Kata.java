import java.util.Scanner;

public class Kata {

// 	checking if number is even;
	public static boolean isEven(int number){

	if (number % 2 == 0) {
		System.out.println(true + " number is even");
		return true;
		}

	else {
		System.out.println(false + " number is odd");
		return false;
		}


}
// 	checking the abstract of two numbers;
	public static int isSubtract(int number1,int number2){

	int subtract = number1 - number2;

	if (subtract < 0) {
		int multiple = -1 * subtract;

		System.out.println(multiple);
		return multiple;
	
		}

	else {

	System.out.println(subtract);
	return subtract;

	}


	}	


// 	checking if number is prime;
	public static boolean isPrime(int number){

	if (number <  2|| (number / 2 == 0 && number != 2) || (number / 3 == 0 && number != 3)) {
	System.out.println(false + " number is not prime");

	return false;

	}

	for (int value = 2;value * value <= number;value++){

	if (number % value == 0){
		System.out.println(false + "number is not prime");
		return false;
		}
	}
		System.out.println(true + " number is prime");	
	return true;


	}

	public static float quotient(float number,float value){

	if (value == 0){

	System.out.print(0);
	return 0;
	}

	float quotient = number / value;


	System.out.println("quotient is " + quotient);

	return quotient;


	}

	public static int factors(int number){

	int factor = 0;

	for(int count = 1; count <= number;count++){

	if (number % count == 0){
	factor ++;
	System.out.println(count);
	}
	

	}
	System.out.print("number has " + factor + " factors");
	return factor ;

	}

	public static boolean isSquare(int number){

	for(int count = 1 ;count < number;count++){


	if (number / count == count){

	System.out.print("\ntrue");
	return true;
	}
	}
	return false;
	
	}

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

		System.out.println("Enter number");
		int value = scan.nextInt();
		
		isEven(value);

		System.out.println("Enter number");
		int integer = scan.nextInt();

		isSubtract(value , integer);
		isPrime(value);

		quotient(value , integer);
		factors(value);
		isSquare(value);



}


}