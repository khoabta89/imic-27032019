package imic.buoi10;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaiTapVeNha1Test {

    @Test
    public void inTraiTim()
    {
        BaiTapVeNha1.inTraiTim();
    }

    @Test
    public void timSoFibonacciN()
    {
        int n = 6;
        int ketQua = BaiTapVeNha1.timSoFibonacciN(n);
        System.out.print("So Fibo thu "+n +" la: "+ketQua);
    }

    @Test
    public void timUocLonNhat()
    {
        int n = 15;
        int ketQua = BaiTapVeNha1.timUocLonNhat(n);
        System.out.print("ULN cua "+n +" la: "+ketQua);
    }

    @Test
    public void timUocChungLonNhat()
    {
        int a = 12;
        int b = 18;
        int ketQua = BaiTapVeNha1.timUocChungLonNhat(a,b);
        System.out.print("UCLN cua "+a +" va "+b +" la: "+ketQua);
    }

    @Test
    public void timBoiNhoNhat()
    {
        int n = 4;
        int ketQua = BaiTapVeNha1.timBoiNhoNhat(n);
        System.out.print("BNN cua "+n +" la: "+ketQua);
    }
}