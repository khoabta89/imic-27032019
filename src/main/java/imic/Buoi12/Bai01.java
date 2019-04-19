package imic.Buoi12;

public class Bai01
{
    public static double inSoNhoNhat() {
        double[] myList = {-3, 7, -1.5, 3.7, 10, 7, 0, 7, -1.5};
        double min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return min;
    }

    public static double tinhCanBacHai()
    {
        double[] myList = {-3, 7, -1.5, 3.7, 10, 7, 0, 7, -1.5};
        double ketQua = Math.sqrt(myList[0]);
        for (int i = 1; i < myList.length; i++)
        {
            if (myList[i] > 0)
            {
                ketQua = Math.sqrt(myList[i]);
                System.out.println("Can ban 2 cac so: " +String.format("%.2f",ketQua) +",");
            }
        }
        return ketQua;
    }
}
