public enum Size {

    SLICE("Slice",0.3),
    SMALL("Small",1),
    MEDIUM("Medium",1.25),
    LARGE("Large",1.5);

    String sizeName;
    double sizeAddPriceRatio;


    Size(String sizeName, double sizeAddPrice) {
        this.sizeName = sizeName;
        this.sizeAddPriceRatio = sizeAddPrice;
    }
}
