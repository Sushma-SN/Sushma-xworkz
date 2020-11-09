public class ColorTester{

public static void main(String[] names)
{
	String colorBlack="BLACK";
	Color convertedBlackFromString=Color.valueOf(colorBlack);
	System.out.println(convertedBlackFromString);
	Color[] allColor=Color.values();
	System.out.println(allColor.length);
	
	for(int colorInitially=0;colorInitially<allColor.length;colorInitially++)
	{
		System.out.println("index "+ colorInitially);
		Color colorValue=allColor[colorInitially];
		System.out.println("color enum value "+ colorValue);
	}
	

}

}