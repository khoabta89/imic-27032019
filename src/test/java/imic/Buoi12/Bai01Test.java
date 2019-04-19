package imic.Buoi12;

import org.junit.Test;

public class Bai01Test {

    @Test
    public void doNumberAndArray()
    {
        double ketQua = Bai01.inSoNhoNhat();
        System.out.println("Min la: "+ketQua);
    }

    @Test
    public void tinhCanBacHai()
    {
        Bai01.tinhCanBacHai();
    }
}