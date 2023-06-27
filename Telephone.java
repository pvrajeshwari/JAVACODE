public class Telephone{
	public static void main(String[] args){
		
	boolean returnedValues = voting(17);
	System.out.println(returnedValues);
    boolean returnedDigit = atmNumber(667886746);
	System.out.println(returnedDigit);
	String returnednumber = checkPrime(7);
	System.out.println(returnednumber);
	String returnedCharacter = checkGender("Male");
	System.out.println(returnedCharacter);
	boolean returnResult=marks(8.5f);
	System.out.println(returnResult);
	String returnedValue  = checkPositiveOrNegative(-5);
	System.out.println(returnedValue);
	String returnedGreatesh = greatestNumber(45 , 55);
	System.out.println(returnedGreatesh);
	int returnMul = multiplication(4 , 8);
	System.out.println(returnMul);
	
		
		
	}
	
	
	public static boolean voting(int age){
		if(age>=18){
			System.out.println("eligible for voting");
			return true;
		}
		else{
			System.out.println("not voting");
			return false;
		}
	}

	public static boolean atmNumber(long number){
		if(number>=12){
			System.out.println("number is valid");
			return true;
		}
		else{
			System.out.println("number is invalid");
			return false;
		}
	}
	public static String checkPrime (int number){
		if(number%2==0){
			System.out.println("Prime");
			return "prime";
		}
		else{
			System.out.println("not a prime number");
			return "not prime";
		}
	}
	public static String checkGender(String gender){
		if(gender == "Male"){
			System.out.println("Male");
			return "M";
		}
		else{
			System.out.println("Female");
			return "F";
		}
	}
	public static boolean marks(float sgpa){
		if(sgpa>=4.5f){
			System.out.println("pass");
			return true;
		}
		else{
			System.out.println("fail");
			return false;
		}
	}
	public static String checkPositiveOrNegative(int digit){
		if(digit>0){
			System.out.println("positvie");
			return "Positive";
		}
		else{
			System.out.println("negative");
			return "Negavtive";
		}
	}
	public static String greatestNumber(int a, int b){
		if(a > b){
			System.out.println("Greater");
			return "A is greater";
		}
		else{
			System.out.println("B is greater");
			return "B is greater";
		}
		
	}
	public static int multiplication(int a, int b){
		int c = a * b;
		return c;

	}
	
 
	
	
}