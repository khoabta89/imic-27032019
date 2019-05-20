package imic.OnTap;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuaHangTest {

    @Test
    public void menu()
    {
        CuaHang.Menu();
    }

    @Test
    public void tinhDoanhThu()
    {
        String lsBanDuoc = "CCTSCTSTTT";
        double doanhThu = CuaHang.tinhDoanhThu(lsBanDuoc);
        System.out.println("Doanh thu trong 1 gio : "+doanhThu);
    }

    @Test
    public void tinhDoanhThu2()
    {
        String lsBanDuoc1 = "CCTSCTSTTTTSCSCTTTSCCSTCSSSTTTTTT";
        double doanhThu2 = CuaHang.tinhDoanhThu2(lsBanDuoc1);
        System.out.println("Doanh thu trong 5 gio : "+doanhThu2);
    }
}