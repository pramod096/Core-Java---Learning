
public class GalToLitTable {
	public static void main(String args[])
	{
		double gallons,liters;
        for(gallons = 1; gallons <= 100; gallons++)
        {
        	liters = 3.7854 * gallons;
        	System.out.println(+gallons+" gallons in Liters is : " +liters);
        	if(gallons%10 == 0)
        		System.out.println();
        }
	}
}
