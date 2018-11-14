package ch04;

enum Colors {BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE};

public class Exercise07 {
    public static void main(String[] args) {
        //Exercise #7
        System.out.println("Exercise #7");

        System.out.println("Get Red Color:"+getRed());
        System.out.println("Get Green Color:"+getGreen());
        System.out.println("Get Blue Color:"+getBlue());
    }

    static public Colors getRed() {
        return Colors.RED;
    }

    static public Colors getGreen() {
        return Colors.GREEN;
    }

    static public Colors getBlue() {
        return Colors.BLUE;
    }
}
