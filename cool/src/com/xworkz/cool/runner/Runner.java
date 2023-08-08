package com.xworkz.cool.runner;
import com.xworkz.cool.app.BTMCoolDrink;
import com.xworkz.cool.app.PepsiCoolDrink;
import com.xworkz.cool.app.CokeCoolDrink;
import com.xworkz.cool.app.CoolDrink;
import com.xworkz.cool.app.CheeseDosa;
import com.xworkz.cool.app.MasalaDosa;
import com.xworkz.cool.app.PlainDose;
import com.xworkz.cool.app.SetDosa;
import com.xworkz.cool.app.*;


public class Runner {
	public static void main(String[] args) {

		BTMCoolDrink btmCoolDrink = new BTMCoolDrink();
		btmCoolDrink.energy();
		btmCoolDrink.stamina();
		btmCoolDrink.cool();
		
		PepsiCoolDrink  ps = new BTMCoolDrink();
		ps.cool();
		ps.energy();
		
		CokeCoolDrink cd = new BTMCoolDrink();
		cd.cool();
		cd.stamina();
		
		CoolDrink cool = new BTMCoolDrink();
		cool.cool();
		
		System.out.println("________________________________________");
		CheeseDosa cheeseDosa = new CheeseDosa();
		cheeseDosa.HomeStyleDosa();
		cheeseDosa.SadaDosa();
		cheeseDosa.SoftDosa();
		
		PlainDose pd =new CheeseDosa();
		pd.HomeStyleDosa();
		pd.SadaDosa();
		SetDosa sd = new CheeseDosa();
		sd.HomeStyleDosa();
		sd.SoftDosa();
		MasalaDosa md = new CheeseDosa();
		md.HomeStyleDosa();
		
		System.out.println("________________________________________");
		Laptop laptop = new Laptop();
		laptop.Expensive();
		laptop.Durable();
		laptop.GamingLAptop();
		
		DellLaptop dell = new Laptop();
		dell.Expensive();
		dell.Durable();
		AsusLaptop asus = new Laptop();
		asus.Expensive();
		asus.GamingLAptop();
		HpLaptop hp =new Laptop();
		hp.Expensive();

		
		
	}
}
