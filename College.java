public class College{
	final static int maxStudent = 1000;
	final static int minStudent =100;
	Department dept = Department.COMPUTER_SCIENCE;
    DegreeType deg = DegreeType.MASTER;
    

	public static void main(String[] args) {
   College college =new College();
   System.out.println(college.dept);
   System.out.println(college.deg);


   System.out.println("__________________________________");
   Result result = new Result();
   System.out.println(result.grade);
   System.out.println(result.dif);

   System.out.println("__________________________________");
   Duration duration = new Duration();
   System.out.println(duration.time);
   System.out.println(duration.durationty);
   System.out.println("__________________________________");
   Covid covid = new Covid();
   System.out.println(covid.test);
   System.out.println(covid.covidresult);
   System.out.println("__________________________________");
   Atm atm = new Atm();
   System.out.println(atm.machin);
   System.out.println(atm.atmty);



		
	}
	 public enum Department {
	 	COMPUTER_SCIENCE,
	 	BIOLOGY,
	 	BUSINESS,
	 	HISTORY

	 }
	 public enum DegreeType{
	 	MASTER,
	 	DOCTORATE
	 }
}

class Result{
	final static int maxMarks = 100;
    final static int minMarks = 35;
    GRADE grade = GRADE.C;
    DIFFICULTY dif = DIFFICULTY.HARD;



    public enum GRADE {
    A, B, C, D, F
    }

    public enum DIFFICULTY {
    EASY, MEDIUM, HARD
    }
  
        
}

class Duration{
	final static int hours=24;
	final static int minutes=60;
	TimeOfDay time = TimeOfDay.NIGHT;
	DurationType durationty = DurationType.MEDIUM;

	public enum TimeOfDay{
		MORNING,
		AFTERNOON,
		EVENING,
		NIGHT
	}
	public enum DurationType{
		SHORT,
		MEDIUM,
		LONG
	}
}

class Covid{
	final static int year =2020;
	final String country ="india";
	TestType test = TestType.PCR;
	CovidResult covidresult = CovidResult.POSITIVE;

	public enum TestType{
		PCR,
		ANTIBODY,
		ANTIGEN

	}
	public enum CovidResult{
		POSITIVE,
		NEVATIVE
	}
}

class Atm{
	final static int cardSize =5;
	final static int noPinDigits = 4;
	AtmMachine machin =AtmMachine.NCR;
	AtmTYPE atmty = AtmTYPE.CASH_WITHDRAWAL;
	public enum AtmMachine{
		DIEBOLD,
		NCR,
		TRITON
	}
	public enum AtmTYPE{
		CASH_WITHDRAWAL,
		BALANCE_INQUIRY
	}
}