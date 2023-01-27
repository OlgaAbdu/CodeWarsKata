package Katas;

public class kataMaxMinInArray {
    /*https://www.codewars.com/kata/577a98a6ae28071780000989/train/java*/


    public int min(int[] list) {
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }

            return min;
        }
        return 0;
    }

    public int max(int[] list) {
        int max = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }
}
