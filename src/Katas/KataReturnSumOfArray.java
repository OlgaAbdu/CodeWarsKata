package Katas;

public class KataReturnSumOfArray {

    /*https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java*/
    /*Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be
    negative or non-integer. If the array does not contain any numbers then you should return 0*/

    /*Version # 1*/
    public static double sum(double[] numbers) {
        double sum = 0;

        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++)
                sum += numbers[i];

            return sum;
        }

        return 0;
    }

   /*Version # 2*/
    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }

}
