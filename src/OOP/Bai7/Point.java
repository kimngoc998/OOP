package OOP.Bai7;

import java.text.DecimalFormat;

public class Point {
    private String name;
    private float x,y;

    public Point() {
    }

    public Point(float x, float y,String name) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        DecimalFormat df2 = new DecimalFormat("#");
        return name+"("+df2.format(x)+","+df2.format(y)+")";


    }
}
