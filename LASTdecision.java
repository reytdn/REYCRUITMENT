public class LASTdecision {

    public String decision(int Total){
        System.out.println();
        System.out.println();
        System.out.println("Total Points: " + Total);

        String status;
        if (Total > 24) {
            status = "HIGHLY QUALIFIED";
        }else if (Total == 24){
            status = "QUALIFIED";
        }else{
            status = "NOT QUALIFIED";
        }
        System.out.println();
        System.out.println("Status: " + status);
        System.out.println();
        return status;
    }   
}
