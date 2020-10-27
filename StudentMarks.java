public class StudentMarks{

public static String report(double marks)
{
	System.out.println("invoked report()");
	
	System.out.println("Marks:" + marks);
	if(marks>80 && marks<=100){
		System.out.println("Marks is:"+marks);
		return "Distincation";
	}
	if(marks>80 && marks<=100){
		System.out.println("Marks is:"+marks);
		return "Distincation";
	}
	
	if(marks>60 && marks<79){
		System.out.println("Marks is:"+marks);
		return "First class";
	}
	
	if(marks>50 && marks<59){
		System.out.println("Marks is:"+marks);
		return "Second class";
	}
	
	if(marks>36 && marks<49){
		System.out.println("Marks is:"+marks);
		return "Third class";
	}	
	
	if(marks<35){
		System.out.println("Marks is:"+marks);
		return "Fail";
	}
	return "Nothing";
	
}



}