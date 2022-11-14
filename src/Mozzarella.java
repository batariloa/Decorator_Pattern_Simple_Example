public class Mozzarella extends  ToppingDecorator{
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getPrice() {
        return super.getPrice() +  1.20;
    }


}
