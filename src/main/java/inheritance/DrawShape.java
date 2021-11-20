package inheritance;

public class DrawShape {
    public static void main(String[] args) {
        Point [] points = {new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)};

        Triangle triangle = new Triangle(points);
        Circle circle = new Circle(new Point(150, 150), 50);

        triangle.draw();
        circle.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n",color);
    }
}

class Point {
    int x;
    int y;

    Point(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "("+x+", "+y+")";
    }
}

class Circle extends Shape {
    Point center;
    int radius;

    Circle() {
        this(new Point(), 100);
    }

    Circle(Point _center, int _radius) {
        this.center = _center;
        this.radius = _radius;
    }

    void draw() {
        System.out.printf("[center=(%d, %d), radius=%d, color=%s]%n",
                center.x, center.y, radius, color);
    }
}

class Triangle extends Shape {
    Point [] points = new Point[3];

    Triangle(Point[] _points) {
        this.points = _points;
    }

    void draw() {
        System.out.printf("[Point1=%s,Point2=%s,Point3=%s,color=%s]%n",
                points[0].getXY(), points[1].getXY(), points[2].getXY(), color);
    }

}