package imic.buoi10;

import static java.lang.StrictMath.sqrt;

public class Bai03
{
    public static boolean kiemTraSoNguyenTo (int n)
    {
        if (n < 2)
        {
            return false;
        }
        else
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
