package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.*;

public class Runner {
		public static void main(String[] args) {
			System.out.println("Running main in Elevator Runner");
			Elevator elevator = new Kone();
			Jaya jaya = new Jaya(elevator);
			jaya.getHighWeight();
			
			System.out.println("__________________________________________________");
			System.out.println("Runnin main in Kidney Runner\n");
			Kidney kid = new Careful();
			Vikram vk = new Vikram(kid);
			vk.check();
			
			System.out.println("__________________________________________________");
			System.out.println("Running main in Laptop Runner\n");
			Laptop laptop =  new MSI();	
		    MadhuLaptop md =  new MadhuLaptop(laptop);
			md.getPlay();
			
			System.out.println("__________________________________________________");
			System.out.println("Running main in Printing machine runner\n");
			PrintingMachine machine = new CanonPrintingMachine();
			Rajeshwari rv = new Rajeshwari(machine);
		    rv.getprint();
		    
			System.out.println("__________________________________________________");
			System.out.println("Running main in Smart watch Runner\n");
			SmartWatch smartWatch = new AppleWatch();
			VarunWatch varun = new VarunWatch(smartWatch);
			varun.getMusic();
			
			System.out.println("__________________________________________________");

			System.out.println("Running main in Washing machine runner\n");
			WashingMachine ma = new Bosch();
			 Pooja  pk = new Pooja(ma);
			 pk.getDry();
			 
			System.out.println("__________________________________________________");
			System.out.println("Running main in Water Purifier Runner\n");
			WaterPurifier purifier = new Coway();
			Anjali as = new Anjali(purifier);
			as.getPurify();


		}

		
		}

		
	


