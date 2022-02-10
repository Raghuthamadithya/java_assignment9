interface Employee
{
    Employee find(int id);
    default boolean isExec(int id)
    {
        return true;
    }
    //static method
    static String getDefaultCountry()
    {
        return "India";
    }
}
public class DefaultStaticMethods {
    public static void main(String[] args) {
        class Employeeimpl implements Employee
        {

            @Override
            public Employee find(int id) {
                boolean executive =isExec(id);
                return null;
            }
        }
        Employeeimpl impl=new Employeeimpl();
        impl.isExec(1234);

        String defaultCountry =Employee.getDefaultCountry();
    }
}
