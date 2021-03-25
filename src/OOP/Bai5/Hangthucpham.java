package OOP.Bai5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.lang.System.*;

public class Hangthucpham {
    private String mahang, tenhang, Ghichu, ngay, thang, nam;
    private double donGia;
    private LocalDate nsx, hsd;

    public Hangthucpham(String mahang, String tenhang, double donGia, LocalDate nsx, LocalDate hsd) {
        if (mahang.isEmpty() == false) {
            this.mahang = mahang;
        }
        if (donGia >= 0) this.donGia = donGia;
        if (tenhang.isEmpty() == true) {
            this.tenhang = "xxx";
        } else this.tenhang = tenhang;

        ngay = String.valueOf(nsx.getDayOfMonth());
        thang = String.valueOf(nsx.getMonth());
        nam = String.valueOf(nsx.getYear());
        this.nsx = nsx;

        ngay = String.valueOf(hsd.getDayOfMonth());
        thang = String.valueOf(hsd.getMonth());
        nam = String.valueOf(hsd.getYear());
        if (hsd.isAfter(nsx)) {
            this.hsd = hsd;
        } else {
            this.hsd = nsx;
        }
    }

    public Hangthucpham() {
    }

    public String getMahang() {
        return mahang;
    }

    // ko cho phep sua mang hang
/*    public void setMahang(String mahang) {
        this.mahang = mahang;
    }*/


    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        if (tenhang.isEmpty() == true) {
            this.tenhang = "xxx";
        } else this.tenhang = tenhang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) this.donGia = donGia;
    }

    public LocalDate getNsx() {
        return nsx;
    }

    public void setNsx(LocalDate nsx) {
        this.nsx = nsx;
    }

    public LocalDate getHsd() {
        return hsd;
    }

    public void setHsd(LocalDate hsd) {
        this.hsd = hsd;
    }


    public boolean xetGhichu() {
        if (LocalDate.now().isAfter(hsd)) {
            return false;//het han
        } else {
            return true;
        }
    }


    @Override
    public String toString() {
        Ghichu = "";
        if (xetGhichu() == false) {
            Ghichu = "Hàng Hết Hạn";
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.00VND");
        String dg = df.format(donGia);


        return String.format("%-8s %-8s %20s %-15s %-15s %-15s", mahang, tenhang,dg, nsx.format(dtf), hsd.format(dtf), Ghichu);
    }



}
