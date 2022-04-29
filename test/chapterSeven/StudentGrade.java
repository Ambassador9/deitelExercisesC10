package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        confirm number of students and subjects
        System.out.println("How many students do we have? ");
        int numberOfStudents = in.nextInt();
        System.out.println("How many subjects are offered? ");
        int numberOfSubjects = in.nextInt();

//        array of subjects and students
        String[] subjects = {"Maths", "English", "Others", "Total", "Average"};
        String[] students = {"student1", "student2", "student3"};
        int[][] grade = new int[numberOfStudents][numberOfSubjects];


//        collect individual students grade
        for(int a = 0; a < numberOfStudents; a++) {
            System.out.println("Enter grade for student " + (a+1));
            for(int b = 0; b < numberOfSubjects; b++) {
                int score = in.nextInt();
                grade[a][b] = score;
            }
            System.out.println();
        }

//        print out of grade heading (subjects)
        System.out.println("===============================================================");
        System.out.print("STUDENT");
        for(int subject = 0; subject < subjects.length; subject++) {
            System.out.printf("%11s", subjects[subject]);
        }
        System.out.println("\n===============================================================");
        System.out.println();

//        print out students column and grades per subjects
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.print(students[i]);
            for(int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%10d", grade[i][j]);
            }
            System.out.println();
        }
    }
}
