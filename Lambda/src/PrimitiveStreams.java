import java.util.stream.IntStream;

public class PrimitiveStreams {
    private void intStream()
    {
        int[] ints =new int[]{2,4,6,8,10};
        IntStream intStream=IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream2=IntStream.of(2,4,6,8,10);
        intStream2.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new PrimitiveStreams().intStream();
    }
}
