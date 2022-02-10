import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m-> System.out.println("Printing out movie info:" +m);

//    private void testConsumer(Movie movie)
//    {
//        printInfo.accept(movie);
//    }
//    private void testConsumer(Movie movie)
//    {
//        printInfo.accept(movie);
//        persistMovie.accept(movie);
//    }
    private void persist(Movie m)
    {
        System.out.println("Persisting movie"+m);
    }

    public static void main(String[] args) {
        //Movie movie= new Movie("Gods Must Be Crazy") ;
        //new ConsumerFunctionalInterface().testConsumer(movie);
    }
}
