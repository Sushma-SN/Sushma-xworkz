public class InstituteTester{


public static void main(String[] photos)
{

System.out.println("invoked main, doing switch and enum");

InstituteFinder.lowestAndBestUsingString("whatever ");
	String instituteName="XWORKZ";
	Institute enumInstituteName=Institute.valueOf(instituteName);
InstituteFinder.lowestAndBestUsingEnum(enumInstituteName);

System.out.println("EXIT :: main, doing switch and enum");
}

}