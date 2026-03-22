public class ApplicantInfo {

    public void showInfo(PARENTapplicant app, SelectJOB job){

        SalaryCalculator sc = new SalaryCalculator();

        double placementFee = job.jobSalary * 0.10;
        double retainerFee = 100;

        double monthlySalary = sc.monthly(job.jobSalary);
        double weeklySalary = sc.weekly(job.jobSalary);
        double annualSalary = sc.annually(job.jobSalary);

        String serviceChosen = "NONE"; 
        if(app.agencyService != null && !app.agencyService.isEmpty()){
            serviceChosen = app.agencyService;
        }

        System.out.println("===== FINAL DEPLOYMENT INFO =====");
        System.out.println("Name: " + app.Name);
        System.out.println("Email: " + app.Email);
        System.out.println("Job: " + job.chosenJob);
        System.out.println("Contract Type: CONTRACTUAL");

        System.out.println("Salary Details:");
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Weekly Salary: $" + weeklySalary);
        System.out.println("Annual Salary: $" + annualSalary);

        System.out.println("\nPlacement Fee (10%): $" + placementFee);
        System.out.println("Retainer Fee: $" + retainerFee);
        System.out.println("Net Salary (after fees): $" + (monthlySalary - placementFee - retainerFee));

        System.out.println("\nAgency Service Chosen: " + serviceChosen);
        System.out.println("Policy: Free replacement if employee leaves within 3 months");
    }
}