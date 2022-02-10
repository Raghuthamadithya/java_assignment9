package ArraysAndArraylist;
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Amit");
        list.add("Akash");
        list.add("Abhilash");
        list.add("Anusha");
//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
        for(String name:list)
        {
            System.out.println(name);
        }
    }
}
