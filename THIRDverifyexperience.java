public class THIRDverifyexperience extends SECONDverifydocument{

    public THIRDverifyexperience(PARENTapplicant app) {
        super(app.Name, app.Age, app.Email, app.PhoneNumber, app.EducationalAttainment,
            app.HaveBirthCertificate, app.HaveID, app.IDNumber, app.IDType,
            app.HaveMedicalRecord, app.HaveNBIClearance,
            app.HMWorkedCompanies, app.CompanyName, app.HMWorkedMonths);
    }
    public int pointsEXP(){

        int Total = 0;

        if(EducationalAttainment.equalsIgnoreCase("Senior High School Graduate") ||
            EducationalAttainment.equalsIgnoreCase("College Undergraduate") ||
            EducationalAttainment.equalsIgnoreCase("College Graduate")){
                Total = Total + 2;
            } else {
                Total = Total + 1;
            }

            Total = Total + pointsDOCU();
            
            Total = Total + HMWorkedCompanies * 2;  

            if(HMWorkedMonths >= 24){
                Total = Total + 2;

            }else{
                Total = Total + 1;
            }

            return Total;

    }
}
