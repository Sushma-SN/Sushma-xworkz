public class India{

	public static void main(String[] city)
	{
	
		System.out.println("invoked main method by JVM");
	
		String[] stateName={"Karnataka",
		"MP",
		"UP",
		"AP",
		"Bihar",
		"Gujarat",
		"HP",
		"Kerala",
		"Punjab",
		"Rajasthan",
		"West bengal",
		"Tamil nadu",
		"Manipur",
		"Jharkhand",
		"Assam"};
		state(stateName);
	
		System.out.println("exit main method by JVM"); 
	}

	public static void state(String[] names)
	{
		System.out.println("state :"+names);
		int size=names.length;
		System.out.println(size);
		String elementATIndex0=names[0];
		System.out.println("state @ index 0 "+elementATIndex0 + names[8] + names[14]);
		System.out.println("state @ index 1 "+elementATIndex0);
		System.out.println("state @ index 10 "+names[5]);
	}
}