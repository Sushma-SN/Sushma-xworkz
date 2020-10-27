public class MarksOfStudent{
	
	public static void main(String[] student)
	{
		
		System.out.println("JVM invoked main method");
		double marks=50;
		System.out.println("return marks from report");
		
		String value=StudentMarks.report(marks);
		System.out.println("return marks from report: "+ marks);
		
		System.out.println("EXIT :: main");	
		
	}


}