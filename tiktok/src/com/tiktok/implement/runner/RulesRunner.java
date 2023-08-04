package com.tiktok.implement.runner;
import com.tiktok.inter.app.*;
import com.tiktok.inter.app.ArmyRule;
import com.tiktok.inter.app.SaloonRule;



public class RulesRunner {
	public static void main(String[] args) {

    System.out.println("AirPort Rule");
	HubliAirport hubliAirport = new HubliAirport();
	System.out.println("Airport Loction is :"+AirPortRule.LOCATION);
	hubliAirport.getPassPort();
	hubliAirport.getTicket();
	System.out.println("______________________________________________________________");
	System.out.println("**ArmyRule**");
	IndianArmy indianArmy = new IndianArmy();
	System.out.println("Worktime :"+indianArmy.WorkTime);
	indianArmy. getHairCut();
	indianArmy .getUniform();
	System.out.println("______________________________________________________________");

	System.out.println("**SaloonRule**");
	HairCutSaloon hairCutSaloon = new HairCutSaloon();
	hairCutSaloon.waitForYourTurn();
	hairCutSaloon.dontMove();
	System.out.println("Price is :"+hairCutSaloon.Cut);
	System.out.println("______________________________________________________________");

	System.out.println("**Hotel Rule**");
	RvHotel vegHotelRule = new RvHotel();
	System.out.println("Hotel Type is :"+vegHotelRule.HOTEL_TYPE);
	vegHotelRule.getParcel();
    vegHotelRule.payBill();
	System.out.println("______________________________________________________________");

	System.out.println("**Home Rule**");
	PatilHome myHomeRule = new PatilHome();
	System.out.println("Rule Maker is :"+PatilHome.RULE_MAKER);
	myHomeRule.getHomeBefore();
	myHomeRule.dontUseBadWords();
	System.out.println("______________________________________________________________");
	System.out.println("**Company Rule**");
	IbmCompany softwareCompanyRule = new IbmCompany();
	System.out.println("Work Start Time is :"+IbmCompany.WORK_START_TIME);
	softwareCompanyRule.getEmployeId();
	softwareCompanyRule.getFormal();
	System.out.println("______________________________________________________________");
	System.out.println("**VTU Rule**");
	BelagaviVtu collegeVTURule = new BelagaviVtu();
	System.out.println("University name :"+BelagaviVtu.UNIVERSITY_NAME);
	collegeVTURule.getExamFee();
	collegeVTURule.getPass();

	System.out.println("______________________________________________________________");
	System.out.println("**Bank Rule**");
	KvgBank sbiBankRule = new KvgBank();
	System.out.println("Bank Name :"+KvgBank.BANK_NAME);
	sbiBankRule.getPassbook();
	sbiBankRule.getWait();
	

System.out.println("______________________________________________________________");

System.out.println("**Metro Rules**");
BglrMetro bangloreMetroRule = new BglrMetro();
MetroRule.getStation();
bangloreMetroRule.getTicket();
bangloreMetroRule.getPlatform();
System.out.println("______________________________________________________________");


}
}