public class CountryTester{
	
	public static void main(String[] args)
	{
		System.out.println("invoked main");
		
		System.out.println("country name   ="+ Country.countryName);
		
		int door=Country.areaOfCountry;
		
		System.out.println("area of country   =" + door);
		
		System.out.println("no of states   ="+ Country.noOfStates);
		
		System.out.println("no of cities in india   ="+ Country.noOfCitiesInIndia);
		
		System.out.println("unionTerrotories   ="+Country.unionTerrotories);
	
		System.out.println("EXIT :: main");
		
	}
}