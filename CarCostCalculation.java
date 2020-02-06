import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the cost of the regular car: ");
	double regularCar = scan.nextDouble();
	System.out.println("Enter the MPG for the regular car: ");
	double regularMPG = scan.nextDouble();
	System.out.println("Enter the cost of the hybrid car: ");
	double hybridCar = scan.nextDouble();
	System.out.println("Enter the MPG for the hybrid car: ");
	double hybridMPG = scan.nextDouble();
	System.out.println("Enter miles traveled in a year: ");
	double milesTraveled = scan.nextDouble();
	System.out.println("Enter the cost per gallon of gas: ");
	double gasPrice = scan.nextDouble();
	
	double hybridCost = hybridCar + (milesTraveled/hybridMPG)*gasPrice;
	double regularCost = regularCar + (milesTraveled/regularMPG)*gasPrice;
	System.out.println("Cost to own after year 1 for regular car: "+regularCost+" for hybrid car: "+hybridCost);
	hybridCost = hybridCost + (milesTraveled/hybridMPG)*gasPrice;
	regularCost = regularCost + (milesTraveled/regularMPG)*gasPrice;
	System.out.println("Cost to own after year 2 for regular car: "+regularCost+" for hybrid car: "+hybridCost);
	hybridCost = hybridCost + (milesTraveled/hybridMPG)*gasPrice;
	regularCost = regularCost + (milesTraveled/regularMPG)*gasPrice;
	System.out.println("Cost to own after year 3 for regular car: "+regularCost+" for hybrid car: "+hybridCost);
	hybridCost = hybridCost + (milesTraveled/hybridMPG)*gasPrice;
	regularCost = regularCost + (milesTraveled/regularMPG)*gasPrice;
	System.out.println("Cost to own after year 4 for regular car: "+regularCost+" for hybrid car: "+hybridCost);
	hybridCost = hybridCost + (milesTraveled/hybridMPG)*gasPrice;
	regularCost = regularCost + (milesTraveled/regularMPG)*gasPrice;
	System.out.println("Cost to own after year 5 for regular car: "+regularCost+" for hybrid car: "+hybridCost);
	
	if (hybridCost < regularCost)
	{
		System.out.println("The hybid car pays back after 5 years.");
	}
	else
	{
		System.out.println("The regular car pays back: ");
	}
	}

}
