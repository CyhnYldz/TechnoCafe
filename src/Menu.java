import java.util.Scanner;

public class Menu {




    public static void menu(){
        System.out.println("*****MENU*****");
        System.out.println("1-Pizzas");
        System.out.println("2-Soups");
        System.out.println("3-Salads");
        System.out.println("4-Sandwiches");
        System.out.println("5-Drinks");
        System.out.println("6-End Order");
        System.out.print("Please Enter Your Choice: ");
    }

    public static void pizzaMenu(){
        System.out.println("***PIZZA MENU***");
        System.out.println("1-"+FoodEnum.MARGARITA.name+" : "+FoodEnum.MARGARITA.price+"TL");
        System.out.println("2-"+FoodEnum.KEBAB.name+" : "+FoodEnum.KEBAB.price+"TL");
        System.out.println("3-"+FoodEnum.HAWAIIAN.name+" : "+FoodEnum.HAWAIIAN.price+"TL");
        System.out.println("4-Main Menu");
        System.out.print("Please Enter Your Choice: ");
    }
//    public static void pizzaCrustMenu(){
//        System.out.println("1-"+Crust.STANDART.doughName);
//        System.out.println("2-"+Crust.THICK.doughName+" : "+Crust.THICK.doughAddPrice+"TL");
//        System.out.println("3-"+Crust.THIN.doughName+" : "+Crust.THIN.doughAddPrice+"TL");
//        System.out.println("4-"+Crust.PARMESAN.doughName+" : "+Crust.PARMESAN.doughAddPrice+"TL");
//        System.out.println("5-"+Crust.BUTTER.doughName+" : "+Crust.BUTTER.doughAddPrice+"TL");
//        System.out.print("Select Your Choice of Crust: ");
//    }
//    public static void pizzaSizeMenu() {
//        System.out.println("1-"+Size.SLICE.sizeName);
//        System.out.println("2-"+Size.SMALL.sizeName + " : " + Size.SMALL.sizeAddPriceRatio + "TL");
//        System.out.println("3-"+Size.MEDIUM.sizeName + " : " + Size.MEDIUM.sizeAddPriceRatio + "TL");
//        System.out.println("4-"+Size.LARGE.sizeName + " : " + Size.LARGE.sizeAddPriceRatio + "TL");
//        System.out.print("Select Your Choice of Crust: ");
//    }

    public static void soupMenu(){
        System.out.println("***SOUP MENU***");
        System.out.println("1-"+FoodEnum.CHSOUP.name+" : "+FoodEnum.CHSOUP.price+"TL");
        System.out.println("2-"+FoodEnum.FISOUP.name+" : "+FoodEnum.FISOUP.price+"TL");
        System.out.println("3-"+FoodEnum.MBSOUP.name+" : "+FoodEnum.MBSOUP.price+"TL");
        System.out.println("4-Main Menu");
        System.out.print("Please Enter Your Choice: ");
    }
    public static void saladMenu(){
        System.out.println("***SALAD MENU***");
        System.out.println("1-"+FoodEnum.TASALAD.name+" : "+FoodEnum.TASALAD.price+"TL");
        System.out.println("2-"+FoodEnum.CPSALAD.name+" : "+FoodEnum.CPSALAD.price+"TL");
        System.out.println("3-"+FoodEnum.SZSALAD.name+" : "+FoodEnum.SZSALAD.price+"TL");
        System.out.println("4-Main Menu");
        System.out.print("Please Enter Your Choice: ");
    }
    public static void sandwichMenu(){
        System.out.println("***SANDWICH MENU***");
        System.out.println("1-"+FoodEnum.HDSANDW.name+" : "+FoodEnum.HDSANDW.price+"TL");
        System.out.println("2-"+FoodEnum.SFFSANDW.name+" : "+FoodEnum.SFFSANDW.price+"TL");
        System.out.println("3-"+FoodEnum.RBSANDW.name+" : "+FoodEnum.RBSANDW.price+"TL");
        System.out.println("4-Main Menu");
        System.out.print("Please Enter Your Choice: ");
    }
    public static void drinkMenu(){
        System.out.println("***DRINK MENU***");
        System.out.println("1-"+FoodEnum.COLA.name+" : "+FoodEnum.COLA.price+"TL");
        System.out.println("2-"+FoodEnum.SODA.name+" : "+FoodEnum.SODA.price+"TL");
        System.out.println("3-"+FoodEnum.TEA.name+" : "+FoodEnum.TEA.price+"TL");
        System.out.println("4-"+FoodEnum.COFFEE.name+" : "+FoodEnum.COFFEE.price+"TL");
        System.out.println("5-"+FoodEnum.WATER.name+" : "+FoodEnum.WATER.price+"TL");
        System.out.println("6-Main Menu");
        System.out.print("Please Enter Your Choice: ");
    }
    public static int menuScan(){
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        return choice;
    }
}
