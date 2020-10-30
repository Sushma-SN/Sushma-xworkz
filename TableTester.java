public class TableTester{
	public static void main(String[] table){
		
		System.out.println("Invoked main");
		
		Table.holding(8);
		
		Table.holding("BOOK",2);
		
		Table.holding(7,"BOOK");
		
		Table.holding("5","BOOK");
		
		System.out.println("EXIT:: main");
		
	}

}