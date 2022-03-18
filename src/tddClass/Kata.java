package tddClass;

public class Kata {


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) return firstNumber - secondNumber;
        if (secondNumber > firstNumber) return secondNumber - firstNumber;
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double findArea(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public double triangleArea(int base, int height) {
        return (base * height) / 2.0;
    }

    public int flip(int bit) {
        if (bit == 0) return 1;
        return 0;
    }


    public int unitOrdered(int numberOfCopies) {
        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            return 2000 * numberOfCopies;
        } else {
            if (numberOfCopies >= 5 && numberOfCopies <= 9) {
                return 1800 * numberOfCopies;
            } else {
                if (numberOfCopies >= 10 && numberOfCopies <= 29) {
                    return 1600 * numberOfCopies;
                } else {
                    if (numberOfCopies >= 30 && numberOfCopies <= 49) {
                        return 1500 * numberOfCopies;
                    } else {
                        if (numberOfCopies >= 50 && numberOfCopies <= 99) {
                            return 1300 * numberOfCopies;
                        } else {
                            if (numberOfCopies >= 100 && numberOfCopies <= 199) {
                                return 1200 * numberOfCopies;
                            } else {
                                if (numberOfCopies >= 200 && numberOfCopies <= 499) {
                                    return 1100 * numberOfCopies;
                                } else {
                                    if (numberOfCopies >= 500) {
                                        return 1000 * numberOfCopies;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public double quotient(int number1, int number2) {
        if(number1 > number2) {
            return number1/number2;
        } else {
            if(number1 < number2) {
                return number2/number1;
            }
        }
        return number1 / number2;
    }

    public boolean isEven(int digit) {
        if(digit%2 == 0) {
            return true;
        }
        return false;
    }
}



//
//    public void isPalindrome(int numbers) {
//        if((seperate[0] == seperate[4]) && (seperate[1] == seperate[3])) result = true;
//    }


