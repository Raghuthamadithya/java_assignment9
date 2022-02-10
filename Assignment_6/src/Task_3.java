public class Task_3 {
    Task_3(String string)
    {
        System.out.println(string);
    }
    public static void main(String[] args)
    {
        //Task_3 object=new Task_3("hello");
        Task_3[] obj=new Task_3[2];
        obj[0]=new Task_3("hi");
        obj[1]=new Task_3("Hello");

    }

}
