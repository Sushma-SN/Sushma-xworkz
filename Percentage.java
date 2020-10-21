public class Percentage{
	
	public static void main(String[] args)
	{
		System.out.println("invoked main method by JVM");
		arrayOfPercentage();
	}
	public static void arrayOfPercentage()
	{
		System.out.println("invoked arrayOfPercentage");

		float sslcPercentage=77.33f;
		float pucPercentage=66.25f;
		float degreePercentage=61.01f;
		
		float[] percentage={sslcPercentage,pucPercentage,degreePercentage};
		
		int sizeOfArray=percentage.length;
		System.out.println("Total elements "+sizeOfArray);
		 
		float elementAtIndex1=percentage[1];
		System.out.println("Element at index one: "+elementAtIndex1);
	
	}
} 