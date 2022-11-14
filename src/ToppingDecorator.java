public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;
    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;

    }

    @Override
    public double getPrice() {
        return tempPizza.getPrice();
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }
}
