public class Pen{
	
	public static void writing(int number){
		System.out.println("invoked writing with one parameters ");
		System.out.println("number :"+number);
	}

	public static void writing(int number,String color){
		System.out.println("invoked writing with two parameters ");
		System.out.println("int and String");
		System.out.println("number :"+number);
		System.out.println("color :"+color);
	}	
	
	public static void writing(String number,String color){
		System.out.println("invoked writing with two parameters ");
		System.out.println("String and String");
		System.out.println("number :"+number);
		System.out.println("color :"+color);
	}
	
	public static void writing(String color,int number){
		System.out.println("invoked reading with two parameters ");
		System.out.println("String and int");
		System.out.println("color :"+color);
		System.out.println("number :"+number);
	}
	
}