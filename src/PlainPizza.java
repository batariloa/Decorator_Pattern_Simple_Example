public class PlainPizza implements Pizza {

    @Override
    public double getPrice() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "Thin dough";
    }
}
