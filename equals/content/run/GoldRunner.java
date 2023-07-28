package com.equals.content.run;
import com.equals.content.app.*;
	public class GoldRunner {

		public static void main(String[] args) {
			System.out.println("Running main in Gold Runner\n");

			Gold gold1 = new Gold("Kalyan Jewellers", "Kalyan Group", 24.2, 100000);
			Gold gold2 = new Gold("Kalyan Jewellers", "Kalyan Group", 22.2, 100000);

			System.out.println("Object one:\n"+gold1+"\n");
			System.out.println("* * * * * * * * * * * * * * *");
			System.out.println("Object two:\n"+gold2+"\n");

			boolean result = gold1.equals(gold2);
			System.out.println("Both the Gold objects being same is : " + result);

		}
	}