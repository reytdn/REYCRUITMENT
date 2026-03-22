import java.util.ArrayList;
import java.util.Scanner;

public class MAINrecruitmentsystem {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        FIRSTlogin login = new FIRSTlogin();

        if(!login.login()) return;

        ArrayList<PARENTapplicant> applicants = new ArrayList<>();
        ArrayList<Integer> applicantScores = new ArrayList<>();

        while(true){

            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Add Applicant");
            System.out.println("2. Remove Applicant");
            System.out.println("3. Show Applicant by ID");
            System.out.println("4. Confirm for Interview");
            System.out.println("5. Deploy Applicant");
            System.out.println("6. Agency Offerings");
            System.out.println("7. Exit");

            System.out.println();
            System.out.print("Enter Choice: ");
            int choice = Input.nextInt();
            Input.nextLine();
            System.out.println();

            if(choice == 1){

                System.out.print("Full Name: ");
                String Name = Input.nextLine();

                System.out.print("Age: ");
                int Age = Input.nextInt();
                Input.nextLine();

                if(Age < 18){
                    System.out.println("===== SORRY YOU ARE BELOW 18 =====");
                    continue;
                }

                System.out.print("Email: ");
                String Email = Input.nextLine();

                System.out.print("Phone Number: ");
                String PhoneNumber = Input.nextLine();

                System.out.println("Educational Attainment Options:");
                System.out.println("1. College Graduate");
                System.out.println("2. College Undergraduate");
                System.out.println("3. Senior High School Graduate");
                System.out.println("4. Junior High School Graduate");
                System.out.println("5. Elementary School Graduate");
                System.out.print("Enter Choice (1-5): ");
                int eduChoice = Input.nextInt();
                Input.nextLine();

                String EducationalAttainment = "";
                if(eduChoice == 1) EducationalAttainment = "College Graduate";
                else if(eduChoice == 2) EducationalAttainment = "College Undergraduate";
                else if(eduChoice == 3) EducationalAttainment = "Senior High School Graduate";
                else if(eduChoice == 4) EducationalAttainment = "Junior High School Graduate";
                else if(eduChoice == 5) EducationalAttainment = "Elementary School Graduate";
                else {
                    System.out.println("Invalid choice, defaulting to Elementary School Graduate");
                    EducationalAttainment = "Elementary School Graduate";
                }

                System.out.print("Birth Certificate (yes/no): ");
                boolean Birth = Input.nextLine().equalsIgnoreCase("yes");

                System.out.print("Valid ID (yes/no): ");
                boolean ID = Input.nextLine().equalsIgnoreCase("yes");

                String IDType = "";
                String IDNumber = "";
                if(ID){
                    System.out.print("Enter Type of ID: ");
                    IDType = Input.nextLine();

                    System.out.print("Enter Number of ID: ");
                    IDNumber = Input.nextLine();
                }

                System.out.print("Good Medical Record (yes/no): ");
                boolean Medical = Input.nextLine().equalsIgnoreCase("yes");

                System.out.print("NBI Clearance (yes/no): ");
                boolean NBI = Input.nextLine().equalsIgnoreCase("yes");

                System.out.print("Number of Companies Worked: ");
                int Companies = Input.nextInt();
                Input.nextLine();

                String[] NamesCompany = new String[Companies];
                int[] WorkedMonths = new int[Companies];
                int HMWorkedMonths = 0;

                for(int i = 0; i < Companies; i++){
                    System.out.print("Enter Name of Company " + (i+1) + ": ");
                    NamesCompany[i] = Input.nextLine();

                    System.out.print("Enter Months Worked at " + NamesCompany[i] + ": ");
                    WorkedMonths[i] = Input.nextInt();
                    Input.nextLine();

                    HMWorkedMonths += WorkedMonths[i];
                }

                PARENTapplicant applicant = new PARENTapplicant(
                    Name, Age, Email, PhoneNumber, EducationalAttainment,
                    Birth, ID, IDNumber, IDType, Medical, NBI,
                    Companies, Companies > 0 ? NamesCompany[Companies-1] : "", HMWorkedMonths
                );

                applicants.add(applicant);
                applicantScores.add(0);

                System.out.println("Applicant Saved! ID: " + (applicants.size() - 1));
            }

            else if(choice == 2){
                System.out.print("Enter ID: ");
                int id = Input.nextInt();

                if(id >= 0 && id < applicants.size()){
                    applicants.remove(id);
                    applicantScores.remove(id);
                    System.out.println("Removed.");
                } else {
                    System.out.println("Invalid ID.");
                }
            }

            else if(choice == 3){
                System.out.print("Enter ID: ");
                int id = Input.nextInt();

                if(id >= 0 && id < applicants.size()){
                    PARENTapplicant app = applicants.get(id);

                    System.out.println("Name: " + app.Name);
                    System.out.println("Age: " + app.Age);
                    System.out.println("Email: " + app.Email);
                } else {
                    System.out.println("Invalid ID.");
                }
            }

            else if(choice == 4){
                System.out.print("Enter ID: ");
                int id = Input.nextInt();

                if(id >= 0 && id < applicants.size()){

                    PARENTapplicant app = applicants.get(id);

                    THIRDverifyexperience exp = new THIRDverifyexperience(app);
                    int total = exp.pointsEXP();

                    FOURTHinterviewprocess interview = new FOURTHinterviewprocess();
                    total += interview.interviewpoint();

                    applicantScores.set(id, total);

                    System.out.println("Interview Done. Score: " + total);
                } else {
                    System.out.println("Invalid ID.");
                }
            }

            else if(choice == 5){
                System.out.print("Enter ID: ");
                int id = Input.nextInt();

                if(id >= 0 && id < applicants.size()){

                    int total = applicantScores.get(id);
                    PARENTapplicant app = applicants.get(id);

                    if(total >= 24){

                        System.out.println("ALLOWED FOR DEPLOYMENT");

                        SelectJOB job = new SelectJOB(app);
                        job.selectJob();

                        ApplicantInfo info = new ApplicantInfo();
                        info.showInfo(app, job);

                    } else {
                        System.out.println("NOT ALLOWED FOR DEPLOYMENT");
                    }

                } else {
                    System.out.println("Invalid ID.");
                }
            }


            else if(choice == 6){
                System.out.print("Enter Applicant ID for Agency Offerings: ");
                int id = Input.nextInt();
                Input.nextLine();

                if(id >= 0 && id < applicants.size()){
                    PARENTapplicant app = applicants.get(id);
                    AgencyOfferings agency = new AgencyOfferings();
                    agency.show(app);  
                } else {
                    System.out.println("Invalid ID.");
                }
            }


            else if(choice == 7){
                break;
            }
        }
    }
}