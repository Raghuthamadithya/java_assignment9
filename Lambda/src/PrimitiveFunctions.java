import java.util.function.IntPredicate;

public class PrimitiveFunctions {
    Predicate<Integer> evenNumberPredicate = x-> x%2 ==0;

    IntPredicate evenNumberPredicate2 = x -> x%2 ==0;

    private void testPredicate(int i)
    {
        System.out.println("Even number? "+evenNumberPredicate2.test(i));
    }

    public static void main(String[] args) {
        int evenNum=20;
        new PrimitiveFunctions().testPredicate(evenNum);
    }
}
