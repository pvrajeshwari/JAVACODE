package com.equals.content.app;

public class Assets {

		private String holderName;
		private String type;
		private String value;
		public Assets(String holderName, String type, String value) {
			super();
			this.holderName = holderName;
			this.type = type;
			this.value = value;
		}
		public String getHolderName() {
			return holderName;
		}
		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Assets [holderName=" + holderName + ", type=" + type + ", value=" + value + "]";
		}
		@Override
		public boolean equals(Object obj) {

			if(obj!= null) {
				System.out.println("Object not null checked");
				if(obj instanceof Assets) {
					System.out.println("Object type matched");
					Assets casted = (Assets)obj;
					if(this.holderName == casted.holderName && this.type == casted.type&& this.value== casted.value) {
						System.out.println("Both objects are same");
						return true;
					}
					else {
						System.err.println("Both objects are not same");
					}
				}
				else {
					System.err.println("Objects type mis-matched");
				}
			}
			else {

				System.err.println("Object is null cant compare");

			}
				return false;
		}
	}



