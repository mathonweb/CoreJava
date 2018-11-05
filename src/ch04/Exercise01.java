package ch04;

public class Exercise01 {
    public static void main(String[] args) {
        //Exercise #1
        System.out.println("Exercise #1");
    }
}


class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
}

class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y){
        super(x,y);
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
}
