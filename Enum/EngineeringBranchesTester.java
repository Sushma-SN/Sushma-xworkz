public class EngineeringBranchesTester{

public static void main(String[] names)
{
	String engineeringBranchesCse="CSE";
	EngineeringBranches convertedCseFromString=EngineeringBranches.valueOf(engineeringBranchesCse);
	System.out.println(convertedCseFromString);
	EngineeringBranches[] allEngineeringBranches=EngineeringBranches.values();
	System.out.println(allEngineeringBranches.length);
	
	for(int engineeringBranchesSem=0;engineeringBranchesSem<allEngineeringBranches.length;engineeringBranchesSem++)
	{
		System.out.println("index "+ engineeringBranchesSem);
		EngineeringBranches engineeringBranchesValue=allEngineeringBranches[engineeringBranchesSem];
		System.out.println("engineeringBranches enum value "+ engineeringBranchesValue);
	}
	

}

}