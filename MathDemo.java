import java.util.*;

public class MathDemo {
    public static void main(String cals[]) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;


	System.out.print("Input the first number: ");
	int num1 = scanner.nextInt();
	System.out.print("Input the second number: ");
	int num2 = scanner.nextInt();
	System.out.print("Input an operator(+,-,*,/): ");
	char operator = scanner.next().charAt(0);

	if(operator == '+'){
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}
	if(operator == '-'){
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);

	}
	if(operator == '*'){
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);

	}
	if(operator == '/'){
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);

	}
