public class Travel{
	
	public static void booking(int numberOfTickets){
		System.out.println("invoked booking with one parameters ");
		System.out.println("numberOfTickets :"+numberOfTickets);
	}

	public static void booking(int numberOfTickets,String place){
		System.out.println("invoked booking with two parameters ");
		System.out.println("int and String");
		System.out.println("numberOfTickets :"+numberOfTickets);
		System.out.println("place :"+place);
	}	
	
	public static void booking(String numberOfTickets,String place){
		System.out.println("invoked booking with two parameters ");
		System.out.println("String and String");
		System.out.println("numberOfTickets :"+numberOfTickets);
		System.out.println("place :"+place);
	}
	
	public static void booking(String place,int numberOfTickets){
		System.out.println("invoked booking with two parameters ");
		System.out.println("String and int");
		System.out.println("place :"+place);
		System.out.println("numberOfTickets :"+numberOfTickets);
	}
	
}