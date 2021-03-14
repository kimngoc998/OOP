package OOP.Bai2;

public class Student {
    private int msv;
    private float LT, TH, DTB;
    private String name;

    public Student() {
    }

    public Student(int msv, String name, float LT, float TH) {
        this.msv = msv;
        this.LT = LT;
        this.TH = TH;
        this.name = name;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public float getLT() {
        return LT;
    }

    public void setLT(float LT) {
        if(LT>=0 && LT <= 10)
            this.LT = LT;
        else this.LT = 0;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        if(TH>=0 && TH <= 10)
            this.TH = TH;
        else this.TH = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public float getDTB() {
        return (TH + LT)/2;
    }

    @Override
    public String toString() {
        String sv = String.format("%-5d %-20s %8.2f %8.2f %8.2f",msv,name,LT,TH,getDTB());
        return sv;
    }
}
