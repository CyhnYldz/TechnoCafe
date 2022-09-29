import java.util.ArrayList;
import java.util.List;

public class CafeKitchen implements IFood {

    private String name;
    private int time;
    private double price;
    double sum;

    static List<IFood> order = new ArrayList<>();

    public CafeKitchen(String name) {
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public static double menuRun() {
        int mainchoice = 0;
        int subChoice = 0;
        double sum = 0;

        do {
            Menu.menu();
            mainchoice = Menu.menuScan();
            switch (mainchoice) {
                case 1:
                    Menu.pizzaMenu();
                    subChoice = Menu.menuScan();
                    switch (subChoice) {
                        case 1:
                            IFood margaritaPizza = new Pizza(FoodEnum.MARGARITA.name);
                            order.add(margaritaPizza);sum+=FoodEnum.MARGARITA.price;
                            break;
                        case 2:
                            IFood kebabPizza = new Pizza(FoodEnum.KEBAB.name);
                            order.add(kebabPizza);sum+=FoodEnum.KEBAB.price;
                            break;
                        case 3:
                            IFood hawaiiPizza = new Pizza(FoodEnum.HAWAIIAN.name);
                            order.add(hawaiiPizza);sum+=FoodEnum.HAWAIIAN.price;
                            break;
                        case 4:
                            menuRun();
                            break;
                    }
                    break;
                case 2:
                    Menu.soupMenu();
                    subChoice = Menu.menuScan();
                    switch (subChoice) {
                        case 1:
                            IFood chickenSoup = new Soup(FoodEnum.CHSOUP.name);
                            order.add(chickenSoup);sum+=FoodEnum.CHSOUP.price;
                            break;
                        case 2:
                            IFood fishSoup = new Soup(FoodEnum.FISOUP.name);
                            order.add(fishSoup);sum+=FoodEnum.FISOUP.price;
                            break;
                        case 3:
                            IFood meetBallSoup = new Soup(FoodEnum.MBSOUP.name);
                            order.add(meetBallSoup);sum+=FoodEnum.MBSOUP.price;
                            break;
                        case 4:
                            menuRun();
                            break;
                    }
                    break;
                case 3:
                    Menu.saladMenu();
                    subChoice = Menu.menuScan();
                    switch (subChoice) {
                        case 1:
                            IFood tomatoAndAvocadoSalad = new Salad(FoodEnum.TASALAD.name);
                            order.add(tomatoAndAvocadoSalad);sum+=FoodEnum.TASALAD.price;
                            break;
                        case 2:
                            IFood chimichurriPotatoSalad = new Salad(FoodEnum.CPSALAD.name);
                            order.add(chimichurriPotatoSalad);sum+=FoodEnum.CPSALAD.price;
                            break;
                        case 3:
                            IFood caesarSalad = new Salad(FoodEnum.SZSALAD.name);
                            order.add(caesarSalad);sum+=FoodEnum.SZSALAD.price;
                            break;
                        case 4:
                            menuRun();
                            break;
                    }
                    break;
                case 4:
                    Menu.sandwichMenu();
                    subChoice = Menu.menuScan();
                    switch (subChoice) {
                        case 1:
                            IFood hotDog = new Sandwich(FoodEnum.HDSANDW.name);
                            order.add(hotDog);sum+=FoodEnum.HDSANDW.price;
                            break;
                        case 2:
                            IFood SalmonFFsandwich = new Sandwich(FoodEnum.SFFSANDW.name);
                            order.add(SalmonFFsandwich);sum+=FoodEnum.SFFSANDW.price;
                            break;
                        case 3:
                            IFood RoastBeefSandwich = new Sandwich(FoodEnum.RBSANDW.name);
                            order.add(RoastBeefSandwich);sum+=FoodEnum.RBSANDW.price;
                            break;
                        case 4:
                            menuRun();
                            break;
                    }
                    break;
                case 5:
                    Menu.drinkMenu();
                    subChoice = Menu.menuScan();
                    switch (subChoice) {
                        case 1:
                            IFood cola = new Drink(FoodEnum.COLA.name);
                            order.add(cola);sum+=FoodEnum.COLA.price;
                            break;
                        case 2:
                            IFood soda = new Drink(FoodEnum.SODA.name);
                            order.add(soda);sum+=FoodEnum.SODA.price;
                            break;
                        case 3:
                            IFood tea = new Drink(FoodEnum.TEA.name);
                            order.add(tea);sum+=FoodEnum.TEA.price;
                            break;
                        case 4:
                            IFood coffee = new Drink(FoodEnum.COFFEE.name);
                            order.add(coffee);sum+=FoodEnum.COFFEE.price;
                            break;
                        case 5:
                            IFood water = new Drink(FoodEnum.WATER.name);
                            order.add(water);sum+=FoodEnum.WATER.price;
                            break;
                        case 6:
                            menuRun();
                            break;

                    }
                case 6:


                    break;

            }

        } while (mainchoice != 6);
        return sum;
    }

    public static void gettingReady(IFood food) {
        if (food instanceof Pizza) {
            ((Pizza) food).dough();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
                ((Pizza) food).addIngredients();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();

                ((Pizza) food).bake();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();

        }
        if (food instanceof Salad) {
           ((Salad) food).chop();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
            ((Salad) food).oil();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
        }
        if (food instanceof Soup){
            ((Soup) food).addspice();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
            ((Soup) food).ready();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
        }
        if (food instanceof Sandwich){
            ((Sandwich) food).bread();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
            ((Sandwich) food).place();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
        }
        if (food instanceof Drink){
            ((Drink) food).pour();
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Time.Bekle(1);
            }
            System.out.println();
        }

    }
            @Override
            public String toString () {
                return
                        name ;
            }


            @Override
            public double pric () {
                return 0;
            }
        }
