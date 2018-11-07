package ch04;

import java.util.Objects;

public class Exercise01 {
    public static void main(String[] args) {
        //Exercise #1
        System.out.println("Exercise #1");
        //Exercise #2
        System.out.println("Exercise #2");

        // Test toString
        LabeledPoint coord = new LabeledPoint("left", -1, 0);
        System.out.println("First coord = " + coord.toString());

        // Test equals
        System.out.println("Is it equal ? = " + coord.equals(0, 0));

        // Test hashcode
        System.out.println("Hash number = " + coord.hashcode());

        //Exercise #3
        System.out.println("Exercise #3");
        System.out.println("Coord X = " + coord.getX());

    }
}


class Point {
    protected double x;
    protected double y;

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

    public String toString(){
        return "" + getX() + ", " + getY();
    }

    public boolean equals(double x, double y){
        if (this.getX() == x && this.getY() == y) return true;
        else return false;
    }

    public int hashcode(){
        return Objects.hash(getX(), getY(), this.label);
    }
}
