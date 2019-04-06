// created by Yuanhao Ruan,ruanx054, student ID: 5085043 and Rex Zhu,zhu00100, student ID:5425680
// rectangle class
import java.awt.*;
public class Rectangle {
    private double x_pos;
    private double y_pos;
    private double height;
    private double width;
    private Color color;

    public Rectangle(double x_pos,double y_pos,double width,double height) {
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        this.width=width;
        this.height=height;
    }

    public double calculatePerimeter() {
        return 2*height+2*width;
    }

    public double calculateArea() {
        return width*height;
    }

    public void setColor(Color color) {
        this.color=color;
    }

    public void setPos(double x_pos,double y_pos) {
        this.x_pos=x_pos;
        this.y_pos=y_pos;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    public void setWidth(double width) {
        this.width = width;
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

    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
    	return width;
    }

    public double getX_pos() {
        return x_pos;
    }
}

