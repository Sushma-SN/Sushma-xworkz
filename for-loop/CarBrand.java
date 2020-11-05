public class CarBrand
{
	public static String[] getBrands()
	{
		System.out.println("inkoved carBrands");
		String[] brandName={"Mahindra","Tata Motors","Maruti Suzuki","Toyata"};
		System.out.println("length of array="  + brandName.length);
		for(int count=0;count<brandName.length;count++)
		{
			System.out.println("car name :" +count);
			String names=brandName[count];
			System.out.println("name of the car brands :"  + names);
		}
		return brandName;
	}
}	
		