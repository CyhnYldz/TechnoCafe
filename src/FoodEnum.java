import java.time.LocalTime;

public enum FoodEnum {

    MARGARITA("Margarita Pizza",50),
    KEBAB("Kebab Pizza",75),
    HAWAIIAN("Hawaiian Pizza",60),
    CHSOUP("Chicken Soup",30),
    FISOUP("Fish Soup",55),
    MBSOUP("Meatball Soup",35),
    TASALAD("Tomato & Avocado Salad",40),
    CPSALAD("Chimichurri Potato Salad",50),
    SZSALAD("Caesar Salad",30),
    HDSANDW("HotDog",25),
    SFFSANDW("Salmon fish finger sandwich",40),
    RBSANDW("Roast Beef Sandwich",50),
    COLA("CocaCola",10),
    SODA("Soda",7.5),
    TEA("Tea",10),
    COFFEE("Coffee",10),
    WATER("Water",5);

      String name;
      double price;
      int time;

    FoodEnum(String name, double price){
        this.name=name;
        this.price=price;
        this.time=time;
    }

}
