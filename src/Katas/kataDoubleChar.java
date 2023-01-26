package Katas;

public class kataDoubleChar {

    /*Given a string, you have to return a string in which each character (case-sensitive) is repeated once.*/
    /*link : https://www.codewars.com/kata/56b1f01c247c01db92000076/train/java*/

    /*Version # 1 */
    public static String doubleChar(String s){
        String strNew = "";
        for(int i=0; i < s.length(); i++) {
            strNew = strNew + s.charAt(i)+ s.charAt(i);
        }
        return strNew;
    }

    /*Version # 2 */
    public static String doubleChar2(String s){
        StringBuilder srtingBuilder = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            srtingBuilder.append(s.charAt(i)).append(s.charAt(i));
        }
        return srtingBuilder.toString();
    }

    /*Version # 3 */
    public static String doubleChar3(String s) {

        String[] arr = s.split("");
        String answer = "";

        for (String i : arr)
            answer += i.repeat(2);

        return answer;
    }
}
