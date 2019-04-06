// created by Yuanhao Ruan,ruanx054, student ID: 5085043 and Rex Zhu,zhu00100, student ID:5425680
// Triangle class
import java.awt.*;
public class Triangle {
    private double x_pos;
    private double y_pos;
    private double height;
    private double width;
    private Color color;

    public Triangle(double x_pos,double y_pos,double width,double height) {
        this.x_pos=x_pos;
        this.y_pos=y_pos;
        this.width=width;
        this.height=height;
    }

    public double calculatePerimeter() {
        double side=Math.sqrt((Math.pow(height,2)+Math.pow((width/2),2)));
        return 2*side+width;
    }

    public double calculateArea() {
        return 0.5*width*height;
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

}
