public class ReturnType2{
	public static void main(String args[]){
	char returnedValue = vowel();
	System.out.println("returnedvalue");
	int mulValue = mul();
	System.out.println("mulvalue");
	boolean numberedValue = checkTheNo();
	System.out.println("numberedvalue");
	long numberValue = phoneNo();
	System.out.println("piValue");
	double weightedValue = weight();
	System.out.println("weightedValue");
	String brandValue = bagBrand();
	System.out.println("brand valuealue");
	int[] returnValue = method();
	System.out.println("returnvalue");
	}
	public static char vowel(){
		System.out.println("method started");
		return 'A';
	}
	public static int mul(){
		int a = 10;
		int b = 20;
		int c = a*b;
		return c;
	}
	
	public static boolean checkTheNo(){
		int number=-1;
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static long phoneNo(){
		Long phoneNo = 1987636376L;
		return phoneNo;
	}

	
	public static double weight(){
			double weight = 1.1234e234d;
			return weight;
	}
	public static String bagBrand(){
			System.out.println("brand");
			return "HP";
	}
	public static int[] method(){
		int[] sampleNo = {1,2,3,4,5};
		return sampleNo;
	}
}











	