import java.util.Scanner;

public class AgencyOfferings {

    Scanner Input = new Scanner(System.in);

    public void show(PARENTapplicant app) {
        System.out.println();
        System.out.println("===== AGENCY OFFERINGS =====");
        System.out.println("1. Resume & CV Writing = $50");
        System.out.println("2. Interview Coaching = $60");
        System.out.println("3. Language Training = $70");
        System.out.println();
        System.out.print("Choose a service (1-3): ");
        int serviceChoice = Input.nextInt();
        Input.nextLine();

        if(serviceChoice == 1) {
            app.agencyService = "Resume & CV Writing";
            app.agencyFee = 50;  
        } else if(serviceChoice == 2) {
            app.agencyService = "Interview Coaching";
            app.agencyFee = 60;
        } else if (serviceChoice == 3){
            app.agencyService = "Language Training";
            app.agencyFee = 70;
        }

        System.out.println("Available Days:");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        System.out.println();
        System.out.print("Choose a day (1-7): ");
        int dayChoice = Input.nextInt();
        Input.nextLine();

        if(dayChoice == 1) {
            app.agencySchedule = "Monday";
        } else if(dayChoice == 2) {
            app.agencySchedule = "Tuesday";
        } else if(dayChoice == 3) {
            app.agencySchedule = "Wednesday";
        } else if(dayChoice == 4) {
            app.agencySchedule = "Thursday";
        } else if(dayChoice == 5) {
            app.agencySchedule = "Friday";
        } else if(dayChoice == 6) {
            app.agencySchedule = "Saturday";
        } else if(dayChoice == 7) {
            app.agencySchedule = "Sunday";
        } else {
            app.agencySchedule = "Not Selected"; 
        }
    }
}