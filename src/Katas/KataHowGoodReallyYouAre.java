package Katas;

public class KataHowGoodReallyYouAre {

    /*There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!*/
    /*link: https://www.codewars.com/kata/5601409514fc93442500010b/train/java */

    /*Version # 1 */
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
            int average = sum / classPoints.length;
            if (average >= yourPoints) {

                return false;
            } else {

            }
        }

        return true;
    }
    /*Version # 2 */
    public static boolean betterThanAverage2(int[] classPoints, int yourPoints) {
        long avg = 0;

        for (int i : classPoints)
        {
            avg += i;
        }

        avg /= classPoints.length;

        if (yourPoints > avg) return true;
        return false;
    }
}
