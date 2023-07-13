public class Bike{
	 BikeBrand brand = BikeBrand.TREK;
	 NoTire tire = NoTire.FOUR;
	float price;
	String color;
	boolean isAvailable;
	public Bike(float price,String color,boolean isAvailable){
	this.price = price;
	this.color = color;
	this.isAvailable = isAvailable;}

	public static void main(String[] args) {
		Bike bike =new Bike(39976.56F,"red",true);
		System.out.println(bike.getPrice());
		System.out.println(bike.getColor());
		System.out.println(bike.getIsAvailable());

		System.out.println(bike.brand.getValue());
	    System.out.println(bike.tire.getValue1());



		
	}
	public float getPrice(){
		return price;
	} 
	public String getColor(){
		return color;
	}
	public boolean getIsAvailable(){
		return isAvailable;
	}
}
enum BikeBrand{
	TREK ("trek"),SPECIALIZED("specialized"),GIANT("giant");
	String value;
	BikeBrand(String value){
		this.value = value;
	}
	public String getValue(){
		return value;
	}
}
	enum NoTire{
		TWO(2),FOUR(4);
		int value1;
		NoTire(int value1){
			this.value1 = value1;
		}
		public int getValue1(){
			return value1;
		}
	}

	
