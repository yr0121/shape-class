// created by Yuanhao Ruan,ruanx054, student ID: 5085043 and Rex Zhu,zhu00100, student ID:5425680
// circle class
import java.awt.*;
public class Circle {
    private double x_pos;
    private double y_pos;
    private double radius;
    private Color color;

    public Circle(double x_pos,double y_pos,double radius) {
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        this.radius=radius;
    }

    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    public void setColor(Color color) {
        this.color=color;
    }

    public void setPos(double x_pos,double y_pos) {
        this.x_pos=x_pos;
        this.y_pos=y_pos;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return x_pos;
    }

    public double getYPos() {
        return y_pos;
    }

    public double getRadius() {
        return radius;
    }
}
