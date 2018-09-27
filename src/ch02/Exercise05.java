/**
 @author Mathieu Guilbault
 */

public class Exercise05 {

    class Point {

        private double XVal;
        private double YVal;

        Point(){
            this.XVal = 0;
            this.YVal = 0;
        }

        Point(double x, double y){
            this.XVal = x;
            this.YVal = y;
        }

        double getX(){
            return this.XVal;
        }

        double getY()
        {
            return this.YVal;
        }

        Point translate(double x, double y){
            Point newPoint = new Point(x+getX(), y+getY());
            return newPoint;
        }

        Point scale(double factor){
            Point newPoint = new Point(factor*getX(), factor*getY());
            return newPoint;
        }
    }

    public static void main(String[] args){
        //Exercise #5
        System.out.println("Exercise #5");
        Point p = new Exercise05().new Point(3,4);
        p = p.translate(1,3).scale(0.5);
        System.out.println("Result = X:"+p.getX()+" y:"+p.getY());
    }
}
