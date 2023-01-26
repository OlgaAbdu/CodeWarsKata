package Katas;

public class kataGrasshoperCheckForFactors {

    /*Factors are numbers you can multiply together to get another number.
2 and 3 are factors of 6 because: 2 * 3 = 6
You can find a factor by dividing numbers. If the remainder is 0 then the number is a factor.
You can use the mod operator (%) in most languages to check for a remainder
For example 2 is not a factor of 7 because: 7 % 2 = 1
Note: base is a non-negative number, factor is a positive number.*/
    /*https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/java*/

    /*Version # 1 */
    public static boolean checkForFactor(int base, int factor) {
        if (base % factor == 0) {

            return true;
        } else {

            return false;
        }

    }

    /*Version # 2 */
    public static boolean checkForFactor1(int base, int factor) {

        return base % factor == 0;
    }

    /*Version # 3 */
    public static boolean checkForFactor2(int base, int factor) {

        return base % factor == 0 ? true : false;
    }
}
