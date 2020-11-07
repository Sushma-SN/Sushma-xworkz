public class TheaterFinder{
	
	public static void goodTheaterInGulbargaUsingString(String theaterName)
	{
		System.out.println("Invoked goodTheaterInGulbargaUsingString");
		System.out.println("arg 1 theaterName "+theaterName);
		switch(theaterName){
			case "Muktacinemas":
				System.out.println("case : "+theaterName);
				System.out.println("Booked on sunday");
				break;
			
			case "Mirajcinemas":
				System.out.println("case : "+theaterName);
				System.out.println("Booked on saturday");
				break;
				
			case "Shettymultiplex":
				System.out.println("case : "+theaterName);
				System.out.println("Booked on friday");
				break;
				
			case "Sangam":
				System.out.println("case : "+theaterName);
				System.out.println("Booked on friday");
				break;
				
			default:
				System.out.println("No Theater found");
		
	}
	
	System.out.println("EXIT :: goodTheaterInGulbargaUsingString");
}	

public static void goodTheaterInGulbargaUsingEnum(Theater theaterName)
{

System.out.println("invoked goodTheaterInGulbargaUsingEnum");
	System.out.println("arg 1 theaterName "+theaterName);	
	switch(theaterName){
		case MUKTACINEMAS:
				System.out.println("case : " +theaterName);
				System.out.println("cost is 200");
				break;
		case SANGAM :
				System.out.println("case : " +theaterName);
				System.out.println("cost is 120");
				break;
		case MIRAJCINEMAS:
				System.out.println("case : " +theaterName);
				System.out.println("cost is 200");
				break;
		case SHETTYMULTIPLEX:
				System.out.println("case : " +theaterName);
				System.out.println("cost is 160");
				break;		
		default :
				System.out.println("no theater found");
	}
	
	System.out.println("EXIt:: goodTheaterInGulbargaUsingEnum");
}

}