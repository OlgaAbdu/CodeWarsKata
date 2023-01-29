package Katas;

public class kataPositiveInArray {

    public static int sum(int[] arr){
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }


    public static int sumM (int[] arr){

        if(arr.length == 0) return 0;
            // add all positive ints to the sum & return the result
        else {
            int sumM = 0;
            for(int num : arr){
                sumM = (num > 0 ? sumM + num : sumM);
            }
            return sumM;
        }
    }
}
