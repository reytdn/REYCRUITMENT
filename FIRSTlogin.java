import java.util.Scanner;

public class FIRSTlogin {
    
    Scanner Input = new Scanner(System.in);

    String Username = "ReyLenin7788";
    String Password = "P@ssw0rd0_123!";

    public boolean login(){
        int attempts = 4;
        
        while (attempts > 0){

            System.out.println();
            System.out.println();
            System.out.println("==================================");
            System.out.println("WELCOME TO REYCRUITMENT SOLUTIONS!");
            System.out.println("==================================");
            System.out.println();

            System.out.print("Enter Username: ");
            String username = Input.nextLine();

            System.out.println();

            System.out.print("Enter Password: ");
            String password = Input.nextLine();

            if (username.equals(Username) && password.equals(Password)){
                System.out.println();
                System.out.println("LOGGED-IN SUCCESS!");
                return true;

            }else if (!username.equals(Username) && password.equals(Password)){
                System.out.println();
                System.out.println("INVALID USERNAME, PLEASE TRY AGAIN!");
                attempts = attempts - 1;
                System.out.println("Remaining Attempts: " + attempts);

            }else if (username.equals(Username) && !password.equals(Password)){
                System.out.println();
                System.out.println("INVALID PASSWORD, PLEASE TRY AGAIN!");
                attempts = attempts - 1;
                System.out.println("Remaining Attempts: " + attempts);
            }else if (!username.equals(Username) && !password.equals(Password)){
                System.out.println();
                System.out.println("INVALID LOGIN DETAILS, PLEASE TRY AGAIN!");
                attempts = attempts - 1;
                System.out.println("Remaining Attempts: " + attempts);
            }
        }
        System.out.println();
        System.out.println("----ATTEMPT LIMITS HAS BEEN REACHED----");
        System.out.println("-------------EXITING SYSTEM-------------");
        System.out.println();
        System.out.println();
        return false;
    }
}
