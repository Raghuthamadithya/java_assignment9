import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Stats {
    IntStream streamOfInts = IntStream.range(1,100);

    private void range()
    {
        IntStream ints=IntStream.rangeClosed(1,20);
        ints.forEach(System.out::println);
    }
    private void testMaxAndMin()
    {
        IntStream ints=IntStream.rangeClosed(1,20);
        OptionalInt max=ints.max();
        System.out.println("Max: "+max.getAsInt());

        ints=IntStream.rangeClosed(1,20);
        OptionalInt min=ints.max();
        System.out.println("Min: "+min.getAsInt());

        ints=IntStream.rangeClosed(1,20);
        OptionalDouble average=ints.average();
        System.out.println("Average: "+average.getAsDouble());

    }

    public static void main(String[] args) {
        new Stats().range();
        new Stats().testMaxAndMin();
    }
}
