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
		System.out.println(bike.getprice());
		System.out.println(bike.getcolor());
		System.out.println(bike.getisAvailable());

		System.out.println(bike.brand.getvalue());
	    System.out.println(bike.tire.getvalue1());



		
	}
	public float getprice(){
		return price;
	} 
	public String getcolor(){
		return color;
	}
	public boolean getisAvailable(){
		return isAvailable;
	}
}
enum BikeBrand{
	TREK ("trek"),SPECIALIZED("specialized"),GIANT("giant");
	String value;
	BikeBrand(String value){
		this.value = value;
	}
	public String getvalue(){
		return value;
	}
}
	enum NoTire{
		TWO(2),FOUR(4);
		int value1;
		NoTire(int value1){
			this.value1 = value1;
		}
		public int getvalue1(){
			return value1;
		}
	}

	
