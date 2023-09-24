package generic;

public class G_Demo {
    public static void main(String[] args) {
    	System.out.println("\nG_Interface.......................................................................\n");
        G_interface<String> stringProcessor = new StringProcessor();
        stringProcessor.processData("Hello, World!");

        G_interface<Integer> intProcessor = new IntegerProcessor();
        intProcessor.processData(42);
        
        System.out.println("\nG_Class.......................................................................\n");
        G_class<String> stOb=new G_class<String>();
        G_class<Integer> intOb=new G_class<Integer>();
        stOb.set("G_Class");
        intOb.set(100);
        System.out.println("String formate of the generic class is "+stOb.get());
        System.out.println("Integer formate of the generic class is "+intOb.get());
    }
}
