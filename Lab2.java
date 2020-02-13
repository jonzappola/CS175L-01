import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		double x = scan.nextInt();
		System.out.println("Enter another integer: " );
		double y = scan.nextInt();
		
		double sum = x+y;
		double difference = x-y;
		double product = x*y;
		double average = (x+y)/2;
		double distance = Math.abs(difference);
		double max = Math.max(x, y);
		double min = Math.min(x, y);
			
		System.out.printf("Sum:%10.2f"+sum);
		System.out.printf("Difference:%10.2f"+difference);
		System.out.printf("Product:%10.2f"+product);
		System.out.printf("Average:%10.2f"+average);
		System.out.printf("Distance:%10.2f"+distance);
		System.out.printf("Maximum:%10.2f"+max);
		System.out.printf("Minimum:%10.2f"+min);
		
	}
}

