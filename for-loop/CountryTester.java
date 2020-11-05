public class CountryTester
{
	public static void main(String[] words)
	{
		System.out.println("JVM invoked main");
		
		Country.place(words);
		
		System.out.println("EXIT :: main");
	}
	
}