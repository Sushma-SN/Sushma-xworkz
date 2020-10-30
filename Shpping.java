public class Shopping{
	
	public static void buying(int numberOfBags){
		System.out.println("invoked buying with one parameters ");
		System.out.println("numberOfBags :"+numberOfBags);
	}

	public static void buy(int numberOfBags,String brand){
		System.out.println("invoked buying with two parameters ");
		System.out.println("numberOfBags :"+numberOfBags);
		System.out.println("brand :"+brand);
	}	
	
	public static void buying(String numberOfBags,String brand){
		System.out.println("invoked buying with two parameters ");
		System.out.println("numberOfBags :"+numberOfBags);
		System.out.println("brand :"+brand);
	}
	
	public static void biying(String brand,int numberOfBags){
		System.out.println("invoked buying with two parameters ");
		System.out.println("brand :"+brand);
		System.out.println("numberOfBags :"+numberOfBags);
	}
	
}