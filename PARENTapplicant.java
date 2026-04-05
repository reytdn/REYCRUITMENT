public class PARENTapplicant {

    protected String Name;
    protected int Age;
    protected String Email;
    protected String PhoneNumber;
    protected String EducationalAttainment;
    protected Boolean HaveBirthCertificate;
    protected Boolean HaveID;
    protected String IDNumber;
    protected String IDType;
    protected Boolean HaveMedicalRecord;
    protected Boolean HaveNBIClearance;
    protected int HMWorkedCompanies;
    protected String CompanyName;
    protected int HMWorkedMonths;

    public String agencyService = "";    
    public String agencySchedule = "";   
    public double agencyFee = 0;         

    public PARENTapplicant(String Name, int Age, String Email, String PhoneNumber, String EducationalAttainment,
        Boolean HaveBirthCertificate, Boolean HaveID, String IDNumber, String IDType, Boolean HaveMedicalRecord, Boolean HaveNBIClearance,
        int HMWorkedCompanies, String CompanyName, int HMWorkedMonths){

        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.EducationalAttainment = EducationalAttainment;
        this.HaveBirthCertificate = HaveBirthCertificate;
        this.HaveID = HaveID;
        this.IDNumber = IDNumber;
        this.IDType = IDType;
        this.HaveMedicalRecord = HaveMedicalRecord;
        this.HaveNBIClearance = HaveNBIClearance;
        this.HMWorkedCompanies = HMWorkedCompanies;
        this.CompanyName = CompanyName;
        this.HMWorkedMonths = HMWorkedMonths;
    }

    private double weekly(double jobSalary){
        return jobSalary / 4;
    }
    private double monthly(double jobSalary){
        return jobSalary;
    }
    private double annually(double jobSalary){
        return jobSalary * 12;
    }

    public void showInfo(SelectJOB job){

        double placementFee = job.jobSalary * 0.10;
        double retainerFee = 100;

        double monthlySalary = monthly(job.jobSalary);
        double weeklySalary = weekly(job.jobSalary);
        double annualSalary = annually(job.jobSalary);

        String serviceChosen = "NONE"; 
        if(agencyService != null && !agencyService.isEmpty()){
            serviceChosen = agencyService;
        }
        System.out.println();
        System.out.println("===== FINAL DEPLOYMENT INFO =====");
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Job: " + job.chosenJob);
        System.out.println("Contract Type: CONTRACTUAL");

        System.out.println("Salary Details:");
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Weekly Salary: $" + weeklySalary);
        System.out.println("Annual Salary: $" + annualSalary);

        System.out.println("Placement Fee (10%): $" + placementFee);
        System.out.println("Retainer Fee: $" + retainerFee); 
        System.out.println("Net Salary (after fees): $" + (monthlySalary - placementFee - retainerFee - agencyFee));

        System.out.println("Agency Service Chosen: " + serviceChosen);
        System.out.println("Agency Service Fee: $" + agencyFee);  
        System.out.println("Agency Service Schedule: " + agencySchedule);
        System.out.println("Policy: Free replacement if employee leaves within 3 months");
        System.out.println();
        }
    }
