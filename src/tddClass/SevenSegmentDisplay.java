package tddClass;

public class SevenSegmentDisplay {

    private  String[][] sevenSegmentArray = {{" ", " ", " ", " "},
                                             {" ", " ", " ", " "},
                                             {" ", " ", " ", " "},
                                             {" ", " ", " ", " "},
                                             {" ", " ", " ", " "}};

    public String[][] turnOn(int pin) {
        if(pin == 1) {
            for(int i = 0; i < sevenSegmentArray.length; i++) {
                for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                    sevenSegmentArray[i][j] = "#";
                }
                System.out.println();
            }
        } else {
            return sevenSegmentArray;
        }
        return sevenSegmentArray;
    }

    public String[][] getA() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[0][0]) sevenSegmentArray[0][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[0][1]) sevenSegmentArray[0][1] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[0][2]) sevenSegmentArray[0][2] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[0][3]) sevenSegmentArray[0][3] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public String[][] getB() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[0][3]) sevenSegmentArray[0][3] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[1][3]) sevenSegmentArray[1][3] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][3]) sevenSegmentArray[2][3] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public String[][] getC() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][3]) sevenSegmentArray[2][3] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[3][3]) sevenSegmentArray[3][3] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[4][3]) sevenSegmentArray[4][3] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public String[][] getD() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[4][0]) sevenSegmentArray[4][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[4][1]) sevenSegmentArray[4][1] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[4][2]) sevenSegmentArray[4][2] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[4][3]) sevenSegmentArray[4][3] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public String[][] getE() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][0]) sevenSegmentArray[2][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[3][0]) sevenSegmentArray[3][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[4][0]) sevenSegmentArray[4][0] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public String[][] getF() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[0][0]) sevenSegmentArray[0][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[1][0]) sevenSegmentArray[1][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][0]) sevenSegmentArray[2][0] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public String[][] getG() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][0]) sevenSegmentArray[2][0] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][1]) sevenSegmentArray[2][1] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][2]) sevenSegmentArray[2][2] = "#";
                if(sevenSegmentArray[i][j] == sevenSegmentArray[2][3]) sevenSegmentArray[2][3] = "#";
            }
            System.out.println();
        }

        return sevenSegmentArray;
    }

    public void setScreen(String pins) {
        turnOn(0);
        if(pins.charAt(7) == '1') {
            if(pins.charAt(0) == '1') getA();
            if(pins.charAt(1) == '1') getB();
            if(pins.charAt(2) == '1') getC();
            if(pins.charAt(3) == '1') getD();
            if(pins.charAt(4) == '1') getE();
            if(pins.charAt(5) == '1') getF();
            if(pins.charAt(6) == '1') getG();
        }
    }

    public void display() {
        for(int i = 0; i < sevenSegmentArray.length; i++) {
            for(int j = 0; j < sevenSegmentArray[0].length; j++) {
                System.out.print(sevenSegmentArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}