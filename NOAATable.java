public class NOAATable
{
	public static void main(String args[])
	{
		int T = 80;
		System.out.printf("     ");
		for (T=80;T<=110;T+=2) 
		{
			System.out.printf("%5d",T);
			
		}
		System.out.println();
		System.out.println("______________________________________________________________________________________");
		
		for (int RH = 40; RH <= 100;RH+=5)
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
		
	}
}
