import java.util.Arrays;
import java.util.Scanner;

class Lesson_3 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -20;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a1 = 2;
        int b1 = 20;
        if (a1 >= b1) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static void inLimit() {
        Scanner myInput = new Scanner( System.in );
        int a2 = myInput.nextInt();
        boolean result = (a2 >= 10) & (a2 <= 20);
        System.out.println(result);
    }

    public static void isPositive() {
        Scanner myInput = new Scanner( System.in );
        int a3 = myInput.nextInt();
        System.out.println(a3 < 0);
    }

    public static void isPositiveBool() {
        Scanner myInput = new Scanner( System.in );
        int a3 = myInput.nextInt();
        boolean result3 = a3 < 0;
        System.out.println(result3);
        if (result3) {
            System.out.println("Отрицательное");
        } else System.out.println("Положительное");
    }

    public static void manyStrings (String line, int mux) {
        for (int i = 0; i < mux; i++) {
            System.out.println(line);
        }
    }

    public static boolean isLeapYear (int year) {
        return ((year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0));
    }

    public static void arrayReverse (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayGenerate(int len, int initValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        //1
        printThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        inLimit();
        //5
        isPositive();
        //6
        isPositiveBool();
        //7
        manyStrings("word", 10);
        //8
        System.out.println(isLeapYear(500));
        //9
        int[] arrayReverse = {1 , 0, 1};
        arrayReverse(arrayReverse);
        //11
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));
        //12
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
        //13
        int arrlen = 5;
        int[][] table = new int[arrlen][arrlen];
        for (int i = 0; i < arrlen; i++) {
            for (int j = 0; j < arrlen; j++) {
                if ((i == j) | (arrlen - i == j + 1)) {
                    table[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(table[i]));
        }

        //14
        System.out.println(Arrays.toString(arrayGenerate(25, 111)));
    }
}


