package tddClass;

public class SevenSegmentDisplay {

    private  String[][] sevenSegmentArray = {{"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"},
                                             {"#", "#", "#", "#"}};

    public boolean turnOn(int pin) {
        if(pin == 1) {
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 4; j++) {
                    System.out.print(sevenSegmentArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            if(pin == 0) {
                for(int i = 0; i < 5; i++) {
                    for(int j = 0; j < 4; j++) {
                        sevenSegmentArray[i][j] = " ";
                        System.out.print(sevenSegmentArray[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        return true;
    }

    public String[][] displayZero() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[2][1] = " ";
        sevenSegmentArray[2][2] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayOne() {
        sevenSegmentArray[0][0] = " ";
        sevenSegmentArray[0][1] = " ";
        sevenSegmentArray[0][2] = " ";
        sevenSegmentArray[1][0] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[2][0] = " ";
        sevenSegmentArray[2][1] = " ";
        sevenSegmentArray[2][2] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";
        sevenSegmentArray[4][0] = " ";
        sevenSegmentArray[4][1] = " ";
        sevenSegmentArray[4][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayTwo() {
        sevenSegmentArray[1][0] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";
        sevenSegmentArray[3][3] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayThree() {
        sevenSegmentArray[1][0] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayFour() {
        sevenSegmentArray[0][1] = " ";
        sevenSegmentArray[0][2] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";
        sevenSegmentArray[4][0] = " ";
        sevenSegmentArray[4][1] = " ";
        sevenSegmentArray[4][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayFive() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[1][3] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displaySix() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[1][3] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displaySeven() {
        sevenSegmentArray[1][0] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[2][0] = " ";
        sevenSegmentArray[2][1] = " ";
        sevenSegmentArray[2][2] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";
        sevenSegmentArray[4][0] = " ";
        sevenSegmentArray[4][1] = " ";
        sevenSegmentArray[4][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayEight() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] displayNine() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public void setScreen(String pins) {
        for(int i = 0; i < pins.length(); i++) {
            if(pins == "11111101") {
                displayZero();
                break;
            } else {
                if(pins == "01100001") {
                    displayOne();
                    break;
                } else {
                    if(pins == "11011011") {
                        displayTwo();
                        break;
                    } else {
                        if(pins == "11110011") {
                            displayThree();
                            break;
                        } else {
                            if(pins == "01100111") {
                                displayFour();
                                break;
                            } else {
                                if(pins == "10110111") {
                                    displayFive();
                                    break;
                                } else {
                                    if(pins == "10111111") {
                                        displaySix();
                                        break;
                                    } else {
                                        if(pins == "11100001") {
                                            displaySeven();
                                            break;
                                        } else {
                                            if(pins == "11111111") {
                                                displayEight();
                                                break;
                                            } else {
                                                if(pins == "11110111") {
                                                    displayNine();
                                                    break;
                                                } else {
                                                    turnOn(0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String[][] displayScreen() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(sevenSegmentArray[i][j] + " ");
            }
            System.out.println();
        }
        return sevenSegmentArray;
    }
}
