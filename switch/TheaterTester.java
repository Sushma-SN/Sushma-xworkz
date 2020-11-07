public class TheaterTester
{
	public static void main(String[] names)
	{
		System.out.println("Invoked main");
		TheaterFinder.goodTheaterInGulbargaUsingString("were ever");
		String theaterName="MUKTACINEMAS";
		Theater enumTheaterName=Theater.valueOf(theaterName);
		TheaterFinder.goodTheaterInGulbargaUsingEnum(enumTheaterName);
		System.out.println("EXIT :: main");
	}
}	