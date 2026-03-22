import java.util.Scanner;

public class AgencyOfferings {

    Scanner Input = new Scanner(System.in);

    public void show(PARENTapplicant app) {

        System.out.println("===== AGENCY OFFERINGS =====");
        System.out.println("1. Resume & CV Writing ($50)");
        System.out.println("2. Interview Coaching ($60)");
        System.out.print("Choose a service (1-2): ");
        int serviceChoice = Input.nextInt();
        Input.nextLine();

        if(serviceChoice == 1) {
            app.agencyService = "Resume & CV Writing";
            app.agencyFee = 50;  
        } else if(serviceChoice == 2) {
            app.agencyService = "Interview Coaching";
            app.agencyFee = 60;
        }

        System.out.println("\nAvailable Days:");
        System.out.println("1. Monday");
        System.out.println("2. Wednesday");
        System.out.println("3. Friday");
        System.out.print("Choose a day (1-3): ");
        int dayChoice = Input.nextInt();
        Input.nextLine();

        if(dayChoice == 1) app.agencySchedule = "Monday";
        else if(dayChoice == 2) app.agencySchedule = "Wednesday";
        else if(dayChoice == 3) app.agencySchedule = "Friday";

        System.out.println("\n" + app.Name + " selected " + app.agencyService + " on " + app.agencySchedule 
                           + " | Fee: $" + app.agencyFee);
    }
}