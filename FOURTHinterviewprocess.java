import java.util.Scanner;

public class FOURTHinterviewprocess {

    Scanner Input = new Scanner(System.in);

    public int interviewpoint(){

        int pointsINTERVIEW = 0;    

        System.out.println();
        System.out.println();
        System.out.println("Can you tell me about yourself?");
        System.out.print("Interview Score for this question (1 or 2): ");
        pointsINTERVIEW = pointsINTERVIEW + Input.nextInt();
        Input.nextLine();

        System.out.println();
        System.out.println();
        System.out.println("What are your strengths and weaknesses?");
        System.out.print("Interview Score for this question (1 or 2): ");
        pointsINTERVIEW = pointsINTERVIEW + Input.nextInt();
        Input.nextLine();

        System.out.println();
        System.out.println();
        System.out.println("Where do you see yourself in five years?");
        System.out.print("Interview Score for this question (1 or 2): ");
        pointsINTERVIEW = pointsINTERVIEW + Input.nextInt();
        Input.nextLine();

        System.out.println();
        System.out.println();
        System.out.println("How do you handle stress and presure?");
        System.out.print("Interview Score for this question (1 or 2): ");
        pointsINTERVIEW = pointsINTERVIEW + Input.nextInt();
        Input.nextLine();

        System.out.println();
        System.out.println();
        System.out.println("Why you and not someone else?");
        System.out.print("Interview Score for this question (1 or 2): ");
        pointsINTERVIEW = pointsINTERVIEW + Input.nextInt();
        Input.nextLine();


        System.out.println();

        return pointsINTERVIEW;
    }
}