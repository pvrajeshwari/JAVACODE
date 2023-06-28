//Method overloading
public class Institute{

	public static void main (String[] args){
	
	int returnedarea=area(18); // Method 1 calling method with int value1
	System.out.println(returnedarea);
	
	int returnedarea1=area (5,12);//calling method with int value1,int value2
	System.out.println(returnedarea1);
	
	float returned1 = area(3.0f,8.9f);//calling method with float value1, float value2
	System.out.println(returned1);
		
	float area1 = area(40, 4.7f);//calling method with int value1, float value2
	System.out.println(area1);
	
	double area2= area(64,(byte)21);	//calling method with int value1, double value2
	System.out.println(area2);	
		
    double area3= area((short)30, 60.2d);	 //calling method with double value1, int value2
	System.out.println(area3);	
		
	int bookNumber=bookNumber(23,6);// Method 2 calling method with int n1,int n2
	System.out.println(bookNumber);	
		
	int bookNumber1= bookNumber(34);  //calling method with int n1
	System.out.println(bookNumber1);	
		
	int bookNumber2 =bookNumber(3,6);    //calling method with int num1,int num2
	System.out.println(bookNumber2);
		
		
	float bookNumber3 =bookNumber(9,8.1f);   //calling method with int int num1,float num2
	System.out.println(bookNumber3);	
		
	double isPositive =bookNumber(9.96d,30);    //calling method with double s1, int s2
	System.out.println(isPositive);	
		
	double isPositive1 =bookNumber(45,3.67d);    //calling method with int s1, double s2
	System.out.println(isPositive1);	
		
	int multiplications=multiplication(40,53);  //Method 3 calling method with int sheet1,int sheet2
	System.out.println(multiplications);	
		
	int multiplications1 =multiplication(80);   //calling method with int sheet1
	System.out.println(multiplications1);	
		
	int scoreOfMatch= multiplication(47,27);  //calling method with int value1,int value2
	System.out.println(scoreOfMatch);	
		
	int scoreOfMatch1= multiplication(25,(short)50); //calling method with int value1,short value2
	System.out.println(scoreOfMatch1);	
		
	float cgpaOfStudent= multiplication(7.0f, 35);  //calling method with float cgpa1, int cgpa2
	System.out.println(cgpaOfStudent);	
		
	float cgpaOfStudent1= multiplication(10, 3.5f);	//calling method with int cgpa1,float cgpa2
	System.out.println(cgpaOfStudent1);
	}

	
// changingthe parameters
	public static int area(int value1){
	return value1*value1;
	}
	public static int area(int value1,int value2){
	return value1*value2;
}
// changing the data types
	public static float area(float value1, float value2){
		return value1;
	}
	public static float area(int value1, float value2){
		return value2;
	}
// changing order of parameters
	public static double area(int value1,double value2){
	return value2;	
	}
	public static double area(double value1,int value2){
		return value1;
	}
	
	
    public static int bookNumber(int n1,int n2){
	return n1+n2;
}
	public static int bookNumber(int n1){ 
	return n1+n1;
}
// changing the data types
   public static int bookNumber( int num1, int num2){
   return num1;
   }
	public static float bookNumber( int n1, float n2){
	return n2;
   }
// changing order of parameters
	public static double bookNumber(double s1 ,int s2){
	return s1;
	}
    public static double bookNumber(int s1 ,double s2){
	return s1;
	}

	
	
// changing the parameters
	public static int multiplication(int sheet1,int sheet2){
		return sheet1*sheet2;
	}
	public static int multiplication(int sheet1){
		return sheet1*sheet1;
	}
// changing the data types
	public static int multiplication(int value1,int value2){
	return value1;
	}
	public static int multiplication(int value1,short value2){
	return value2;
	}
// changing order of parameters
    public static float multiplications (float cgpa1, int cgpa2){	
	return cgpa1;
	}
	public static float multiplication(int cgpa1, float cgpa2){	
	return cgpa2;
	}
}