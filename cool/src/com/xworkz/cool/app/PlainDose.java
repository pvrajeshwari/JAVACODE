package com.xworkz.cool.app;

public interface PlainDose extends MasalaDosa {
	public default void SadaDosa () {
		System.out.println("Invoking In PlainDosa");

		
	}
  @Override
  public default void HomeStyleDosa() {
		System.out.println("Invoking In MasalaDosa");

		

}
}
