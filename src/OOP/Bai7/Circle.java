package OOP.Bai7;


import java.text.DecimalFormat;

public class Circle {
    private Point Tam;
    private double R; // ban kinh

    public Circle() {
        Tam = new Point();
        R = 0.0;
    }

    public Circle(Point Tam, double R) {
        this.Tam = Tam;
        this.R = R;
    }

    public Point getTam() {
        return Tam;
    }

    public void setTam(Point tam) {
        Tam = tam;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double dientich(){
        return Math.PI * R * R;
    }

    public double chuvi(){
        return 2.0 * R * Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df1 = new DecimalFormat("#.000");
        return "Hình tròn có tâm "+ Tam.toString() +" với bán kính " + R + " có diện tích và chu vi lần lượt là "+ df1.format(dientich())+" và " + df1.format(chuvi());
    }
}
