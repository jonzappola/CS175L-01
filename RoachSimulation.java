public class RoachSimulation
{
    public static void main(String[] args){
        RoachPop pop = new RoachPop(10);
       
        System.out.println("Initial roach population is " + pop.getRoaches());

        pop.breed();
        pop.spray(10);
        System.out.println("After 1st round the roach population is " + pop.getRoaches());
        pop.breed();
        pop.spray(10);
        System.out.println("After 2nd round the roach population is " + pop.getRoaches());
        pop.breed();
        pop.spray(10);
        System.out.println("After 3rd round the roach population is " + pop.getRoaches());
        
    }
}
