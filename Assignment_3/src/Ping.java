import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ping {
    public static void main(String[] args) {

        String ipAddress;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ipAddress =input.nextLine();
        pingCommand("ping " + ipAddress);

    }
    public static void pingCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String str = "";
            // reading output stream of the command
            while ((str = inputStream.readLine()) != null) {
                System.out.println(str);
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
