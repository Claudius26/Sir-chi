public class RepeatedMultipleOfFour {

	public static void main(String[] args){

int count = 1;

while (count < 6) {

for(int number = 4; number <= 10; number+=4) {

	 System.out.println(number * 4);

}
	count++;
}
}
}