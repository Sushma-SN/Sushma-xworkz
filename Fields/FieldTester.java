public class FieldTester{
	
	public static void main(String[] args){
		
		System.out.println("invoked main");
		
		
		System.out.println("print details of FiledPlayer : ");
		System.out.println("score   "+FieldPlayer.score);
		byte door=FieldPlayer.age;
		System.out.println("age   "+door);
		System.out.println("name   "+FieldPlayer.name);
		System.out.println("noOfRunsInYear  "+FieldPlayer.noOfRunsInYear);
		System.out.println("statement   "+FieldPlayer.statement);
		
		
	    System.out.println("print details of FiledCompany : ");

		
		System.out.println("noOfEmployees  "+FieldCompany.noOfEmployees);
		System.out.println("holidays   "+FieldCompany.holidays);
		System.out.println("nameOfEmployee   "+FieldCompany.nameOfEmployee);
		System.out.println("salaryInYear   "+FieldCompany.salaryInYear);
		System.out.println("workingDays   "+FieldCompany.workingDays);
		
		
		System.out.println("print details of FiledMovies : ");

		
		System.out.println("noOfMovies  "+FieldMovies.noOfMovies);
		System.out.println("totalNoOfMovies   "+FieldMovies.totalNoOfMovies);
		System.out.println("role  "+FieldMovies.role);
		System.out.println("hourOfMovie  "+FieldMovies.hourOfMovie);
		System.out.println("feedbackOfMovies   "+FieldMovies.feedbackOfMovies);
		
		
		System.out.println("print details of FiledBank : ");

		
		System.out.println("withdrawn  "+FieldBank.withdrawn);
		System.out.println("account   "+FieldBank.account);
		System.out.println("bankName   "+FieldBank.bankName);
		System.out.println("balance   "+FieldBank.balance);
		System.out.println("city   "+FieldBank.city);
		
		
		System.out.println("print details of FiledShopping : ");
		
		
		System.out.println("noOfTops  "+FieldShopping.noOfTops);
		System.out.println("noOfBrands   "+FieldShopping.noOfBrands);
		System.out.println("onlineShopping   "+FieldShopping.onlineShopping);
		System.out.println("money   "+FieldShopping.money);
		System.out.println("onlineShoppingRatings   "+FieldShopping.onlineShoppingRatings);

	}
}
