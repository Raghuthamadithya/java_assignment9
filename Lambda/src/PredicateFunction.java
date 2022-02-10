import java.util.function.Predicate;
public class PredicateFunction {
   // Predicate<Employee> bonusLambda =(emp)->emp.getRatings()>10?true:false;
    //Predicate<Employee> execLambda=emp -> emp.getId().startsWith("E99")?true:false;

    Predicate<String> empString=s -> s.isEmpty();

    public static void main(String[] args) {

    }
}
