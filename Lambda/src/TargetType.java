public class TargetType {

    // i ->i*i;
    public interface Email
    {
        String ConstructEmail(String name);
    }
    Email email=(String name)->name + "@gmail.com";

    public String getEmail(String name,Email email)
    {
        return null;
    }
    public static void main(String[] args) {
        new TargetType().getEmail("Adithya",(String name)->name +"@gmail.com");
    }
}
