package OOP.Bai9;

public class CongNhan {
    private int maCN, maSoSP;
    private String mHo, mTen;

    public CongNhan() {
    }

    public CongNhan(int maCN, String mHo, String mTen, int maSoSP) {
        this.maCN = maCN;
        if (maSoSP > 0) {
            this.maSoSP = maSoSP;
        }
        this.mHo = mHo;
        this.mTen = mTen;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public int getMaSoSP() {
        return maSoSP;
    }

    public void setMaSoSP(int maSoSP) {
        if (maSoSP > 0) {
            this.maSoSP = maSoSP;
        }
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public double luong(){
        double dongia;
        if(maSoSP > 0 && maSoSP <= 199){
            dongia  = 0.5;
        }else if (maSoSP > 199 && maSoSP <= 399){
            dongia = 0.55;
        }else if(maSoSP > 399 && maSoSP <= 599){
            dongia = 0.6;
        }else dongia = 0.65;
        return maSoSP * dongia;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "maCN=" + maCN +
                ", maSoSP=" + maSoSP +
                ", mHo='" + mHo + '\'' +
                ", mTen='" + mTen + '\'' +
                '}';
    }
}
