package com.mycompany.first;

import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        // Let's start with setter and getter 
        //calling the getter method_________
        CheckingAccount accountOne = new CheckingAccount("Zeus", 1000, "1");
        System.out.println(accountOne.getBalance());
        //calling the setter method________
        accountOne.setBalance(5000);
        System.out.println(accountOne.getBalance());
        //______________________this keyword with variables_________
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
        System.out.println(zeusSavingsAccount.owner);
        zeusSavingsAccount.addMoney(2000);
        //_______________________this keyword with methods________
        Person emily = new Person(20);
        emily.hasBirthday();
        System.out.println("New age is: " + emily.age);
        System.out.println("New wisdom is: " + emily.wisdom);
        System.out.println("New fitness is: " + emily.fitness);
        //______for accessing private method________
        accountOne.getAccountInformation();
        //_______________________________________________________built-in Math methods________________
        //return smaller value of two numbers
        int smallerNumber = Math.min(10, 5);
        System.out.println(smallerNumber);
        // Returns the absolute value of an int value
        System.out.println(Math.abs(-20));
        //2^5 power
        double x = Math.pow(2, 5);
        System.out.println(x);
        //sqrt
        double y = Math.sqrt(81);
        System.out.println(y);
        //random() ____  Returns a double value greater than or equal to 0.0 and less than 1.0
        System.out.println(Math.random());
        // random number between 0 to 10
        System.out.println(Math.random() * 10);
        // for returning an integer
        int z = (int) (Math.random() * 10);
        System.out.println(z);
        //start at 1 and end at 10
        int a = (int) (Math.random() * 10) + 1;
        System.out.println(a);
        // Random int value between 10 and 20
        int d = (int) (Math.random() * 11) + 10;
        System.out.println(d);
        //changing integer to string
        String myNewString = Integer.toString(100);
        System.out.println(myNewString);
        //changing string to double 
        double number = Double.valueOf("2.5");
        System.out.println(number);
        //____________________________________________static variables and methods________________________
        System.out.println("Total number of ATMs: " + ATM.numATMs);
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(5000);
        ATM thirdATM = new ATM(2000);
        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        thirdATM.withdrawMoney(1000);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        //printing the static method created by myself
        ATM.averageMoney();
        //________________________________________________inheritance___________________________________________________
//     Spaghetti spaghettiPomodoro = new Spaghetti();
//     System.out.println(spaghettiPomodoro.texture);
//     spaghettiPomodoro.cook();
        //______________________________initializing subclass with super()___________________
        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);
        //final method
        Noodle something = new Noodle(1, 1, "humaira", "mehraban");
        System.out.println(something.isTasty());
        //_________________________________________polymorphism___________________________
        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();
        //____________________________________________getting input________________________
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scanner.close();*/
        //_______________array with parent class_________________and for each loop___________
        Noodle spaghetti, pho, spaetzle;
        spaghetti = new Spaghetti();
        pho = new Pho();
        spaetzle = new Spaetzle();
        Noodle[] allTheNoodles = {spaghetti, pho, spaetzle};
        for (Noodle noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }
//syntax error              System.out.println(4)
//run-time error            System.out.println(4/0);
//logic error
//_________________________error handling using try/catch________________
        int width = 0;
        int length = 40;
        try {
            int ratio = length / width;
            System.out.println(ratio);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }
//________________________________________area of different shapes______________
        /* Scanner keyboard = new Scanner(System.in);
        System.out.println("Shape Area Calculator");
        while (true) {
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();

            System.out.print("Which shape: ");

            int shape = keyboard.nextInt();
            System.out.println();

            if (shape == 1) {
                System.out.print("Base: ");
                int base = keyboard.nextInt();
                System.out.print("Height: ");
                int height = keyboard.nextInt();
                area_triangle(base, height);
            } else if (shape == 2) {
                System.out.print("Length: ");
                int length2 = keyboard.nextInt();
                System.out.print("Width: ");
                int width2 = keyboard.nextInt();
                area_rectangle(length2, width2);
            } else if (shape == 3) {
                System.out.print("Radius: ");
                int radius = keyboard.nextInt();
                area_circle(radius);
            } else if (shape == 4) {
                quit();
                break;
            }
        }
        keyboard.close(); */
        //__________________________________________2D__array___________________
        //declaration
        float[][] floatTwoD;
        floatTwoD = new float[4][10];
        //initializing
        char[][] ticTacToe = {
            {'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}
        };
        //modify the values
        ticTacToe = new char[][]{
            {'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}
        };
        //printing the whole array, I mean subarrays
        System.out.println(Arrays.deepToString(ticTacToe));
        //accessing values of array
        int[][] intMatrix = {
            {1, 1, 1, 1, 1},
            {2, 4, 6, 8, 0},
            {9, 8, 7, 6, 5}
        };
        int retrievedInt = intMatrix[0][3];
        System.out.println(retrievedInt);
        int midVal = intMatrix[1][2];
        System.out.println(midVal * 3);
        //modify the specific value
        int[][] subMatrix = new int[2][2];
        subMatrix[0][0] = intMatrix[0][0] * 5;
        subMatrix[0][1] = intMatrix[0][1] * 5;
        subMatrix[1][0] = intMatrix[1][0] * 5;
        subMatrix[1][1] = intMatrix[1][1] * 5;
        System.out.println(Arrays.deepToString(subMatrix));
        //nested loop example
        for (int outer = 0; outer < 3; outer++) {
            System.out.println("The outer index is: " + outer);
            for (int inner = 0; inner < 4; inner++) {
                System.out.println("\tThe inner index is: " + inner);
            }
        }
        //zarb zabani az 1 taa 10___________________
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
        //accessing and retrieving all the values of 2D array_________traversal
        int[][] intMatrix2 = {
            {4, 6, 8, 10, 12, 14, 16},
            {18, 20, 22, 24, 26, 28, 30},
            {32, 34, 36, 38, 40, 42, 44},
            {46, 48, 50, 52, 54, 56, 58},
            {60, 62, 64, 66, 68, 70, 79}
        };
        //to store how many rows the array has_______
        int rows = intMatrix2.length;
        //to store how many columns the array has_______
        int columns = intMatrix2[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                sum += intMatrix2[i][j];
            }
        }
        System.out.println(sum);
        //Calculate the total number of 1s in array
        int[][] binary = {
            {0, 1, 0, 1},
            {1, 1, 1, 0},
            {1, 0, 0, 1},
            {1, 0, 1, 0}
        };
        int onesCount = 0;
        for (int[] intRow : binary) {
            for (int a2 : intRow) {
                if (a2 == 1) {
                    onesCount += a2;
                    System.out.println(a2);
                }
            }
        }
        System.out.println(onesCount);
        //nested while loop to print an array in this format //valueOfArray [rowIndex][columnIndex] 
        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
        int i = 0;
        int j = 0;
        while (i < wordData.length) {   //row
            j = 0;
            while (j < wordData[i].length) { //column
                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");

                j++;
            }

            i++;
        }
//_______________print each row sum_______
        double[][] data = {{0.51, 0.99, 0.12},
        {0.28, 0.99, 0.89},
        {0.05, 0.94, 0.05},
        {0.32, 0.22, 0.61},
        {1.00, 0.95, 0.09},
        {0.67, 0.22, 0.17}};
        double rowSum = 0.0;
        for (int o = 0; o < data.length; o++) {
            rowSum = 0.0;
            for (int s = 0; s < data[o].length; s++) {
                rowSum += data[o][s];
            }
            System.out.println("Row: " + o + ", Sum: " + rowSum);
        }
        //_____________finding each row total and average_____________________row-major example
        double[][] times = {
            {64.791, 75.972, 68.950, 79.039, 73.006, 74.157},
            {67.768, 69.334, 70.450, 67.667, 75.686, 76.298},
            {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}
        };
        //for total of each row
        double runnerTime = 0.0;
        for (int outer = 0; outer < times.length; outer++) {
            runnerTime = 0.0;
            for (int inner = 0; inner < times[outer].length; inner++) {
                System.out.println("Runner index: " + outer + ", Time index: " + inner);
                runnerTime += times[outer][inner];
            }
            //for average of each row
            double averageVal = 0;
            averageVal = runnerTime / times[outer].length;
            System.out.println("Sum of runner " + outer + " times: " + runnerTime);
            System.out.println("Average of runner " + outer + ": " + averageVal);
        }
        //____________________________column-major example______________________
        System.out.println();
        System.out.println();
        //for total of each column
        double lapTime = 0.0;
        for (int outer = 0; outer < times[0].length; outer++) {
            lapTime = 0.0;
            for (int inner = 0; inner < times.length; inner++) {
                System.out.println("Lap index: " + inner + ", Time index: " + outer);
                lapTime += times[inner][outer];
            }
            double averageVal = 0;
            averageVal = lapTime / times.length;
            System.out.println("Sum of lap " + outer + " times: " + lapTime);
            System.out.println("Average time for lap " + outer + ": " + averageVal + "\n\n\n");
        }
        //using conditional statements with traversal
        int[][] imageData = {
            {100, 90, 255, 80, 70, 255, 60, 50},
            {255, 10, 5, 255, 10, 5, 255, 255},
            {255, 255, 255, 0, 255, 255, 255, 75},
            {255, 60, 30, 0, 30, 60, 255, 255}
        };
        //removing the 2 columns from 4*8 to 4*6
        int[][] newImage = new int[4][6];

        for (int k = 0; k < newImage.length; k++) {
            for (int l = 0; l < newImage[k].length; l++) {
                newImage[k][l] = imageData[k][l];
            }
        }
        System.out.println(Arrays.deepToString(newImage));
        //decrease the brightness of the newImage by 50 
        for (int m = 0; m < newImage.length; m++) {
            for (int n = 0; n < newImage[m].length; n++) {
                if (newImage[m][n] - 50 < 0) {
                    newImage[m][n] = 0;
                } else {
                    newImage[m][n] = newImage[m][n] - 50;
                }
            }
        }
        System.out.println(Arrays.deepToString(newImage));
        //__________capitalization of the words_________________
        String[][] words = {
            {"championship", "QUANTITY", "month"},
            {"EMPLOYEE", "queen", "understanding"},
            {"method", "writer", "MOVIE"}
        };
        System.out.println("Before...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
        for (i = 0; i < words.length; i++) {
            for (j = 0; j < words[i].length; j++) {
                if (words[i][j] != null) {

                    boolean allCaps = true;
                    for (char c : words[i][j].toCharArray()) {
                        if (!Character.isUpperCase(c)) {
                            allCaps = false;
                        }
                    }

                    if (allCaps) {
                        words[i][j] = words[i][j].toLowerCase();
                    } else {
                        words[i][j] = words[i][j].toUpperCase();
                    }
                }
            }
        }

        System.out.println("After...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");

        //Declare and initialize a 4x3 2D array of doubles called `scores`
        double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}};
        System.out.println(Arrays.deepToString(scores));

        //Manually enter the scores for the second exam
        scores[0][1] = 89.7;
        scores[1][1] = 90.5;
        scores[2][1] = 93.6;
        scores[3][1] = 88.1;
        System.out.println(Arrays.deepToString(scores));

        //Declare and initialize an empty 4x2 2D array of double values called `newScores`
        double[][] newScores = new double[4][2];

        //Use `for` loops to copy the scores
        for (i = 0; i < newScores.length; i++) {
            for (j = 0; j < newScores[i].length; j++) {
                newScores[i][j] = scores[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newScores));

        //Iterate through the `newScores` 2D array and use `if` statement to add 2 additional points
        for (i = 0; i < newScores.length; i++) {
            for (j = 0; j < newScores[i].length; j++) {
                if (newScores[i][j] < 90) {
                    newScores[i][j] += 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(newScores));

//____________________________________________main__method__end________________________________________________________________________________
    }
    //outside the main method________inside that class_______area functions_____

    public static double area_triangle(int base, int height) {
        System.out.println();
        double A = (base * height) / 2;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static int area_rectangle(int length, int width) {
        System.out.println();
        int A = length * width;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static double area_circle(int radius) {
        System.out.println();
        double A = Math.PI * radius * radius;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static String quit() {
        System.out.println("Good Bye");
        return null;
    }

//________________________________________first__class__end______________________________________________________________________________________________________
}

//___________________class 1___________
class CheckingAccount {

    public String name;
    private int balance;
    private String id;
    private double interestRate = 0.02;
    //constructor

    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }
    //_________getter_______or______accessor

    public int getBalance() {
        return this.balance;
    }
    //second way I tried 
//   public int getBalance2(int balance2){
//   balance = balance2;
//   return balance2;
//  }
    //___________setter_______or_____mutator

    public void setBalance(int balance2) {
        balance = balance2;
    }

    private double calculateNextMonthInterest() {
        double nextMonthInterest = this.balance * this.interestRate;
        return nextMonthInterest;
    }
    //accessing private method with getter 

    public void getAccountInformation() {
        System.out.println("Money in account: " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
    }

}
//________________class 2____________for this keyword________this with variables____

class SavingsAccount {

    public String owner;
    public double balanceDollar;
    public double balanceEuro;

    public SavingsAccount(String owner, double balanceDollar) {
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        this.balanceEuro = balanceDollar * 0.85;
    }

    public void addMoney(int balanceDollar) {
        System.out.println("Adding " + balanceDollar + " dollars to the account.");
        this.balanceDollar += balanceDollar;
        System.out.println("The new balance is " + this.balanceDollar + " dollars.");
    }

}
//____________________class 3_______________this with methods_______

class Person {

    public int age;
    public int wisdom;
    public int fitness;

    public Person(int inputAge) {
        this.age = inputAge;
        this.wisdom = inputAge * 5;
        this.fitness = 100 - inputAge;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWisdom(int newWisdom) {
        this.wisdom = newWisdom;
    }

    public void setFitness(int newFitness) {
        this.fitness = newFitness;
    }
//this is using this with mwthods_____________

    public void hasBirthday() {
        this.setAge(this.age + 1);
        this.setWisdom(this.wisdom + 5);
        this.setFitness(this.fitness - 3);

    }
}
//____________________________________class 4____________________static variable__________

class ATM {

    public static int totalMoney = 0;
    public static int numATMs = 0;
    public int money;

    public ATM(int inputMoney) {
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney() {
        System.out.println(totalMoney / numATMs);
    }
}
//_________________________________________________inheritance________________________________
//___________superclass__________

class Noodle {

    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    protected String ingredients;
    String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {
        System.out.println("Boiling");
        this.texture = "cooked";
        System.out.println(texture);

    }

    public final boolean isTasty() {            //the method will never change.
        return true;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }
}
//__________subclass___________

class Spaghetti extends Noodle {

    public Spaghetti() {
        super(30.0, 0.64, "flat", "rice flour");
    }

}
//another subclass using the parent class constructor by super()

class Pho extends Noodle {

    public Pho() {
        super(30.0, 0.64, "flat", "rice flour");
    }

}

class Spaetzle extends Noodle {

    Spaetzle() {
        super(3.0, 1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";
    }

    @Override
    public void cook() {
        System.out.println("Grinding or scraping the dough into the pot of boiling water.");
        //____this 2 line and that 1 line doing the same______Yes I am a legend_____
        //this.texture = "cooked";
        // System.out.println("Boiling");
        super.cook();
    }
}
