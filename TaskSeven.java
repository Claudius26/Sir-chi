public class TaskSeven {

	public static void main(String[] args) {
	
	for (int number = 1; number < 10; number++ ) {

	if (number % 4 == 0) {
	int multiple = 1;
	int sumOfMultiple = 0;
	for (int count = 1; count <= 5; count++){

	multiple *= number;

	sumOfMultiple += multiple;

	}
	System.out.print(sumOfMultiple);
}

}
}
}