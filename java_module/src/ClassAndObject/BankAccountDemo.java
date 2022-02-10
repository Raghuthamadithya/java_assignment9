package ClassAndObject;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount ba1=new BankAccount("John Baugh",5000);
        BankAccount ba2=new BankAccount("Bob");

        ba2.deposit(500);
        System.out.println("owner :" +ba2.getOwner());
        System.out.println("Balance " + ba2.getBalance());

        ba2.withdraw(1000);
        System.out.println("owner :" +ba2.getOwner());
        System.out.println("Balance " + ba2.getBalance());
        System.out.println();

        System.out.println(ba1.getOwner());
        System.out.println(ba1.getBalance());
        System.out.println();

        System.out.println("Deposit 1000?");
        ba1.deposit(1000);
        System.out.println(ba1.getOwner());
        System.out.println(ba1.getBalance());

    }
}
