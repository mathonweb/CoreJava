import java.util.Scanner;

public class Trip_planner {
    public static void main(String[] args) {
//        System.out.println("Welcome to Vacation Planner");
//        System.out.println("What is your name?");
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        // System.out.println(name);
//        System.out.println("Nice to meet you "+name+ ", where are you travelling to?");
//        String city = input.nextLine();
//        System.out.println("Great! "+city+" sounds like a great trip");
//
//        System.out.println("How many days are you going to spend travelling?");
//        int spendingDaysNb = input.nextInt();
//        System.out.println("How much money, in USD, are you planning to spend on your trip?");
//        int spendingMoney = input.nextInt();
//        System.out.println("What is the three letter currency symbol for your travel destination?");
//        String currencySymbol = input.next();
//        System.out.println("How many "+currencySymbol+" are there in 1 USD?");
//        double currencyVal = input.nextDouble();
//
//        int spendingHours = spendingDaysNb * 24;
//        int spendingMinutes = spendingHours * 60;
//        System.out.println("If you are travelling for "+spendingDaysNb+" that is the same as "+spendingHours+" hours or "+spendingMinutes+" minutes");
//        double spendingMoneyPerDay = (((double)spendingMoney / spendingDaysNb)*100)/100.0;
//        System.out.println("If you are going to spend $"+spendingMoney+" USD that means per day you can spend up to $"+spendingMoneyPerDay+" USD");
//        double spendingMoneyForeign = spendingMoney * currencyVal;
//        double spendingMoneyForeignPerDay = (int)((spendingMoneyForeign / spendingDaysNb)*100)/100.0;
//        System.out.println("Your total budget in "+currencySymbol+" is " +spendingMoneyForeign+" "+currencySymbol+", which per day is "+spendingMoneyForeignPerDay+" "+currencySymbol);
//
//        System.out.println("What is the time difference, in hours, between you home and your destination?");
//        int timeDiff = input.nextInt();
//        timeCalc(timeDiff);
//
//        System.out.println("What is the square area of your destination country in km2?");
//        int squareAreaKm2 = input.nextInt();
//        countryAreaMile(squareAreaKm2);

        Trip_details trip = new Trip_details();
        trip.print();
        trip.print();
        Trip_details trip2 = new Trip_details();
        trip2.print();
        trip2.print();

    }

    public static void timeCalc(int timeDiff) {
        String midnightTime;
        String noonTime;
        if(timeDiff < 0) {
            midnightTime = (24 + timeDiff%24)+":00";

        } else {
            midnightTime = (timeDiff%24)+":00";
        }
        if(timeDiff < -12) {
            noonTime = (24 + (timeDiff % 24 + 12)) + ":00";
        } else {
            noonTime = (12 + timeDiff%24)+":00";
        }

        System.out.println("That means that when it is midnight at home it will be "+midnightTime+" in your travel destination");
        System.out.println("and when it is noon at home it will be "+noonTime);
    }

    public static void countryAreaMile(int squareAreaKm2) {
        double squareAreaMi2 = 0.0;
        squareAreaMi2 = (int)((squareAreaKm2*0.386102)*10)/10.0;
        System.out.println("In mile2 that is "+squareAreaMi2);
    }
}

