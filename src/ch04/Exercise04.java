package ch04;

public class Exercise04 {
    public static void main(String[] args) {
        //Exercise #4
        System.out.println("Exercise #4");

        Point centerCoord = new Point(2,4);
        Circle circleObject = new Circle(centerCoord,2.0);
        System.out.println("Center of circle = " + circleObject.getCenter().x + "," + circleObject.getCenter().y);

        Point topLeftCoord = new Point(0,5);
        Rectangle rectangleObject = new Rectangle(topLeftCoord,10,4);
        System.out.println("Center of rectangle = " + rectangleObject.getCenter().x + "," + rectangleObject.getCenter().y);

        Point fromCoord = new Point(3,4);
        Point toCoord = new Point(-4,3);
        Line lineObject =  new Line(fromCoord,toCoord);
        System.out.println("Center of line = " + lineObject.getCenter().x + "," + lineObject.getCenter().y);

        //Exercise #5
        System.out.println("Exercise #5");

        Line lineObject2 = lineObject.clone();
        // Modify "to" coordinate of lineObject
        Point toCoord2 = new Point(-1,1);
        lineObject.setCenter(fromCoord, toCoord2);
        System.out.println("Center of line = " + lineObject.getCenter().x + "," + lineObject.getCenter().y);
        System.out.println("Center of line 2 = " + lineObject2.getCenter().x + "," + lineObject2.getCenter().y);


    }
}

abstract class Shape {

    protected Point center = new Point(0,0);

    public Shape(double x, double y) {
        center.x = x;
        center.y = y;
    }

    public void moveBy(double dx, double dy) {
        center.x = center.getX() + dx;
        center.y = center.getY() + dy;
    }

    public abstract Point getCenter();

}

class Circle extends Shape {

    public Circle(Point center, double radius) {
        super(center.x,center.y);
    }

    @Override
    public Point getCenter() {
        return center;
    }
}

class Rectangle extends Shape {

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft.x + width / 2, topLeft.y - height / 2);
    }

    @Override
    public Point getCenter() {
        return center;
    }
}

class Line extends Shape {
    public Point from;
    public Point to;

    public Line(Point from, Point to) {
        super(from.x+(to.x-from.x)/2, from.y+(to.y-from.y)/2);
        this.from = from;
        this.to = to;
    }

    public void setCenter(Point from, Point to) {
        center.x = from.x+(to.x-from.x)/2;
        center.y = from.y+(to.y-from.y)/2;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Line clone(){
        Line cloned = new Line(from, to);
        return cloned;
    }
}
