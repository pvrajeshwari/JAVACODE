package com.xworkz.cool.app;

public class CheeseDosa implements PlainDose,SetDosa{
	  @Override
		public void HomeStyleDosa() {
			 System.out.println("Invoking MasalaDosa in Cheese");
		}
		 @Override
		public void SadaDosa() {
			System.out.println("Invoking PlainDosa in Cheese");
		}
		 @Override
		public void SoftDosa() {
			 System.out.println("Invoking SetDosa in Cheese");
		}
		
	}
