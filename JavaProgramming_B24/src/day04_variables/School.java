package day04_variables;

public class School {
    public static void main(String[] args) {

        int totalNumberOfStudents;

        short numberOfStudents1stGrade = 10;
        short numberOfStudents2stGrade = 20;
        short numberOfStudents3stGrade = 31;
        short numberOfStudents4stGrade = 45;
        short numberOfStudents5stGrade = 55;
        short numberOfStudents6stGrade = 70;

        totalNumberOfStudents  = numberOfStudents1stGrade + numberOfStudents2stGrade+
                numberOfStudents3stGrade+numberOfStudents4stGrade+numberOfStudents5stGrade+numberOfStudents6stGrade;
        System.out.println("In total there is " + totalNumberOfStudents +" students");

        double  numberOfSchoolDays = 100.5;

        double  avgGradeInSchool   = 0.8;

        System.out.println(avgGradeInSchool+"%");

        float  aveSnowDaysInYear = 30.8f;

        System.out.println(aveSnowDaysInYear);

    }
}
