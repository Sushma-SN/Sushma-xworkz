public class Country
{
	public static void place(String[] names)
	{
		System.out.println("Invoked place");
		
		for(int map=0;map<names.length;map++)
		{
			System.out.println("index value: "+map);
			String Country=names[map];
			System.out.println("country names: "+Country);
		}
	}
}
