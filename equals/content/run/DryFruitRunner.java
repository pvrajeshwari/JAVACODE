package com.equals.content.run;
	import com.equals.content.app.DryFruit;

	public class DryFruitRunner {

		public static void main(String[] args) {

			System.out.println("Running main in DryFruit Runner\n");

			DryFruit dryFruit1 = new DryFruit("Almond", "DryFruit stores", "online", 200, 100, 25);
			DryFruit dryFruit2 = new DryFruit("Almond", "Dry stores", "online", 200, 100, 25);

			System.out.println("Object one:\n"+dryFruit1+"\n");
			System.out.println("* * * * * * * * * * * * * * * * * *\n");
			System.out.println("Object two:\n"+dryFruit2+"\n");

			boolean result = dryFruit1.equals(dryFruit2);
			System.out.println("The DryFruit being same is : " + result);
		}

	}


