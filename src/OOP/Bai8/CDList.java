package OOP.Bai8;

import java.util.*;

public class CDList {
    private ArrayList<CD> cdList = new ArrayList<>();
    private int maximum;

    public CDList(int n) throws Exception {
        if (n > 0) {
            cdList.ensureCapacity(n);
            maximum = n;
        } else {
            throw new Exception("khong hop le");
        }
    }

    public boolean KttrungmaCD(CD cd) {
        for (int i = 0; i < cdList.size(); i++) {
            if (cd.getMaCD() == cdList.get(i).getMaCD()) {
                return true;
            }
        }
        return false;
    }

    public boolean addCD(CD cd) {
        if ((cdList.size() == maximum) || KttrungmaCD(cd) == true) {
            return false;
        } else {
            cdList.add(cd);
            return true;
        }
    }

    public int soluongCD() {
        return cdList.size();
    }

    public double tonggiathanh() {
        double tonggiathanh = 0.0;
        for (int i = 0; i < cdList.size(); i++) {
            tonggiathanh += cdList.get(i).getGiathanh();
        }
        return tonggiathanh;
    }

    @Override
    public String toString() {
        String thongtin = "";
        for (int i = 0; i < cdList.size(); i++) {
            thongtin += cdList.get(i).toString()+"\n";
        }
        return thongtin;
    }

    public void sapXepGiamDanGiaThanh() {
        cdList.sort((s1, s2) ->
        {
            if (s1.getGiathanh() > s2.getGiathanh()) {
                return -1;
            } else return 1;
        });
    }

    public void sapXepTangDanTheoTuaCD() {
        cdList.sort((s1, s2) ->
        {
            return s1.getTuaCD().compareTo(s2.getTuaCD());
        });
    }

}

