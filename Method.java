public class Method{
	public static void main(String[] args){
		studentName();
		atm();
		roomNumber();
		grade();
		nameMethod();

	}
	
	public static void studentName()
	{
		String[] nameOfStudents = { "rani", "madhu" , "varun" , "yash" , "anjali"};
		for(int i=0;i<=nameOfStudents.length-1;i++)
		{
			System.out.println(nameOfStudents[i]);
		}
		
	}
	
	public static void atm()
	{
		long[] atmNumber = new long[5];
		atmNumber[0] = 981553968342l;
		atmNumber[1] = 484311864775l;
		atmNumber[2] = 766366221639l;
		atmNumber[3] = 679164127402l;
		atmNumber[4] = 835745678876l;
		for(int i = 0; i<=atmNumber.length-1;i++)
		{
			System.out.println(atmNumber[i]);
		}
	}
	public static void roomNumber()
	{
		int[] noRoom = { 101, 201 , 301, 401, 501};
		for(int i=0;i<=noRoom.length-1;i++)
		{
			System.out.println(noRoom[i]);
		}
		
	}
	
	
	
	public static void grade()
	{
		char[] gradeOfStudents = new char[5];
		{
			gradeOfStudents[0] = 'A';
			gradeOfStudents[1] = 'B';
			gradeOfStudents[2] = 'C';
			gradeOfStudents[3] = 'D';
			gradeOfStudents[4] = 'E';
			for(int i = 0;i<=gradeOfStudents.length-1;i++)
			{
				System.out.println(gradeOfStudents[i]);
			}
		}
	}
	
	public static void nameMethod()
	{
		boolean[] isStudent = {true , false , true , true , false};
		for(int i =0; i<=isStudent.length-1;i++)
		{
			System.out.println(isStudent[i]);
		}
	}
	
	
	
			
	
}
	
					
					
			
		
		
		