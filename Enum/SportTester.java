public class SportTester{

public static void main(String[] names)
{
	String sportKabaddi="KABADDI";
	Sport convertedKabaddiFromString=Sport.valueOf(sportKabaddi);
	System.out.println(convertedKabaddiFromString);
	Sport[] allSports=Sport.values();
	System.out.println(allSports.length);
	
	for(int sportsInitial=0;sportsInitial<allSports.length;sportsInitial++)
	{
		System.out.println("index "+ sportsInitial);
		Sport sportValue=allSports[sportsInitial];
		System.out.println("sport enum value "+ sportValue);
	}
	

}

}