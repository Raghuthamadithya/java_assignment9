public class CreatingLambda {
    interface Greeting
    {
        public String sayHello(String g);
    }
    public void testGreeting(String a,Greeting g)
    {
        String result=g.sayHello(a);

        System.out.println("Result:"+result);
    }

    public static void main(String[] args) {

        new CreatingLambda().testGreeting("Harry",(String s)-> "Hello,"+s );

        new CreatingLambda().testGreeting("Miss Madhu",(String s)-> "Hello,"+s );

        new CreatingLambda().testGreeting("",(String p)->!p.isEmpty()?"Howdy,"+p : "Did you miss something?");
    }

}
