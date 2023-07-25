package com.sharemarket1.village.outer;

	import com.sharemarket1.village.inner.OldVillage;
	public class RunnerVillage {

		public static void main(String[] args) {
			OldVillage oldVillage = new OldVillage();
			oldVillage.enter();
			oldVillage.exit();
			
			NewVillage newVillage = new NewVillage();
			newVillage.enter();
			newVillage.exit();	
		}
	}


