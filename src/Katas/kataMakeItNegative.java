package Katas;

import static java.lang.Math.abs;

public class kataMakeItNegative {
    /*In this simple assignment you are given a number and have to make
    it negative. But maybe the number is already negative?*/
    /* link : https://www.codewars.com/kata/55685cd7ad70877c23000102/train/java*/
    public static int makeNegative(final int x) {
        if (x > 0) {

            return x * -1;
        } else if (x < 0) {

            return x * 1;
        } else {
        }

        return 0;
    }

    /*version #2 */
    public static int makeNegative2(final int x) {
        return -abs(x);
    }
}
