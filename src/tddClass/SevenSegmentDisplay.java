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

    public String[][] getZero() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[2][1] = " ";
        sevenSegmentArray[2][2] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] getOne() {
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

    public String[][] getTwo() {
        sevenSegmentArray[1][0] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";
        sevenSegmentArray[3][3] = " ";

        return sevenSegmentArray;
    }

    public String[][] getThree() {
        sevenSegmentArray[1][0] = " ";
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] getFour() {
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

    public String[][] getFive() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[1][3] = " ";
        sevenSegmentArray[3][0] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] getSix() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[1][3] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] getSeven() {
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

    public String[][] getEight() {
        sevenSegmentArray[1][1] = " ";
        sevenSegmentArray[1][2] = " ";
        sevenSegmentArray[3][1] = " ";
        sevenSegmentArray[3][2] = " ";

        return sevenSegmentArray;
    }

    public String[][] getNine() {
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
                getZero();
                break;
            } else {
                if(pins == "01100001") {
                    getOne();
                    break;
                } else {
                    if(pins == "11011011") {
                        getTwo();
                        break;
                    } else {
                        if(pins == "11110011") {
                            getThree();
                            break;
                        } else {
                            if(pins == "01100111") {
                                getFour();
                                break;
                            } else {
                                if(pins == "10110111") {
                                    getFive();
                                    break;
                                } else {
                                    if(pins == "10111111") {
                                        getSix();
                                        break;
                                    } else {
                                        if(pins == "11100001") {
                                            getSeven();
                                            break;
                                        } else {
                                            if(pins == "11111111") {
                                                getEight();
                                                break;
                                            } else {
                                                if(pins == "11110111") {
                                                    getNine();
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

    public String[][] display() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(sevenSegmentArray[i][j] + " ");
            }
            System.out.println();
        }
        return sevenSegmentArray;
    }
}
