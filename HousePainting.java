import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the length of the house:");
		int houseLength = scan.nextInt();
		System.out.print("Enter the width of the house:");
		int houseWidth = scan.nextInt();
		System.out.print("Enter the height of the house:");
		int houseHeight = scan.nextInt();
		
		double houseSqft = 2*(houseWidth*houseLength)+2*((houseLength*houseWidth)+0.5*(houseLength*(houseHeight-houseWidth)));
		
		System.out.print("Enter the number of windows: ");
		int numberWindows = scan.nextInt();
		System.out.print("Enter the length of the window:");
		int windowLength= scan.nextInt();
		System.out.print("Enter the width of the window:");
		int windowWidth = scan.nextInt();
		
		
		System.out.print("Enter the number of doors:");
		int numberDoors = scan.nextInt();
		System.out.print("Enter the length of the door:");
		int doorLength = scan.nextInt();
		System.out.print("Enter the width of the door:");
		int doorWidth = scan.nextInt();
		
		
		double windowDoorSqft = (numberWindows*(windowWidth*windowLength)+numberDoors*(doorWidth*doorLength));
		double totalSqft = (houseSqft-windowDoorSqft);
		System.out.print("Sqft to paint:" );
		System.out.println(totalSqft);
		
		System.out.println("Enter the painters cost per sqft: ");
		double costPerSqft = scan.nextDouble();
		double costToPaint = (costPerSqft*totalSqft);
		System.out.print("The total cost to paint is: $");
		System.out.println(costToPaint);
		
				
	}

}
