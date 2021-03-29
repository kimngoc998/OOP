package OOP.Bai9;

import java.util.ArrayList;

public class DanhSachCongNhan {
    private static ArrayList<CongNhan> dsCN = new ArrayList<>();
    private int maximum;

    public DanhSachCongNhan(int n) throws Exception{
        if(n > 0){
            dsCN.ensureCapacity(n);
            maximum = n;
        }else {
            System.out.println("khong hop le");
        }
    }

    public boolean add(CongNhan cn){
        if(dsCN.size() == maximum){
            return false;
        }else {
            dsCN.add(cn);
            return true;
        }
    }

    @Override
    public String toString() {
        String thongtin = "";
        for (CongNhan cn : dsCN) {
            thongtin += cn.toString() + "\n";
        }
        return thongtin;
    }
    public void cntren200sp(){
        for(CongNhan cn : dsCN){
            if(cn.getMaSoSP() > 200){
                System.out.println(cn);
            }
        }
    }

    public void sapxepSPgiamdan(){
        dsCN.sort((c1,c2) ->{
            if(c1.getMaSoSP() > c2.getMaSoSP()){
                return -1;
            }else return 1;
        });
    }

    public int soluongCN(){
        return dsCN.size();
    }


}
