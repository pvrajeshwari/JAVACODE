 public class Laptop{
    final static String shape = "Rectangle";
    final static String camera = "center";
    ProcessorType processor;
    String name;
    int price =500000;


   



    public static void main(String[] args) {
        
    
        Laptop laptop = new Laptop();

        laptop.name = "hp";
        System.out.println(laptop.name);
        System.out.println(laptop.price);
        System.out.println(Laptop.shape);
        laptop.processor =ProcessorType.INTEL;
        System.out.println(laptop.processor);
        String result1 = "intel";
        boolean finalResult = result1.equals(laptop.processor.getVlaue());
        System.out.println(finalResult);
        System.out.println("____________________________________");

        Notebook notebook = new Notebook();
        notebook.cost = 30;
        System.out.println(notebook.cost);
        System.out.println(notebook.cover);
        System.out.println(Notebook.noOfEdges);
     String result2 = "soft_tshh";
     boolean finalvalue = result2.equals(notebook.cover.getVlaue());
     System.out.println(finalvalue);
    }
    


    public enum ProcessorType {
        INTEL("intel"), AMD("amd");
        String result;

         ProcessorType(String result){
        this.result = result;

    }
    public String getVlaue(){

        return this.result;
    }
    }    
}
class Notebook{
    final static int noOfEdges = 4;
    final static String usedFor= "Writing";
    String  bookName = "raj";
    int cost;
    CoverType cover = CoverType.SOFT_COVER;

    



    public enum CoverType {
        HARD_COVER("hard_cover"), SOFT_COVER("soft_cover"), SPIRAL("spiral");
        String value;
    


    CoverType(String value){
        this.value = value;

    }
    public String getVlaue(){

        return this.value;
    }
}
}