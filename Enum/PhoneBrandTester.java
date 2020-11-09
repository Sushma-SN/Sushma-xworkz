public class PhoneBrandTester{

public static void main(String[] names)
{
	String phoneBrandNokia="NOKIA";
	PhoneBrand convertedNokiaFromString=PhoneBrand.valueOf(phoneBrandNokia);
	System.out.println(convertedNokiaFromString);
	PhoneBrand[] allPhoneBrand=PhoneBrand.values();
	System.out.println(allPhoneBrand.length);
	
	for(int phoneBrandBasically=0;phoneBrandBasically<allPhoneBrand.length;phoneBrandBasically++)
	{
		System.out.println("index "+ phoneBrandBasically);
		PhoneBrand phoneBrandValue=allPhoneBrand[phoneBrandBasically];
		System.out.println("phoneBrand enum value "+ phoneBrandValue);
	}
	

}

}