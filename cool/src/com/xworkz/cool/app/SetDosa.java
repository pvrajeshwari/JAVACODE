package com.xworkz.cool.app;

public interface SetDosa extends PlainDose {
	public default void SoftDosa () {
		System.out.println("Invoking In SetDosa");

}
	@Override
	  public default void HomeStyleDosa() {
			System.out.println("Invoking In MasalaDosa");

			
}
}
