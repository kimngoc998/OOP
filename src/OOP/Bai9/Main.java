package OOP.Bai9;

public class Main {
    public static void main(String[] args) {
        CongNhan cn1 = new CongNhan(1,"ng","la",300);
        CongNhan cn2 = new CongNhan(2,"ho","thi",250);
        CongNhan cn3 = new CongNhan(3,"thi","thuy",200);
        CongNhan cn4 = new CongNhan(4,"phan","linh",199);
        CongNhan cn5 = new CongNhan(5,"thanh","binh",460);

        try{
            DanhSachCongNhan danhSachCongNhan = new DanhSachCongNhan(20);
            danhSachCongNhan.add(cn1);
            danhSachCongNhan.add(cn2);
            danhSachCongNhan.add(cn3);
            danhSachCongNhan.add(cn4);
            danhSachCongNhan.add(cn5);

            System.out.println(danhSachCongNhan.toString());
            System.out.println("so luong cong nhan vien: " + danhSachCongNhan.soluongCN());
            System.out.println("==================================================");
            System.out.println("cong nhan vien tren 200 SP");
            danhSachCongNhan.cntren200sp();
            System.out.println("==================================================");
            danhSachCongNhan.sapxepSPgiamdan();
            System.out.println(danhSachCongNhan);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
