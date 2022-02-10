package ClassAndObject;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse=new House();
        House yourHouse=new House();
        myHouse.setNumStories((2));
        myHouse.setNumWindows(6);
        myHouse.setColor(("Red"));

        yourHouse.setNumStories((3));
        yourHouse.setNumWindows(10);
        yourHouse.setColor(("Blue"));

        printHouseData(myHouse);
        printHouseData(yourHouse);


        //System.out.println("My house is " +myHouse.getColor() +" and has "+myHouse.getNumStories() + " stories and "+ myHouse.getNumWindows()+" windows");
        //System.out.println("Your house is " +yourHouse.getColor() +" and has "+yourHouse.getNumStories() + " stories and "+ yourHouse.getNumWindows()+" windows");
    }
    public static void printHouseData(House obj)
    {
        System.out.println("My house is " +obj.getColor() +" and has "+obj.getNumStories() + " stories and "+ obj.getNumWindows()+" windows");
    }

}
