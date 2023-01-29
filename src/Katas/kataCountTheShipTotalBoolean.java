package Katas;

public class kataCountTheShipTotalBoolean {

    public static int countSheep(Boolean[]arrayOfSheep){
        int count = 0;
        for (int i = 0; i < arrayOfSheep.length; i++) {
            if(arrayOfSheep[i] != null){
                if(arrayOfSheep[i] == true){
                    count ++;
                }
            }else{
                return count;
            }
        }
        return count;
    }
}
