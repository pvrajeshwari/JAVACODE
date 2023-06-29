public class Chair{
		int salary;
		char grade;
		float sgpa;
		String studentName;
		int studentRollNo;

			public Chair()
			{
				System.out.println("default constructor");
				System.out.print(salary);
				System.out.println(grade);
				System.out.println(sgpa);
				System.out.println(studentName);
				System.out.println(studentRollNo);
				
			}
			public Chair(int salary1,char grade1,float sgpa1,String studentName1,int studentRollNo1)
			{
				System.out.println("parametrised constructor");
				salary = salary1;
				grade = grade1;
				sgpa = sgpa1;
				studentName = studentName1;
				studentRollNo = studentRollNo1;
			}
			public static void main(String[] args)
			{
				new Chair();
				System.out.println("---------------------------------------------------------");
				Chair chair = new Chair(3000,'b',7.71f,"Rajeshwari",29);
				System.out.println(chair.salary);
				System.out.println(chair.grade);
				System.out.println(chair.sgpa);
				System.out.println(chair.studentName);
				System.out.println(chair.studentRollNo);
				System.out.println("*********************************************************");
				new Chair();
				System.out.println("__________________________________________________________________");
				Chair chair1 = new Chair(1000,'A',6.7f,"Rani",39);
				System.out.println(chair1.salary);
				System.out.println(chair1.grade);
				System.out.println(chair1.sgpa);
				System.out.println(chair1.studentName);
				System.out.println(chair1.studentRollNo);




			}



			
		}






	
	

