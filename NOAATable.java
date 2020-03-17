import java.util.Scanner;
public class NOAATable
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int T = 80;
		int RH = 40;
		System.out.printf("     ");
		for (T=80;T<=110;T+=2) 
		{
			System.out.printf("%5d",T);
			
		}
		System.out.println();
		System.out.println("______________________________________________________________________________________");
		
		for (RH = 40; RH <= 100;RH+=5)
		{
			System.out.printf("%3d | ",RH);
			T = 80;
			for (int a = 1; a <= 16; a++)
			{
				System.out.printf("%5d",(int)(-42.379+2.04901523*T+10.14333127*RH-.22475541*T*RH-.00683783*T*T-.05481717*RH*RH+.00122874*T*T*RH+.00085282*T*RH*RH-.00000199*T*T*RH*RH));
				T += 2;
			}
			System.out.println(); 
		}
	    while(T>1){
	    System.out.println("Enter the temperature or 0 to end: ");
	    T = scan.nextInt();
	    if(T==0){
	        break;
	    }
	    System.out.println("Enter the relative humidity: ");
	    RH = scan.nextInt();
	    int THI = (int)(-42.379+2.04901523*T+10.14333127*RH-.22475541*T*RH-.00683783*T*T-.05481717*RH*RH+.00122874*T*T*RH+.00085282*T*RH*RH-.00000199*T*T*RH*RH);
	    System.out.printf("The THI for a temperature of "+T+" and relative of "+RH+" is: "+THI);
	    if(THI<=90){
	        System.out.println(" Advisory: Caution.");
	    }
	    else if(THI<105){
	        System.out.println(" Advisory: Extreme Caution.");
	    }    
	    else if(THI<126){
	        System.out.println(" Advisory: Danger.");
	    }
	    else{
	        System.out.println(" Advisory: Extreme Danger.");
	    }
	    }
	    
	    
	}
}
