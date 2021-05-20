import java.util.Scanner;

public class Q5585 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money, change;
		int result = 0;
		
		money = scanner.nextInt();
		change = 1000 - money;
		
		result += change / 500;
		change = change % 500;
		result += change / 100;
		change = change % 100;
		result += change / 50;
		change = change % 50;
		result += change / 10;
		change = change % 10;
		result += change / 5;
		change = change % 5;
		result += change;
		
		System.out.println(result);

	}

}
