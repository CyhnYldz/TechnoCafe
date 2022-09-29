import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CafeMain {
    public static void main(String[] args) {

        double bill= CafeKitchen.menuRun();

        for (IFood food:CafeKitchen.order){

            System.out.println(food);
        }
        LocalTime start=LocalTime.now();
        DateTimeFormatter z=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Order Time: "+LocalTime.now().format(z));
        System.out.println();
        System.out.println("Total Price: "+bill+"TL");
        System.out.println();
        System.out.println("We have started to prepare your order");

        for (IFood food:CafeKitchen.order){
            System.out.println();
            System.out.println(food);
            CafeKitchen.gettingReady(food);
        }
        LocalTime finish=LocalTime.now();
        Duration servTime=Duration.between(start,finish);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("ss");
        System.out.println("Serv Time : "+servTime.toSeconds()+" minutes");














    }
}
