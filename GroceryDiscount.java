import java.util.Scanner;
public class GroceryDiscount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		double price = scan.nextDouble();
		double coupon = 0;
		
		if(price < 10)
		{
			System.out.print("You are not eligible for a coupon at this time.");
		}
		else if(price>=10&&price<=60)
		{
			coupon = price*.08;
			System.out.printf("You win a discount coupon of $ %.2f",coupon);
			System.out.print(" (8% of your purchase)");
		}
		else if(price>60&&price<=150)
		{
			coupon = price*.10;
			System.out.printf("You win a discount coupon of $ %.2f",coupon);
			System.out.print(" (10% of your purchase)");
		}
		else if(price>150&&price<=210)
		{
			coupon = price*.12;
			System.out.printf("You win a discount coupon of $ %.2f",coupon);
			System.out.print(" (12% of your purchase)");
		}
		else
		{
			coupon = price*.14;
			System.out.printf("You win a discount coupon of $ %.2f",coupon);
			System.out.print(" (14% of your purchase)");
		}
		
	}
	
}
