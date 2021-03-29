package OOP.Bai8;

public class main {
    public static void main(String[] args) {
        CD cd1 = new CD(12345,10,"aaaaaa",500000);
        CD cd2 = new CD(12346,8,"bbbbbb",250000);
        CD cd3 = new CD(12347,10,"cccccc",400000);
        CD cd4 = new CD(12348,15,"dddddd",360000);
        CD cd5 = new CD(12349,9,"eeeeee",520000);
        CD cd6 = new CD(12350,10,"ffffff",340000);

        try {
            CDList list = new CDList(6);
            list.addCD(cd1);
            list.addCD(cd2);
            list.addCD(cd3);
            list.addCD(cd4);
            list.addCD(cd5);
            list.addCD(cd6);

            System.out.println(list.toString());
            System.out.println("So Luong CD: " + list.soluongCD());
            System.out.println("Tong Gia Thanh: " + list.tonggiathanh());
            System.out.println("=====================");
            list.sapXepGiamDanGiaThanh();
            System.out.println(list.toString());
            list.sapXepTangDanTheoTuaCD();
            System.out.println(list.toString());

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

