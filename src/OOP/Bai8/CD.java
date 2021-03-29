package OOP.Bai8;

public class CD {
    private int maCD, Sobaihat;
    private String tuaCD;
    private double giathanh;

    public CD() {
        this.maCD = 999999;
        this.tuaCD = "chua xac dinh";
    }

    public CD(int maCD, int Sobaihat, String tuaCD, double giathanh) {
        if (maCD > 0) {
            this.maCD = maCD;
        }
        this.Sobaihat = Sobaihat;
        if (!tuaCD.trim().equals("")) {
            this.tuaCD = tuaCD;
        } else {
            this.tuaCD = "chua xac dinh";
        }
        if (giathanh > 0) {
            this.giathanh = giathanh;
        }else {
            giathanh = 0.0d;
        }
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public int getSobaihat() {
        return Sobaihat;
    }

    public void setSobaihat(int sobaihat) {
        Sobaihat = sobaihat;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public double getGiathanh() {
        return giathanh;
    }

    public void setGiathanh(double giathanh) {
        this.giathanh = giathanh;
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", Sobaihat=" + Sobaihat +
                ", tuaCD='" + tuaCD + '\'' +
                ", giathanh=" + giathanh +
                '}';
    }
}
