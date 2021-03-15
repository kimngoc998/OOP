package OOP.Bai4;

import static java.lang.String.format;

public class Vehicle {
    private String ten, hieu;
    private long dungtich;
    private float trigia, thue;

    public Vehicle() {

    }

    public Vehicle(String ten, String hieu, long dungtich, float trigia) {
        this.ten = ten;
        this.hieu = hieu;
        this.dungtich = dungtich;
        this.trigia = trigia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHieu() {
        return hieu;
    }

    public void setHieu(String hieu) {
        this.hieu = hieu;
    }

    public long getDungtich() {
        return dungtich;
    }

    public void setDungtich(long dungtich) {
        this.dungtich = dungtich;
    }

    public float getTrigia() {
        return trigia;
    }

    public void setTrigia(float trigia) {
        if (trigia >= 0)
            this.trigia = trigia;
    }

    public float thue() {
        if (dungtich < 100l) {
            thue = (float) (trigia * 0.01);
        } else if (200l >= dungtich && dungtich >= 100l) {
            thue = (float) (trigia * 0.03);
        } else if (dungtich > 200l) {
            thue = (float) (trigia * 0.05);
        }
        return thue;
    }

    @Override
    public String toString() {
        String St = String.format("%-19s %-15s %10d %20.2f %20.2f", ten, hieu, dungtich, trigia, thue);
        return St;
    }
}


