public class FunctionalInterfaceAnnotation {
    interface Cruncher
    {
        int crunch(int i,int j);
    };
    public int cruncherService(int i,int j,Cruncher cruncher)
    {
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client=new FunctionalInterfaceAnnotation();

        //client1
        int ans=client.cruncherService(3,4,(p,q)->p*q);
        System.out.println(ans);
        //client2
         ans=client.cruncherService(3,4,(p,q)->p+q);
        System.out.println(ans);
        //client3
        ans=client.cruncherService(3,4,(p,q)->p-q);
        System.out.println(ans);
        //client4
        ans=client.cruncherService(20,4,(p,q)->p/q);
        System.out.println(ans);
    }
}
