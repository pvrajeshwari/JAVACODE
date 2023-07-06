public class Runner{
    
    public static void main(String[] args) {

        Telivision tv1 = new Telivision(2000, 42.4f, "LCD", "black", true, 33.5f, true,2022,true);
        System.out.println(tv1.modelYear);
        System.out.println(tv1.cost);
        System.out.println(tv1.size);
        System.out.println(tv1.display);
        System.out.println(tv1.isBluetooth);

        System.out.println(tv1.isWifi);
        System.out.println(tv1.isSmartTv);
        System.out.println(tv1.weight);
        System.out.println(tv1.color);
        Telivision tv2 =new Telivision(3000,54.3f,"LED","White",true,3.76f,false,2023,false);
        System.out.println(tv2.color);
        Telivision tv3 =new Telivision(3600,22.3f,"LED","red",true,5.5f,true,2023,false);
        System.out.println(tv3.isWifi);
        Telivision tv4 =new Telivision(5600,56.3f,"LED","White",false,5.6f,false,2023,false);
        System.out.println(tv4.size);
        Telivision tv5 =new Telivision(3000,54.3f,"LED","White",true,3.f,false,2023,true);
        System.out.println(tv5.isSmartTv);






        
    }
}

class Telivision{
        int cost;
       float size;
       String display;      
    static String brand;
       String color;
       boolean isSmartTv;
       float weight;
       boolean isBluetooth;
       int modelYear;
       boolean isWifi ;

    static{
        brand = "sony";
        System.out.println(brand);

    }
    public Telivision void run(){
        System.out.println("static method");
    }

    public Telivision(int cost, float size, String display, String color, boolean isSmartTv, float weight, boolean isBluetooth,int modelYear,boolean isWifi ){
        this.isSmartTv = isSmartTv;
        this.cost = cost;
        this.modelYear = modelYear;
        this.display = display;
        this.color = color;
        this.isBluetooth = isBluetooth;
        this.weight = weight;
        this.size = size;
        this.isWifi =isWifi;
    }
}