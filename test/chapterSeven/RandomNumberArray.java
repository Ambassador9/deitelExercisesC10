package chapterSeven;

import chapterSeven.randomNumberArrayMethods.CreateArray;
import chapterSeven.randomNumberArrayMethods.SumArrayElements;

import java.util.Random;

public class RandomNumberArray {
    public static void main(String[] args) {
        CreateArray array = new CreateArray();
        array.createArray();
        CreateArray sumAndAverage = new CreateArray();
        sumAndAverage.sumAndAverageArrayElements();
        CreateArray maximum = new CreateArray();
        maximum.maximumArrayElement();
    }
}
