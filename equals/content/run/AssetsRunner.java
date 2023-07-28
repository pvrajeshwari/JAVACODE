package com.equals.content.run;
import com.equals.content.app.*;

public class AssetsRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Assets Runner\n");

		Assets assets1 = new Assets("RAj", "Land", "30L");
		Assets assets2 = new Assets("RAni", "Land", "20L");

		System.out.println("Object one:\n"+assets1+"\n");
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println("Object two:\n"+assets2+"\n");

		boolean result = assets1.equals(assets2);
		System.out.println("The assets being same is : " + result);


	}

}