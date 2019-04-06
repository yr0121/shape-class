// created by Yuanhao Ruan,ruanx054, student ID: 5085043 and Rex Zhu,zhu00100, student ID:5425680
// main method that draws the three shapes and displays their areas
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        // ask user to choose the shape they want to draw
        System.out.println("Enter the shape you want to draw");
        String s = scan.nextLine();
        // draw circle
        if (s.equals("circle")) {
            Canvas canvas = new Canvas();
            Color col = Color.BLUE;
            Circle c1 = new Circle(400, 400, 100);
            c1.setColor(col);
            double finalArea=fractal1(c1, canvas, 0);
            System.out.println("The final area of the circle is: "+finalArea);
        }

        //draw triangle
        if (s.equals("triangle")) {
            Canvas canvas = new Canvas();
            Color col = Color.BLUE;
            Triangle t1 = new Triangle(400, 400, 150, 150);
            t1.setColor(col);
            double finalArea=fractal2(t1, canvas, 0);
            System.out.println("The final area of the triangle is: "+finalArea);
        }

        // draw rectangle
        if (s.equals("rectangle")) {
            Canvas canvas = new Canvas();
            Color col = Color.BLUE;
            Rectangle r1 = new Rectangle(400, 400, 100, 80);
            r1.setColor(col);
            double finalArea=fractal3(r1, canvas, 0);
            System.out.println("The final area of the rectangle is: "+finalArea);
        }
    }
    // recursion draw circle
    public static double fractal1(Circle c1,Canvas canvas,int num) {
        double area=0.0;
        canvas.drawShape(c1);
        area+=c1.calculateArea();
        if (num == 7) {
            return area;
        }
        double x1 = c1.getXPos();
        double y1 = c1.getYPos();
        double r1 = c1.getRadius();
        double r2 = r1 / 2;
        double y2 = y1 + 1.5 * r1;
        double y3 = y1 - 1.5 * r1;
        double x2 = x1 + 1.5 * r1;
        double x3 = x1 - 1.5 * r1;

        c1 = new Circle(x1, y2, r2);
        Circle c2 = new Circle(x1, y3, r2);
        Circle c3 = new Circle(x2, y1, r2);
        Circle c4 = new Circle(x3, y1, r2);

        if (num < 7) {
            area += fractal1(c1, canvas, num + 1);
            area += fractal1(c2, canvas, num + 1);
            area += fractal1(c3, canvas, num + 1);
            area += fractal1(c4, canvas, num + 1);
        }
        if(num%3==0) {
            c1.setColor(Color.GREEN);
            c2.setColor(Color.GREEN);
            c3.setColor(Color.GREEN);
            c4.setColor(Color.GREEN);
        }else if(num%3==1){
            c1.setColor(Color.RED);
            c2.setColor(Color.RED);
            c3.setColor(Color.RED);
            c4.setColor(Color.RED);
        }else {
            c1.setColor(Color.BLUE);
            c2.setColor(Color.BLUE);
            c3.setColor(Color.BLUE);
            c4.setColor(Color.BLUE);
        }
        return area;
    }

    // recursion draw triangle
    public static double fractal2(Triangle t1,Canvas canvas,int num) {
        canvas.drawShape(t1);
        double area=0.0;
        area+=t1.calculateArea();
        if(num==7) {
            return area;
        }
        double x1=t1.getXPos();
        double y1=t1.getYPos();
        double w1=t1.getWidth();
        double h1=t1.getHeight();
        double w2=w1/2;
        double h2=h1/2;
        double x2=x1-w2;
        double x3=x1+w1;
        double x4=x1+w1/4;
        double y2=y1-h1;

        t1=new Triangle(x2,y1,w2,h2);
        Triangle t2=new Triangle(x3,y1,w2,h2);
        Triangle t3=new Triangle(x4,y2,w2,h2);

        if(num<7) {
            area +=fractal2(t1,canvas,num+1);
            area +=fractal2(t2,canvas,num+1);
            area +=fractal2(t3,canvas,num+1);
        }

        if(num%3==0) {
            t1.setColor(Color.GREEN);
            t2.setColor(Color.GREEN);
            t3.setColor(Color.GREEN);
        }else if(num%3==1){
            t1.setColor(Color.RED);
            t2.setColor(Color.RED);
            t3.setColor(Color.RED);
        }else {
            t1.setColor(Color.BLUE);
            t2.setColor(Color.BLUE);
            t3.setColor(Color.BLUE);
        }
        return area;
    }
    // recursion draw rectangle
    public static double fractal3(Rectangle r1,Canvas canvas,int num) {
        canvas.drawShape(r1);
        double area=0.0;
        area +=r1.calculateArea();
        if(num==7) {
            return area;
        }
        double x1=r1.getXPos();
        double y1=r1.getYPos();
        double w1=r1.getWidth();
        double h1=r1.getHeight();
        double w2=w1/2;
        double h2=h1/2;
        double x2=x1-w2;
        double x3=x1+w1;
        double y2=y1-h2;
        double y3=y1+h1;

        r1=new Rectangle(x2,y2,w2,h2);
        Rectangle r2=new Rectangle(x2,y3,w2,h2);
        Rectangle r3=new Rectangle(x3,y2,w2,h2);
        Rectangle r4=new Rectangle(x3,y3,w2,h2);

        if(num<7) {
            area+=fractal3(r1,canvas,num+1);
            area+=fractal3(r2,canvas,num+1);
            area+=fractal3(r3,canvas,num+1);
            area+=fractal3(r4,canvas,num+1);
        }
        if(num%3==0) {
            r1.setColor(Color.GREEN);
            r2.setColor(Color.GREEN);
            r3.setColor(Color.GREEN);
            r4.setColor(Color.GREEN);
        }else if(num%3==1){
            r1.setColor(Color.RED);
            r2.setColor(Color.RED);
            r3.setColor(Color.RED);
            r4.setColor(Color.RED);
        }else {
            r1.setColor(Color.BLUE);
            r2.setColor(Color.BLUE);
            r3.setColor(Color.BLUE);
            r4.setColor(Color.BLUE);
        }
        return area;
    }
}
