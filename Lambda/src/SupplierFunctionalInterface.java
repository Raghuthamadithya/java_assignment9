import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    Supplier<String[]> fruitSupplier =()-> new String[]{ "Apple"," Orange"};
    private void testSupplier()
    {
        String[] fruits = fruitSupplier.get();
        for(String fruit:fruits)
        {
            System.out.println("Fruit is:"+fruit);
        }
    }


    public static void main(String[] args) {
        new SupplierFunctionalInterface().testSupplier();
    }
}
