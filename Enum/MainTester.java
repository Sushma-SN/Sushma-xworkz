public class MainTester
{
	public static void main(String[] item)
	{
		System.out.println("JVM Invoked main");
		
		String items=item[0];
		Mainargument converted=Mainargument.valueOf(items);
		
		System.out.println("Item name: "+converted);
		
		System.out.println("EXIT :: main");
	}
	public static void itemName(Mainargument name)
	{
		System.out.println("Item: "+name);
	}
}
