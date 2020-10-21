public class Boolean{
	
	public static void main(String[] args)
	{
		System.out.println("invoked main method by JVM");
		arrayOfBoolean();
	}
	public static void arrayOfBoolean()
	{
		System.out.println("invoked arrayOfBoolean");

		
		boolean[] arr={true,false};
		
		int sizeOfArray=arr.length;
		System.out.println("Total elements "+sizeOfArray);
		 
		boolean elementAtIndex0=arr[0];
		System.out.println("Element at index zero: "+elementAtIndex0);
	
	}
} 