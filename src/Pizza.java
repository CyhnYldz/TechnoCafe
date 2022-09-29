public class Pizza extends CafeKitchen implements IFood {


    public Pizza(String name) {
        super(name);
    }
    void dough(){
        System.out.print("Roll out the dough");
    }
    void addIngredients(){
        System.out.print("Adding ingredients");
    }
    void bake(){
        System.out.print("Baking for perfect crispiness ");
    }


    @Override
    public double pric() {
        return 0;
    }
}
