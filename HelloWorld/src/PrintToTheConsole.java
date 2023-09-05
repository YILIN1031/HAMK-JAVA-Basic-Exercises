
public class PrintToTheConsole {

	public static void main(String[] args) {
		String creator = "Yilin"; 
		
		// Set number 1 and number 2
		int number1 = -10;
		int number2 = 3;
		
		// Set Addition, subtraction, multiplication, division 
		int addResult = number1 + number2;
		int multiplication = number1 * number2;
		int substraction = number1 - number2;
		float division = (float) number1 / (float) number2;
		
		// Print number 1 and number 2 
		System.out.println("Print App");
		System.out.println("This app is made by:" + creator);
		System.out.println("number1:\n" + number1);
		System.out.println("number2:\n" + number2);
		
		// Add, Multiplication, Division, Subtraction  
		System.out.printf("%d + %d is equal: %d\n", number1, number2, addResult);
		System.out.printf("%d * %d is equal: %d\n", number1, number2, multiplication);  
		System.out.printf("%d - %d is equal: %d\n", number1, number2, substraction);
		System.out.printf("%d / %d is equal: %.2f\n", number1, number2, division);
	}

}
