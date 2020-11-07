public class Gallery{
	
public static void main(String[] photos)
	{
		System.out.println("invoked main,doing swtich");
		String storeIn="Private";
		
		
		switch (storeIn)
		{
			case "Private":
				System.out.println("store images in private folder");
				System.out.println("stored on nov7");
				break;
			case "Public":
				System.out.println("store images in public folder");
				System.out.println("stored on nov7");
				break;
			case "Cloud":	
				System.out.println("store images in private folder");
				System.out.println("stored on nov7");
				break;
			default:
				System.out.println("cannot store images");
	
        }
		
		System.out.println("EXIT :: main,doing swtich");
	}

}