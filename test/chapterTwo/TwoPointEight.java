package chapterTwo;

import java.util.Scanner;

public class TwoPointEight {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        // sample payroll calculation

        System.out.print("Enter pay per hour: ");
        double pph = in.nextDouble(); //pph stands for pay per hour
        System.out.print("Enter total hour worked: ");
        double thw = in.nextDouble(); //thw stands for total hour worked
        System.out.print("Enter overtime per hour: ");
        double oh = in.nextDouble(); //oh stands for overtime per hour
        System.out.print("Enter total overtime hour: ");
        double toh = in.nextDouble(); //toh stands for total overtime hour
        double grosspay = (pph * thw) + (oh * toh);
        System.out.println("Gross pay = " + grosspay);
    }
}
