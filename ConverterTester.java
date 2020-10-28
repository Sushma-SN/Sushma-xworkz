public class ConverterTester{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to all primitives");
		
		String age="57";
		byte convertedAge=Byte.parseByte(age);
		System.out.println("converted byte: "+convertedAge);
		
		String score="200";
		short convertedScore=Short.parseShort(score);
		System.out.println("converted short: "+convertedScore);
		
		String studentsInCollege="33000";
		int convertedStudentsInCollege=Integer.parseInt(studentsInCollege);
		System.out.println("converted integer: "+convertedStudentsInCollege);
		
		String studentInWorld="214748300";
		long convertedStudentsInWorld=Long.parseLong(studentInWorld);
		System.out.println("converted long: "+convertedStudentsInWorld);
		
		String percentage="72.25";
		float convertedPercentage=Float.parseFloat(percentage);
		System.out.println("converted float: "+convertedPercentage);
		
		String area="23.25";
		double convertedArea=Double.parseDouble(area);
		System.out.println("converted double: "+convertedArea);
		
		String pass="true";
		boolean convertedBool=Boolean.parseBoolean(pass);
		System.out.println("converted boolean: "+convertedBool);
		
		String studentGrade="A";
		char convertedStudentGrade=studentGrade.charAt(0);
		System.out.println("converted character: "+convertedStudentGrade);
		
		System.out.println("EXIT :: main");
	}	
}