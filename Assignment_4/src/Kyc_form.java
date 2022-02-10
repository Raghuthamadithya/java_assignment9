
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class MainClass
{

        public static void main(String[] args)
        {

                Kyc_form obj =new Kyc_form();
/*
                        Scanner input =new Scanner(System.in);
                        System.out.println("Enter the number of inputs: ");
                        int n=input.nextInt();
                        for(int i=0;i<n;i++)
                        {
                                String str=input.nextLine();
                                String str1=str.substring(0,str.indexOf(" "));
                                String str2=str.substring(str.indexOf("  ")+1);
                                obj.rangeKyc(str1,str2);
                        }
*/

                obj.printRange("16-07-1998","27-06-2017");
                obj.printRange("04-02-2016","04-04-2017");
                obj.printRange("04-05-2017","04-04-2017");
                obj.printRange("04-04-2015","04-04-2016");
                obj.printRange("04-04-2015","15-03-2016");
        }
}

class Kyc_form{

        Date signUpDate,currentDate;
        String stringBeginDate,stringEndDate;
        Date beginDate,endDate;
        public void printRange(String inputSignUpDate,String inputCurrentDate){
        try {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
                signUpDate = dateFormatter.parse(inputSignUpDate);
                currentDate = dateFormatter.parse(inputCurrentDate);

                if (signUpDate.after(currentDate)) {
                        System.out.println("No Range");
                } else {
                        beginDate = signUpDate;

                        beginDate.setYear(currentDate.getYear());

                        Calendar calendar = Calendar.getInstance();

                        calendar.setTime(beginDate);

                        calendar.add(Calendar.DATE, -30);
                        beginDate = calendar.getTime();
                        calendar.add(Calendar.DATE, 60);
                        endDate = calendar.getTime();

                        if (endDate.after(currentDate)) {
                                endDate = currentDate;
                        }

                        stringBeginDate = dateFormatter.format(beginDate);
                        stringEndDate = dateFormatter.format(endDate);

                        System.out.println(stringBeginDate+ " "+stringEndDate);
                }
        }
        catch(Exception e){
                System.out.println(e.getMessage());
        }
        }
}
