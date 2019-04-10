package imic.buoi10;

import org.junit.Test;

public class Bai02Test {

    @Test
    public void uocLonNhat()
    {
        int N = 15;
        int ketqua = Bai02.uocLonNhat(N);
        System.out.println("Uoc lon nhat la: "+ketqua);
    }

    @Test
    public void uocChungLonNhat()
    {
        int ketQua = Bai02.uocChungLonNhat(16, 56);
        System.out.println("Uoc chung lon nhat: "+ketQua);
    }
}