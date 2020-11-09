public class FruitsTester{

public static void main(String[] names)
{
	String  fruitsKiwi="KIWI";
	Fruits convertedKiwiFromString=Fruits.valueOf(fruitsKiwi);
	System.out.println(convertedKiwiFromString);
	Fruits[] allFruits=Fruits.values();
	System.out.println(allFruits.length);
	
	for(int fruitsInitially=0;fruitsInitially<allFruits.length;fruitsInitially++)
	{
		System.out.println("index "+ fruitsInitially);
		Fruits fruitsValue=allFruits[fruitsInitially];
		System.out.println("fruits enum value "+ fruitsValue);
	}
	

}

}