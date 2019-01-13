public class Minute 
{
	public static void main( String [] args)
	{
	int min=700000;
	int year = min/525600;
	int month = min/43200;
	int day = min/1440;
	System.out.println("no. of YEARS :"+year+"yrs");
	System.out.println("no. of MONTHS :"+month+"mnths");
	System.out.println("no. of DAYS :"+day+"days");
	}
}