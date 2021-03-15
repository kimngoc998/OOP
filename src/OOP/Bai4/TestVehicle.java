package OOP.Bai4;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Nguyễn Thu Loan","Future Neo",100,35000000);
        Vehicle v2 = new Vehicle("Lê Minh Tính","Ford Ranger", 3000,250000000);
        Vehicle v3 = new Vehicle("Nguyễn Minh Triết","LandScape", 1500,1000000000);

        String fl = String.format("%-19s %-15s %10s %20s %20s","Tên chủ xe","Loại xe","Dung Tích","Trị giá","Thuế phải nộp");

        System.out.println(fl);
        System.out.println("========================================================================================");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());


    }
}
