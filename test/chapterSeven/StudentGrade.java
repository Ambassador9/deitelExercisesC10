package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many students do we have? ");
        int numberOfStudents = in.nextInt();
        System.out.println("How many subjects are offered? ");
        int numberOfSubjects = in.nextInt();

        String[] subjects = {"Maths", "English", "Others"};
        String[] students = {" ", "studentOne", "studentTwo", "studentThree"};
        int[][] grade = new int[numberOfStudents][numberOfSubjects];

        for(int a = 0; a < numberOfStudents; a++) {
            System.out.println("Enter grade for student " + (a+1));
            for(int b = 0; b < numberOfSubjects; b++) {
                int score = in.nextInt();
                grade[a][b] = score;
            }
            System.out.println();
        }

        for(int student = 0; student < students.length; student++) {
            System.out.print(students[student]);
        }

        for(int subject = 0; subject < subjects.length; subject++) {
            System.out.print(subjects[subject] + "  ");
        }
        System.out.println();

        for(int i = 0; i < numberOfStudents; i++) {
            for(int j = 0; j < numberOfSubjects; j++) {
                System.out.print(grade[i][j] + "      ");
            }
            System.out.println();
        }
    }
}
