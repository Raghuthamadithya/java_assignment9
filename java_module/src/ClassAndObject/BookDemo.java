package ClassAndObject;

public class BookDemo {
    public static void main(String[] args) {
        Book b1=new Book("George Martin","Game of Thrones","Fantasy",864);

        Book b2=new Book("James Stewart","Calculus","Math",1392);

        Book b3=new Book("Joel Murach","Murach's java programming","Programming",800);

//        printBook(b1);
//        printBook(b2);
//        printBook(b3);
        b1.printBookDetails();
        b2.printBookDetails();
        b3.printBookDetails();

    }

//    public static void printBook(Book book)
//    {
//        System.out.println(book.getTitle());
//        System.out.println("by " +book.getAuthor());
//        System.out.println("has "+ book.getNumPages());
//        System.out.println("pages, and its genre is "+book.getGenre());
//
//        System.out.println();
//    }
}
