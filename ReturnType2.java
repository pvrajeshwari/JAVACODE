public class ReturnType2{
	public static void main(String args[]){
	char returnedValue = vowel();
	System.out.println(returnedValue);
	int mulValue = mul();
	System.out.println(mulValue);
	boolean numberedValue = checkTheNo();
	System.out.println(numberedValue);
	long numberValue = phoneNo();
	System.out.println(numberValue);
	double weightedValue = weight();
	System.out.println(weightedValue);
	String brandValue = bagBrand();
	System.out.println(brandValue);
	int[] studentValue =nameMethod();
       for(int i =0; i<=studentValue.length-1;i++)
	System.out.println(studentValue[i]);
	}
	public static char vowel(){
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
			String name="Rajeshwari";
			return name;
	}
	
	
	public static int[] nameMethod(){
	
		int[] isStudent = {2,3,3,4,5};
			return isStudent;
	}
	}








	