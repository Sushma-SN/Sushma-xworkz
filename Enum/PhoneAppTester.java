public class PhoneAppTester{

public static void main(String[] names)
{
	String phoneAppEmail="EMAIL";
	PhoneApp convertedEmailFromString=PhoneApp.valueOf(phoneAppEmail);
	System.out.println(convertedEmailFromString);
	PhoneApp[] allPhoneApp=PhoneApp.values();
	System.out.println(allPhoneApp.length);
	
	for(int phoneAppIcon=0;phoneAppIcon<allPhoneApp.length;phoneAppIcon++)
	{
		System.out.println("index "+ phoneAppIcon);
		PhoneApp phoneAppValue=allPhoneApp[phoneAppIcon];
		System.out.println("phoneApp enum value "+ phoneAppValue);
	}
	

}

}