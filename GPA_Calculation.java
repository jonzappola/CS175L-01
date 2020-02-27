import java.util.Scanner;
public class GPA_Calculation {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String courses = " ";
	double countCreditHours = 0;
	
	for(int i = 0; i < 10; i++) //put output in columns
	{
		System.out.println("Enter course information seperated by commas (title, credit hours, letter grade) or type Q to quit:");
		courses = scan.nextLine();
		
		if(courses == "Q" || courses == "q")
		{
			break;
		}
		else if(courses.length()>5)
		{
			String[] input = courses.split(",");
			double creditHours = Double.parseDouble(input[1]);
			countCreditHours += creditHours;
		}
		
	}
	
	}

}
