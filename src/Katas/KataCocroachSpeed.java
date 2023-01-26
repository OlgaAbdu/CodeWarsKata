package Katas;

public class KataCocroachSpeed {

    /*The cockroach is one of the fastest insects. Write a function which takes its speed in km per
    hour and returns it in cm per second, rounded down to the integer (= floored).*/
    /*link: https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/java*/

    public int cockroachSpeed(double x) {
        return (int) Math.floor(x * 27.7778);
    }
}
