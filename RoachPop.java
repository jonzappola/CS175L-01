public class RoachPop
{
    double population = 0;  

    public RoachPop(float intSize)
    {
        population = intSize; 
    }
    public void breed()
    {
        population *= population;  
    }
    public void spray(double percent)
    {
        double sizePercent = population/percent;   
        population = population - sizePercent;  
    }
    public double getRoaches()
    {
        return population; 
    }
}
