package imic.Buoi12;

public class Bai01 {
    public static double doNumberAndArray() {
        double[] myList = {-3, 7, -1.5, 3.7, 10, 7, 0, 7, -1.5};
        double min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return min;
    }

    public static void doCanBacHai()
    {
        double canBacHai = 0;
    }
}
