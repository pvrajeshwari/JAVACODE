package com.sharemarket1.marketrunner;
	import com.sharemarket1.market.base.SuperMarket;
	import com.sharemarket1.market.online.OnlineMarket;
	public class MarketRunner {

		public static void main(String[] args) {
			SuperMarket sMarket = new SuperMarket();
			sMarket.sell(); 
			OnlineMarket online = new OnlineMarket();
			online.buy();
		}

	}


