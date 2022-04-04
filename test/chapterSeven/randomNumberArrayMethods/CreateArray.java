package chapterSeven.randomNumberArrayMethods;

import java.util.Random;

public class CreateArray {
    public static int[] numberArray = new int[10];

    public void createArray() {
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            int randomNumbers = r.nextInt(11);
            numberArray[i] = randomNumbers;
            System.out.print(numberArray[i] + " ");
        }
    }

    public void sumAndAverageArrayElements() {
        int sum = 0;

        for(int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        System.out.printf("%nSum = %d%n", sum);
        System.out.println("Average = " + sum/10.0);
    }

    public void maximumArrayElement() {
        int maximum = 0;
        for(int i = 0; i< numberArray.length; i++) {
            if(numberArray[i] > maximum) {
                maximum = numberArray[i];
            }
        }
        System.out.println("Maximum = " + maximum);
    }
}
