import java.util.Scanner;

public class GradeCalc{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i=0; i<numSubjects; i++){
            System.out.print("Enter name for subject " + (i+1)+ ": ");
            subjects[i]=scanner.nextLine();
            System.out.print("Enter marks for " +subjects[i]+": ");
            marks[i]=scanner.nextInt();
            scanner.nextLine();
            totalMarks +=marks[i];
        }
        double averagePercentage = (double) totalMarks/numSubjects;

        char grade;
        if(averagePercentage >= 90){
            grade = 'A';
        }else if (averagePercentage>= 80){
            grade = 'B';
        }else if (averagePercentage>= 70){
            grade = 'C';
        }else if (averagePercentage>= 60){
            grade = 'D';
        }else if (averagePercentage>= 50){
            grade = 'E';
        }else {
            grade = 'F';
        }

        System.out.println("Total Marks: "+ totalMarks);
        System.out.println("Average Percentage: "+averagePercentage+ "%");
        System.out.println("Grade: "+grade);

        System.out.println("Marks for each subject:");
        for(int i=0; i< numSubjects; i++){
            System.out.println(subjects[i]+ ": "+ marks[i]);
        }

        scanner.close();
    }
}