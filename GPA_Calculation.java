import java.util.Scanner;
public class GPA_Calculation {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String courses = " ";
	double countCreditHours = 0;
	double countGradePoints = 0;
	double gradePoints = 0;
	double creditHours = 0;
	double GPA = 0;
	System.out.println("Enter course information seperated by commas (title, credit hours, letter grade) or type Q to quit");
	System.out.print("Course");
	System.out.print("    Credit Hours");
	System.out.print("    Grade");
	System.out.print("    Grade Points\n");
	for(int i = 0; i < 10; i++) //put output in columns
	{
		System.out.print("Input:");
		courses = scan.nextLine();
		
		if(courses.equals("Q") || courses.equals("q"))
		{
			break;
		}
		else if(courses.length()>5)
		{
			String[] input = courses.split(",");
			creditHours = Double.parseDouble(input[1]);
			countCreditHours = countCreditHours+creditHours;
			
			System.out.print(input[0]+"       ");
			System.out.print(input[1]+"              ");
			System.out.print(input[2]+"          ");
			
			if(input[2].equals("A"))
			{
				gradePoints = creditHours*4;
			}
			else if(input[2].equals("A-"))
			{
				gradePoints = creditHours*3.70;
			}
			else if(input[2].equals("B+"))
			{
				gradePoints = creditHours*3.33;
			}
			else if(input[2].equals("B"))
			{
				gradePoints = creditHours*3.00;
			}
			else if(input[2].equals("B-"))
			{
				gradePoints = creditHours*2.70;
			}
			else if(input[2].equals("C+"))
			{
				gradePoints = creditHours*2.30;
			}
			else if(input[2].equals("C"))
			{
				gradePoints = creditHours*2.00;
			}
			else if(input[2].equals("C-"))
			{
				gradePoints = creditHours*1.70;
			}
			else if(input[2].equals("D+"))
			{
				gradePoints = creditHours*1.30;
			}
			else if(input[2].equals("D"))
			{
				gradePoints = creditHours*1.00;
			}
			else if(input[2].equals("D-"))
			{
				gradePoints = creditHours*.70;
			}
			else if(input[2].equals("WF")||input[2].equals("F"))
			{
				gradePoints = creditHours*0.00;
			}
			else
				return;
			System.out.printf("%.2f\n",gradePoints);
			countGradePoints = countGradePoints+gradePoints;
		}
		GPA = countGradePoints/countCreditHours;
	}
		System.out.printf("Total Grade Points: %.2f ",countGradePoints);
		System.out.printf(" Total Credit Hours Attempted: %.2f\n",countCreditHours);
		System.out.printf("GPA = %.2f",GPA);
		
	}

}

