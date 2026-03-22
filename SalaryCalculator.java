public class SalaryCalculator {
    
    public double weekly(double jobSalary){
        return jobSalary / 4;
    }
    public double monthly(double jobSalary){
        return jobSalary;
    }
    public double annually(double jobSalary){
        return jobSalary * 12;
    }
}
