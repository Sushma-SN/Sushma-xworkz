public class Character{
	
	public static void main(String[] args)
	{
		System.out.println("invoked main method by JVM");
		arrayOfAlphabets();
	}
	public static void arrayOfAlphabets()
	{
		System.out.println("invoked arrayOfAlphabets");
		
		char[] alphabets={'a','b','c','d','e','f','g','h','i','j'};
		
		int sizeOfArray=alphabets.length;
		System.out.println("Total elements "+sizeOfArray);
		 
		char elementAtIndex8=alphabets[8];
		System.out.println("Element at index eight: "+elementAtIndex8);
	
	}
} 