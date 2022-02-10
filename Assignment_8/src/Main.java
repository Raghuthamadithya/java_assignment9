class invalidusername extends Exception {
    public invalidusername(String str) {
        super(str);
    }
}

class invalidpassword extends Exception
{
    public invalidpassword(String str)
    {
        super(str);
    }
}
class invalidage extends Exception
{
    public invalidage(String str)
    {
        super(str);
    }
}
class check extends Exception
{
    public void validate(String username,String password,int age)throws invalidusername,invalidpassword,invalidage
    {
        if(username.length()<12)
        {
            throw new invalidusername("Username should be morethan 12 characters");
        }
        if(password.length()<8)
        {
            throw new invalidpassword("Password should be atleast 8 Characters");
        }
        if(age<18)
        {
            throw new invalidage("Your age should be more tham 18");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
//            check obj1=null;
//            obj1.validate("hello","hi",13);
            check obj = new check();
            obj.validate("abcdefghijkl", "password", 12);
        } catch (invalidusername | invalidpassword | invalidage | NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("This is finally block");
        }
    }
}
