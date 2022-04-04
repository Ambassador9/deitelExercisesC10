package chapterSeven;

import java.security.SecureRandom;
import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTac = new char[3][3];
        ticTac[0][0] = 'X';
        ticTac[0][1] = 'O';
        ticTac[0][2] = 'X';
        ticTac[1][0] = 'X';
        ticTac[1][1] = 'X';
        ticTac[1][2] = 'X';
        ticTac[2][0] = 'O';
        ticTac[2][1] = 'X';
        ticTac[2][2] = 'O';

        System.out.printf("%c  %c  %c %n%c  %c  %c %n%c  %c  %c%n%n",
                ticTac[0][0], ticTac[0][1], ticTac[0][2], ticTac[1][0], ticTac[1][1],
                ticTac[1][2], ticTac[2][0], ticTac[2][1], ticTac[2][2]);



        // generating an array of numbers from 1-300
        int[] number = new int[300];

        for(int i=0; i<300; i++) {
            number[i] = i + 1;
            System.out.printf("%d ",number[i]);
        }
        System.out.printf("%n%n");



        // a 12 digit random password generator from an array comprising a-z, A-Z and 0-9.
        char[] password = new char[62];
        char[] passwordUpper = new char[26];
        char[] passwordLower = new char[26];
        char[] passwordDigit = new char[10];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for(char j='A'; j<='Z'; j++) {
            passwordUpper[a] = j;
            password[a] = j;
            a++;
        }
        for(char k='a'; k<='z'; k++) {
            passwordLower[b] = k;
            password[b+a] = k;
            b++;
        }
        for(char l='0'; l <= '9'; l++) {
            passwordDigit[c] = l;
            password[b+a+c] = l;
            c++;
        }
        for(int counter = 0; counter < 62; counter++) {
            System.out.print(password[counter] + " ");
        }
        System.out.println();


        SecureRandom rand = new SecureRandom();
        char[] storedPassword = new char[12];


        for(int i=0; i<12; i++) {
            int randomDigit = rand.nextInt(62);
            storedPassword[d] = password[randomDigit];
            d++;
            System.out.printf("%c", password[randomDigit]);
        }
        System.out.println();
        System.out.println(storedPassword);


//        // an idea for solving password exercise gotten online.
//        String[] arr={"1", "2", "3", "4", "5"};
//        Random r = new Random();
//        int randomNumber=r.nextInt(arr.length);
//        System.out.println(arr[randomNumber]);

    }

}
