import java.util.Scanner;

public class SelectJOB extends PARENTapplicant {

    Scanner Input = new Scanner(System.in);
    public String chosenIndustry = "";
    public String chosenCompany = "";
    public String chosenJob = "";
    public double jobSalary = 0.0;

    public SelectJOB(PARENTapplicant app) {
        super(app.Name, app.Age, app.Email, app.PhoneNumber, app.EducationalAttainment,
            app.HaveBirthCertificate, app.HaveID, app.IDNumber, app.IDType,
            app.HaveMedicalRecord, app.HaveNBIClearance,
            app.HMWorkedCompanies, app.CompanyName, app.HMWorkedMonths);
    }

    public void selectJob() {
        System.out.println();
        System.out.println("===== MAIN MENU =====");
        System.out.println("1. Lodging Industry");
        System.out.println("2. Food Industry");
        System.out.println("3. Healthcare Industry");
        System.out.println();
        System.out.print("Choose Industry (1-3): ");
        int industryChoice = Input.nextInt();
        Input.nextLine();

        boolean isGraduate = EducationalAttainment.equalsIgnoreCase("College Graduate");

        if(industryChoice == 1){
            chosenIndustry = "Lodging Industry";

            System.out.println();
            System.out.println();
            System.out.println("LODGING INDUSTRY COMPANIES:");
            System.out.println("1. Marriott International - United States");
            System.out.println("2. OYO Rooms - India");
            System.out.println("3. Accor - France");
            System.out.println("4. IHG Hotels & Resorts - United Kingdom");
            System.out.println("5. H World Group Limited - China");
            System.out.println();
            System.out.print("Choose Company (1-5): ");
            int companyChoice = Input.nextInt();
            Input.nextLine();

            if(companyChoice == 1) chosenCompany = "Marriott International - United States";
            else if(companyChoice == 2) chosenCompany = "OYO Rooms - India";
            else if(companyChoice == 3) chosenCompany = "Accor - France";
            else if(companyChoice == 4) chosenCompany = "IHG Hotels & Resorts - United Kingdom";
            else if(companyChoice == 5) chosenCompany = "H World Group Limited - China"; 

            System.out.println();
            System.out.println();
            System.out.println("AVAILABLE JOBS:");

            if(isGraduate){ 
                System.out.println("1. Hotel Manager = $1,550");
                System.out.println("2. Front Desk Receptionist = $697");
                System.out.println("3. Housekeeper = $650");
                System.out.println("4. Maintenance Technician = $900");
                System.out.println("5. Security Officer = $750");
            } else { 
                System.out.println("1. Housekeeper = $650");
                System.out.println("2. Security Officer = $750");
            }

            System.out.println();
            System.out.print("Choose Job: ");
            int jobChoice = Input.nextInt();
            Input.nextLine();

            if(isGraduate){
                if(jobChoice == 1){ chosenJob = "Hotel Manager"; jobSalary = 1550; }
                else if(jobChoice == 2){ chosenJob = "Front Desk Receptionist"; jobSalary = 697; }
                else if(jobChoice == 3){ chosenJob = "Housekeeper"; jobSalary = 650; }
                else if(jobChoice == 4){ chosenJob = "Maintenance Technician"; jobSalary = 900; }
                else if(jobChoice == 5){ chosenJob = "Security Officer"; jobSalary = 750; } 
            } else {
                if(jobChoice == 1){ chosenJob = "Housekeeper"; jobSalary = 650; }
                else if(jobChoice == 2){ chosenJob = "Security Officer"; jobSalary = 750; }
            }
        }


        else if(industryChoice == 2){
            chosenIndustry = "Food Industry";

            System.out.println();
            System.out.println();
            System.out.println("FOOD INDUSTRY COMPANIES:");
            System.out.println("1. Nestlé - Switzerland");
            System.out.println("2. Ajinomoto Inc. - Japan");
            System.out.println("3. Danone - France");
            System.out.println("4. Grupo Bimbo - Mexico");
            System.out.println("5. Unilever - United Kingdom");
            System.out.println();
            System.out.print("Choose Company (1-5): ");
            int companyChoice = Input.nextInt();
            Input.nextLine();

            if(companyChoice == 1) chosenCompany = "Nestlé - Switzerland";
            else if(companyChoice == 2) chosenCompany = "Ajinomoto Inc. - Japan";
            else if(companyChoice == 3) chosenCompany = "Danone - France";
            else if(companyChoice == 4) chosenCompany = "Grupo Bimbo - Mexico";
            else if(companyChoice == 5) chosenCompany = "Unilever - United Kingdom"; 

            System.out.println();
            System.out.println();
            System.out.println("AVAILABLE JOBS:");

            if(isGraduate){
                System.out.println("1. Food Technologist = $375");
                System.out.println("2. Food Technician = $340");
                System.out.println("3. Quality Assurance Officer = $450");
                System.out.println("4. Production Supervisor = $715");
                System.out.println("5. R&D Specialist = $825");
            } else { 
                System.out.println("1. Food Technician = $340");
                System.out.println("2. Production Supervisor = $715");
            }

            System.out.println();
            System.out.print("Choose Job: ");
            int jobChoice = Input.nextInt();
            Input.nextLine();

            if(isGraduate){
                if(jobChoice == 1){ chosenJob = "Food Technologist"; jobSalary = 375; }
                else if(jobChoice == 2){ chosenJob = "Food Technician"; jobSalary = 340; }
                else if(jobChoice == 3){ chosenJob = "Quality Assurance Officer"; jobSalary = 450; }
                else if(jobChoice == 4){ chosenJob = "Production Supervisor"; jobSalary = 715; }
                else if(jobChoice == 5){ chosenJob = "R&D Specialist"; jobSalary = 825; } 
            } else {
                if(jobChoice == 1){ chosenJob = "Food Technician"; jobSalary = 340; }
                else if(jobChoice == 2){ chosenJob = "Production Supervisor"; jobSalary = 715; }
            }
        }


        else if(industryChoice == 3){
            chosenIndustry = "Healthcare Industry";

            System.out.println();
            System.out.println();
            System.out.println("HEALTHCARE INDUSTRY COMPANIES:");
            System.out.println("1. Pfizer Inc. - United States");
            System.out.println("2. Roche - Switzerland");
            System.out.println("3. Sanofi - France");
            System.out.println("4. AstraZeneca - United Kingdom");
            System.out.println("5. Takeda Pharmaceutical Company - Japan");
            System.out.println();
            System.out.print("Choose Company (1-5): ");
            int companyChoice = Input.nextInt();
            Input.nextLine();

            if(companyChoice == 1) chosenCompany = "Pfizer Inc. - United States";
            else if(companyChoice == 2) chosenCompany = "Roche - Switzerland";
            else if(companyChoice == 3) chosenCompany = "Sanofi - France";
            else if(companyChoice == 4) chosenCompany = "AstraZeneca - United Kingdom";
            else if(companyChoice == 5) chosenCompany = "Takeda Pharmaceutical Company - Japan"; 

            System.out.println();
            System.out.println();
            System.out.println("AVAILABLE JOBS:");

            if(isGraduate){
                System.out.println("1. Medical Assistant = $2800");
                System.out.println("2. Front Desk Staff = $1700");
                System.out.println("3. Clinic Cleaner = $1200");
                System.out.println("4. Caregiver = $1560");
                System.out.println("5. Lab Helper = $1920");
            } else {
                System.out.println("1. Clinic Cleaner = $1200");
                System.out.println("2. Caregiver = $1560");
            }

            System.out.println();
            System.out.print("Choose Job: ");
            int jobChoice = Input.nextInt();
            Input.nextLine();

            if(isGraduate){
                if(jobChoice == 1){ chosenJob = "Medical Assistant"; jobSalary = 2800; }
                else if(jobChoice == 2){ chosenJob = "Front Desk Staff"; jobSalary = 1700; }
                else if(jobChoice == 3){ chosenJob = "Clinic Cleaner"; jobSalary = 1200; }
                else if(jobChoice == 4){ chosenJob = "Caregiver"; jobSalary = 1560; }
                else if(jobChoice == 5){ chosenJob = "Lab Helper"; jobSalary = 1920; } 
            } else {
                if(jobChoice == 1){ chosenJob = "Clinic Cleaner"; jobSalary = 1200; }
                else if(jobChoice == 2){ chosenJob = "Caregiver"; jobSalary = 1560; }
            }
        }
    }
}