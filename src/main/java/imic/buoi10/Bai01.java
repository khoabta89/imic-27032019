package imic.buoi10;

public class Bai01
{
    public static int fibonacci (int n)
    {
        int F0 = 0;
        int F1 = 1;
        int Fn = 1;
        if (n < 0){
            return -1;
        } else if (n == 0 || n == 1){
            return n;
        } else if (n >= 2){
            for (int i = 2; i < n; i++){
                F0 = F1;
                F1 = Fn;
                Fn = F0 + F1;
            }
        }
        return Fn;
    }
}
