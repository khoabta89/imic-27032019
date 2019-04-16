package imic.buoi10;

public class Bai02
{
    public static int uocLonNhat(int N)
    {

        int ULN = 1;
        for (int i = 1; i < N; i++)
        {
            if (N % i == 0)
            {
                if (i > ULN)
                {
                    ULN = i;
                }
            }
        }
        return ULN;
    }

    public static int uocChungLonNhat(int N, int M)
    {
        int UCLN = 1;
        for (int i = 1; i <= N; i++)
        {
           if (N % i == 0 && M % i == 0)
           {
               if (i > UCLN)
               {
                   UCLN = i;
               }
           }
        }
        return UCLN;
    }

    public static int boiNhoNhat (int n)
    {
        int BNN = 1;
        for (int i = n + 1; i > n; i++)
        {
            if (i % n == 0){
                if (i > BNN) {
                    BNN = i;
                    return BNN;
                }
            }
        }
        return BNN;
    }

    public static int boiSoChungNhoNhat (int a, int b)
    {
        int BSCNN = 1;
        int max = a * b;
        for (int i = a; i <= max; i++)
        {
            if (i % a == 0 && i % b == 0)
            {
                BSCNN = i;
                return BSCNN;
            }
        }
        return BSCNN;
    }
}
