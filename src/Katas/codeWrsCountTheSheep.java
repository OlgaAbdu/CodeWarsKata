package Katas;

public class codeWrsCountTheSheep {
    public static String countTheSheep(int num){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num; i++) {
            str.append(i + 1 + " sheep...");
        }
        return str.toString();

    }
}
