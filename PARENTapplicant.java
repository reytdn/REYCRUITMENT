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
}