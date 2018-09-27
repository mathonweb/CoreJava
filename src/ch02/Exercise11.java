import static java.time.LocalDate.*;
import static java.lang.System.*;
import java.time.LocalDateTime;

public class Exercise11 {
    class Cal{
        Cal(){
            this(LocalDateTime.now());
        }
        Cal(LocalDateTime myDate){
            LocalDateTime date = LocalDateTime.of(myDate.getYear(),myDate.getMonth(),1,0,0);
            out.println(" Mon Tue Web Thu Fri Sat Sun");
            for(int i = 1; i < date.getDayOfWeek().getValue(); i++){
                out.print("    ");
            }
            int month = date.getMonth().getValue();
            while(date.getMonthValue() == month){
                out.printf("%4d", date.getDayOfMonth());
                date = date.plusDays(1);
                if(date.getDayOfWeek().getValue() == 1){
                    out.println();
                }
            }
        }
    }

    public static void main(String[] args){
        //Exercise #11
        out.println("Exercise #11");
        Cal calendar = new Exercise11().new Cal();

    }
}
