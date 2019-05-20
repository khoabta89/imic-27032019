package imic.OnTap;

import java.util.ArrayList;
import java.util.List;

public class CuaHang
{
    //Câu 4a
    public static void Menu()
    {
        String myMenu = "" +
                "\nCategory: dfaf" +
                "\nName: dfaf" +
                "\nPrice: dfaa";

        Drink[] menu = new Drink[3];
        menu[0] = new CaPhe();
        menu[1] = new Soda();
        menu[2] = new TraSua();

        for (Drink drink : menu)
        {
            myMenu = myMenu.replaceAll("" +
                            "\nCategory: .+" +
                            "\nName: .+" +
                            "\nPrice: .+",
                    String.format("\nCategory: %s" +
                            "\nName: %s" +
                            "\nPrice: %s", drink.category, drink.name, drink.price));
            System.out.println(myMenu);
        }
    }

    //Câu 4b
    public static double tinhDoanhThu(String dsBanDuoc)
    {
        double doanhThu = 0;
        List<Drink> lsBanDuoc = chuyenDoi(dsBanDuoc);
        for (Drink drink : lsBanDuoc)
        {
            doanhThu = doanhThu + drink.getPrice();
        }
        return doanhThu;
    }

    //Câu 4c
    public static double tinhDoanhThu2(String dsBanDuoc)
    {
        double doanhThu2 = 0;
        List<Drink> lsBanDuoc = chuyenDoi(dsBanDuoc);
        for (Drink drink : lsBanDuoc)
        {
            doanhThu2 = doanhThu2 + drink.getPrice();
        }
        return doanhThu2;
    }

    public static List<Drink> chuyenDoi(String dsDoUong)
    {
        List<Drink> lsDoUong = new ArrayList();
        for (Character ch: dsDoUong.toCharArray())
            switch (ch) {
                case 'C':
                    lsDoUong.add(new CaPhe());
                    break;
                case 'T':
                    lsDoUong.add(new TraSua());
                    break;
                case 'S':
                    lsDoUong.add(new Soda());
                    break;
                default:
            }
        return lsDoUong;
    }
}
