import java.util.Scanner;

public class SECONDverifydocument extends PARENTapplicant{
    Scanner Input = new Scanner(System.in);

    public SECONDverifydocument(String Name, int Age, String Email, String PhoneNumber, String EducationalAttainment,
        Boolean HaveBirthCertificate, Boolean HaveID, String IDNumber, String IDType, Boolean HaveMedicalRecord, Boolean HaveNBIClearance,
        int HMWorkedCompanies, String CompanyName, int HMWorkedMonths){

            super(Name, Age, Email, PhoneNumber, EducationalAttainment, HaveBirthCertificate, 
                HaveID, IDNumber, IDType, HaveMedicalRecord, HaveNBIClearance, HMWorkedCompanies, CompanyName, HMWorkedMonths);

    }

    public int pointsDOCU(){

        int docuPOINTS = 0;

        if(HaveBirthCertificate == true){
            docuPOINTS = docuPOINTS + 2;
        }else{
            docuPOINTS = docuPOINTS + 1;    
        }
            

        if(HaveID == true){
            docuPOINTS = docuPOINTS + 2;
        }else{
            docuPOINTS = docuPOINTS + 1;
        }

        if(HaveMedicalRecord == true){
            docuPOINTS = docuPOINTS + 2;
        }else{
            docuPOINTS = docuPOINTS + 1;
        }

        if(HaveNBIClearance == true){
            docuPOINTS = docuPOINTS + 2;
        }else{
            docuPOINTS = docuPOINTS + 1;
        }

        return docuPOINTS;
    }
}
