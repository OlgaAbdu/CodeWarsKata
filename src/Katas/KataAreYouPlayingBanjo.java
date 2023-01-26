package Katas;

public class KataAreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {

        String result = name;
        char[] letters = name.toCharArray();
        if (letters[0] == 'R' || letters[0] == 'r') {
            result += " plays banjo";
        } else {
            result += " does not play banjo";
        }
        return result;
    }
}
