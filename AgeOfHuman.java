public class AgeOfHuman{


    public static void main(String[] models)
	{
		System.out.println("JVM invoked main ");		
		byte age=23;
		System.out.println("return value from ageDefinition");
		  
		String value=HumanAge.ageDefinition(age);
		System.out.println("return value from ageDefinition: "+ value);
		  
		System.out.println("EXIT:: main");
		
	}

}