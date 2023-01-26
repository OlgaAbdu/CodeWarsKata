package Katas;

public class kataCountOsAndXs {

     /*Check to see if a string has the same amount of 'x's and 'o's.
     The method must return a boolean and be case insensitive. The string can contain any char.*/
    /*link : https://www.codewars.com/kata/55908aad6620c066bc00002a/java*/

    /* Version #1 */
    public static boolean getXO(String str) {
        str = str.toLowerCase();
        return str.replace("o", "").length() == str.replace("x", "").length();

    }

    /* Version #2 */

    public static boolean getXO2(String str) {
        int numberOfX = 0;
        int numberOfO = 0;

        for (char c : str.toCharArray()) {
            if (c == 'x' || c == 'X') {
                numberOfX++;
            }

            if (c == 'o' || c == 'O') {
                numberOfO++;
            }
        }

        return numberOfX == numberOfO;
    }

    /*Version # 3*/
    public static boolean getXO3(String str) {
        int x = 0, o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }
}
