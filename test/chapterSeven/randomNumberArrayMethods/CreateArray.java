package chapterSeven.randomNumberArrayMethods;

import java.util.Random;

public class CreateArray {
    public static int[] numberArray = new int[10];

    public void createArray() {
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            int randomNumbers = r.nextInt(10);
            numberArray[i] = randomNumbers;
            System.out.print(numberArray[i] + " ");
        }
    }

    public int sumArrayElements() {
        int sum = 0;

        for (int j : numberArray) {
            sum += j;
        }
        System.out.printf("%nSum = %d%n", sum);
        return sum;
    }

    public void averageArrayElements() {
        System.out.println("Average = " + sumArrayElements()/10.0);
    }

    public void maximumArrayElement() {
        int maximum = 0;
        for (int j : numberArray) {
            if (j > maximum) {
                maximum = j;
            }
        }
        System.out.println("Maximum = " + maximum);
    }
}
