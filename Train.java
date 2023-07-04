public class Train{
	String SeatColor;
	int price;
	int speed;
	int coachNo;
	String color;
	int noOfSeats;
	int noOfGears;
	int noOfDoors;
	String trainName;
	int noOfSleeperCoach;
	int size;
	int noOFEmergencyExit;
	int noOfLight;
	int noOfWindows;
	int noOfFans;
	int noOfTaps;
	int noOfChargingPOints;
	int engineCode;
	String seatColor;
	boolean isExpressTrain;
	

	
	public Train(String seatColor , int price , int speed, int coachNo,int noOfSeats,int size,int noOfFans, int noOfLight,int noOfTaps,int engineCode,String trainName)
		{
			this.seatColor = seatColor;
			this.price = price;
			this.speed = speed;
			this.coachNo = coachNo;
			this.noOfSeats =noOfSeats;
			this.size =size;
			this.noOfFans =noOfFans;
			this.noOfLight =noOfLight;
			this.noOfTaps =noOfTaps;
			this.engineCode =engineCode;
			this.trainName =trainName;

		}
		
		public static void openAWindow()
		{
		}
		
		public static void openDoor()
		{
		}
		
		public static void onFan()
		{
		}
		
		public static void onAC()
		{
		}
		
		public static void changegear()
		{
		}
		
		public static void emergencyExit()
		{
		}
		
		public static void acCoachIsClosed()
		{
		}
		
		public static void sleeperCoachIsThere()
		{
		}
		
		public static void acCoachIsThere()
		{
		}
		
		public static void moreSpaces()
		{
		}
		
		public static void main(String[] args)
		{
			Train train = new Train("blue" , 110 ,80,76546,500,50000 ,10000 , 500,680,9987,"bangaloreExpress");
			System.out.println(train);
			System.out.println(train.seatColor);
			System.out.println(train.speed);
			System.out.println(train.price);
			System.out.println(train.coachNo);
			System.out.println(train.size);
			System.out.println(train.noOfFans);
			System.out.println(train.noOfTaps);
			System.out.println(train.noOfSeats);
			System.out.println(train.noOfLight);
			System.out.println(train.engineCode);
			System.out.println(train.trainName);

		}
	
}

		
	



			
		
	
	
	
		
		
		

