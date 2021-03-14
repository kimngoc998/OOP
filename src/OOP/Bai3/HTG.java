package OOP.Bai3;

public class HTG {
    private int ma, mb, mc, Hinh;
    public String tgD, tgC, tgV, tgT, Ktg;

    public HTG() {
    }

    public HTG(int Hinh,int ma, int mb, int mc) {
        if ((ma <= 0 || mb <= 0 || mc <= 0) || (ma + mb < mc || mb + mc < ma || mc + ma < mb)) {
            this.Hinh = Hinh;
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } else {
            this.Hinh = Hinh;
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        this.mc = mc;
    }

    public String KTtg() {
        if (ma == 0 || mb == 0 || mc == 0) {
            Ktg = "khong phai tam giac";
            return Ktg;
        } else if ((ma == mb) && (mb == mc) && (mc == ma)) {
            tgD = "tam giac deu";
            return tgD;
        } else if ((ma == mb) || (mb == mc) || (mc == ma)) {
            tgC = "tam giac can";
            return tgC;
        } else if ((ma * ma == mb * mb + mc * mc) || (mb * mb == ma * ma + mc * mc) || (mc * mc == mb * mb + ma * ma)) {
            tgV = "tam giac vuong";
            return tgV;
        } else{
            if((ma + mb > mc) || (ma + mc > mb) || (mb + mc > ma)) {
                tgT = "tam giac thuong";
                return tgT;
            }
        }
        return null;
    }
    public int Chuvi(){
        int P = ma + mb + mc;
        return P;
    }

    public int Dientich(){
        int p = Chuvi()/2;
        int S =(int) Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
        return S;
    }

    @Override
    public String toString() {
        String in = String.format("%3d %4d %5d %5d %2s %-20s %3d %8d",Hinh,ma,mb,mc,"  ",KTtg(),Chuvi(),Dientich());
        return in;

    }
}

