import java.util.Scanner;
class StudentGradeCal{
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int totalSubjects;
   int totalMarks=0;
   System.out.println("Enter the number of subject");
   totalSubjects =sc.nextInt();
     for(int i=1;i<=totalSubjects;i++){
        System.out.println("Enter  marks for subjects " + i + "(out of 1oo)");
        int marks =sc.nextInt();
        totalMarks+= marks;
     }
     double averagePercentage=(double)totalMarks/totalSubjects;
     String grade =calculateGrade(averagePercentage);
     System.out.println("totalMarks"+totalMarks);
     System.out.println("averagePercentage"+ averagePercentage + "%");
     System.out.println("Grade"+ grade);
     sc.close();
     }
     // CALCULATE GRADE AS PER SUBJECT AVERage percentage 
     public static String  calculateGrade(double averagePercentage){
        String grade;
        if(averagePercentage>=90){
            grade ="A"; 
        }
        else if(averagePercentage>=80){
            grade="B";
        }
        else if(averagePercentage>=70){
            grade="C";
        }
        else if(averagePercentage>=60){
            grade="D";
        }
        else{
            grade ="F";
        }
        return grade;
     }

}