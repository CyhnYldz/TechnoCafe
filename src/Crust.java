public enum Crust {

    STANDART("Standart Crust",0),
    THICK("Thick Crust",5),
    THIN("Thin Crust",5),
    PARMESAN("Crust with Parmesan",10),
    BUTTER("Crust with Butter",7.5);
    String doughName;
    double doughAddPrice;


    Crust(String doughName, double doughAddPrice) {
        this.doughName = doughName;
        this.doughAddPrice = doughAddPrice;
    }


}
