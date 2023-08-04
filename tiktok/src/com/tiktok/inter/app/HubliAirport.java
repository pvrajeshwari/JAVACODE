package com.tiktok.inter.app;

	public class HubliAirport implements AirPortRule{

		@Override
		public void getTicket() {
			System.out.println("Ticket should be booked");
		}

		@Override
		public void getPassPort() {
			System.out.println("PassPort Should be Taken");
		}


		
}
