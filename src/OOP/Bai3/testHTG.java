package OOP.Bai3;

public class testHTG {
    public static void main(String[] args) {
        HTG h1 = new HTG(1,1,-3,4);
        HTG h2 = new HTG(2,5,1,3);
        HTG h3 = new HTG(3,9,9,9);//deu
        HTG h4 = new HTG(4,4,4,6);//Can
        HTG h5 = new HTG(5,8,4,7);//thuong

        String fl = String.format("%-5s %-5s %-5s %-5s %-19s %-6s %-9s","Hinh:","ma:","mb:","mc:","KT-hinh:","Chuvi:","Dientich:");
        System.out.println(fl);
        System.out.println("=============================================================");
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());



    }
}
