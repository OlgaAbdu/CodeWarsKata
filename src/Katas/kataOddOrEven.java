package Katas;

public class kataOddOrEven {
    /*Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).*/
    /*link:  https://www.codewars.com/kata/5949481f86420f59480000e7/java*/
    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        if (sum % 2 == 0) {

            return "even";
        } else {
        }
        return "odd";

    }
    public static String oddOrEven2 (int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum%2==0 ? "even" : "odd";
    }
}
