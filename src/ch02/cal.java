import java.time.LocalDate;

public class cal {
    class Cal{
        Cal(){
            this(LocalDate.now());
        }
        Cal(LocalDate myDate){
            LocalDate date = LocalDate.of(myDate.getYear(),myDate.getMonth(),1);
            System.out.println(" Mon Tue Web Thu Fri Sat Sun");
            for(int i = 1; i < date.getDayOfWeek().getValue(); i++){
                System.out.print("    ");
            }
            int month = date.getMonth().getValue();
            while(date.getMonthValue() == month){
                System.out.printf("%4d", date.getDayOfMonth());
                date = date.plusDays(1);
                if(date.getDayOfWeek().getValue() == 1){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args){
        //Exercise #11
        System.out.println("Exercise #11");
        Cal calendar = new cal().new Cal();
    }

}
