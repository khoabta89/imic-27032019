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
}
