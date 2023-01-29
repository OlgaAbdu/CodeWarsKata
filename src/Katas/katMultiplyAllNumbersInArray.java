package Katas;

import static java.util.stream.IntStream.of;

public class katMultiplyAllNumbersInArray {

    /*Given a non-empty array of integers, return the result of multiplying the values together in order. Example:*/
    /*link : https://www.codewars.com/kata/57f780909f7e8e3183000078/java  */
    public static int grow(int[] x){
        int pro = 1;
        for (int i = 0; i < x.length; i++) {
            pro = pro * x[i];
        }

        return pro;
    }

    static int grow2(int[] x) {
        return of(x).reduce(1, (a, b) -> a * b);
    }
}
