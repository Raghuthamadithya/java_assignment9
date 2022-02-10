public class FunctionalInterfaces {
    interface Multiplier
    {
        int multiply(int i,int j);
    }
    Multiplier multiplierLambda=(p,q)->p*q;

    public static void main(String[] args) {
        FunctionalInterfaces client=new FunctionalInterfaces();
    }
}
