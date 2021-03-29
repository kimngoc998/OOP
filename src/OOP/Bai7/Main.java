package OOP.Bai7;


public class Main {
    public static void main(String[] args) {
        Point tam = new Point(5, 5, "O");
        Circle circle = new Circle(tam, 10.5);
        System.out.println(circle.toString());
    }
}
