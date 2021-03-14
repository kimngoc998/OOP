package OOP.Bai2;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        String fl = String.format("%-5s %-20s %8s %8s %8s","MSV","Name","DiemLT","DiemTH","DiemTB");

        Student st1 = new Student(1,"qaz",5.0f,4.0f);
        Student st2 = new Student(2,"wsx",1.5f,6.8f);

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap msv sv3: ");
        int msv = sc.nextInt();

        sc.nextLine();
        System.out.println("nhap hoten sv3: ");
        String name = sc.nextLine();

        System.out.println("nhap DiemLT sv3: ");
        float LT = sc.nextFloat();

        System.out.println("nhap DiemTH sv3: ");
        float TH = sc.nextFloat();


        Student st3 = new Student();
        st3.setMsv(msv);
        st3.setName(name);
        st3.setLT(LT);
        st3.setTH(TH);


        System.out.println(fl);
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());


    }

}
