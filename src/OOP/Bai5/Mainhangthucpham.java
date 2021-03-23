package OOP.Bai5;

import java.time.LocalDate;

public class Mainhangthucpham {
    public static void main(String[] args) {
        Hangthucpham vd1 = new Hangthucpham("001","Gạo",100000, LocalDate.of(2018,7,10),LocalDate.of(2018,7,10));
        Hangthucpham vd2 = new Hangthucpham("002","Mì",5000, LocalDate.of(2018,3,1),LocalDate.of(2018,9,1));
        Hangthucpham vd3 = new Hangthucpham("003","Nước",10000, LocalDate.of(2017,3,1),LocalDate.of(2018,3,1));
        String fl = String.format("%-8s %-8s %20s %-15s %-15s %-15s","Mã_Hàng","Tên_Hàng","Đơn_Giá","Ngày_Sản_Xuất","Ngày_Hết_Hạn","Ghi_Chú");
        System.out.println(fl);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(vd1.toString());
        System.out.println(vd2.toString());
        System.out.println(vd3.toString());
    }
}