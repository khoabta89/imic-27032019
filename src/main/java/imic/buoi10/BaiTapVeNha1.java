package imic.buoi10;

public class BaiTapVeNha1
{
    public static void inTraiTim()
    {
        System.out.println("    ****   ****    ");
        System.out.println("   ****** ******   ");
        System.out.println("  ***************  ");
        System.out.println("  ***************  ");
        System.out.println("   *************   ");
        System.out.println("    ***********    ");
        System.out.println("      *******      ");
        System.out.println("        ***        ");
        System.out.println("         *         ");
    }

    public static int timSoFibonacciN (int n)
    {
        int Fn = 0;
        int F0 = 0;
        int F1 = 1;
        int F2 = 1;
        if (n >= 2)
        {
            for(int i = 2; i < n; i++)
            {
                Fn=F1+F2; //Fn = 2
                F1=F2; // F1 = 1
                F2=Fn; // F2 = 2
            }
        }
        return Fn;
    }

    public static int timUocLonNhat (int n)
    {
        int ULN = 0;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                if (i > ULN)
                {
                    ULN = i;
                }
            }
        }
        return ULN;
    }

    public static int timUocChungLonNhat (int a, int b)
    {
        int UCLN = 0;
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0 && b % i ==0)
            {
                if(i > UCLN)
                {
                    UCLN = i;
                }
            }
        }
        return UCLN;
    }

    public static int timBoiNhoNhat (int n)
    {
        int BNN = 0;
        for(int i = n; i <= n - 1; i++)
        {
            if(i % n == 0)
            {
                if (i > BNN)
                {
                    BNN = i;
                }
            }
        }
        return BNN;
    }
}
