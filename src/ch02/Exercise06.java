public class Exercise06 {
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

        public Point translate(double x, double y){
            XVal = x+getX();
            YVal = y+getY();
            return this;
        }

        public Point scale(double factor){
            XVal = factor*getX();
            YVal = factor*getY();
            return this;
        }
    }

    public static void main(String[] args){
        //Exercise #6
        System.out.println("Exercise #6");
        Point p = new Exercise06().new Point(3,4).translate(1,3).scale(0.5);
        System.out.println("Result = X:"+p.getX()+" y:"+p.getY());
    }
}
