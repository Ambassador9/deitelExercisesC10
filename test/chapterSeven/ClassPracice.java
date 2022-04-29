package chapterSeven;

import java.security.SecureRandom;
import java.util.Random;

public class ClassPracice {
    public static void main(String[] args) {
        Random rn = new Random();

//        one dimensional array
        int[] numbers = new int[5];
        int counter = 1;
        int sum = 0;

        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = counter;
            counter++;
            System.out.print(numbers[a] + " ");
            sum += numbers[a];
        }
        System.out.println("\nSingle dimensional array sum = " + sum);
        System.out.println();


//        two dimensional array
        int[][] numbers2 = new int[2][2];
        int sum2 = 0;
        for (int m = 0; m < numbers2.length; m++) {
            for (int n = 0; n < numbers2[m].length; n++) {
                int input = 1 + rn.nextInt(10);
                numbers2[m][n] = input;
                System.out.print(numbers2[m][n] + " ");
                sum2 += numbers2[m][n];
            }
            System.out.println();
        }
        System.out.println("\nMulti-dimensional array sum = " + sum2);
        System.out.println();

//        class try:
        int[][] numbers3 = {{1, 2, 3}, {4, 5}, {2, 4, 6, 8}, {3}};
        for (int y = 0; y < numbers3.length; y++) {
            for (int z = 0; z < numbers3[y].length; z++) {
                System.out.print(numbers3[y][z] + " ");
            }
            System.out.println();
        }
        System.out.println();

//        dietel example for output alignment:

        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value");

        for(int index = 0; index < array.length; index++) {
            System.out.printf("%5d%8d%n", index, array[index]);
        }

//        exercise 7.8
        int[] five = {1,20,3,4,5};
        int[] anotherFive = new int[five.length];
        int i = 0;
        int max = five[0];

        for(int index = 1; index < five.length; index++) {
            if(five[index] > max) {
                max = five[index];
            }
        }
        System.out.println("Maximum number of array five = " + max);

        for(int index = five.length - 1; index > -1; index--) {
            anotherFive[i] = five[index];
                    i++;
        }

        for(int index = 0; index < anotherFive.length; index++) {
            System.out.print(anotherFive[index] + " ");
        }
        System.out.println("\n\n");


//        sample 7.6 ??? what of large data set where we can't hand code arrays?
        int[] arrays = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution");

        for(int counters = 0; counters < arrays.length; counters++) {
            if(counters == 10) {
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", counters * 10, counters * 10 + 9);
            }

            for(int stars = 0; stars < arrays[counters]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");


//            sample 7.7
        SecureRandom ran = new SecureRandom();
        int[] frequency = new int[7];

        for(int roll = 0; roll <= 1_000_000; roll++) {
            ++frequency[1 + ran.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for(int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
        System.out.printf("\n\n");



//          sample 7.8
        int[] responses = {1,2,3,4,3,5,4,1,2,3,2,2,3,3,1,5,4,4,3,14};
        int[] frequencys = new int[6];

        for(int answer = 0; answer < responses.length; answer++) {
            try{
                ++frequencys[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for(int rating = 1; rating < frequencys.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequencys[rating]);
        }
    }
}

