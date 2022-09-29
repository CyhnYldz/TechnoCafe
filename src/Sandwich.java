public class Sandwich extends CafeKitchen{
    public Sandwich(String name) {
        super(name);
    }
    void bread(){
        System.out.print("Cutting the bread");
    }
    void place(){
        System.out.print("Placing the ingredients");
    }
}
