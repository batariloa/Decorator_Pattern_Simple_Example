public class TomatoSauce extends  ToppingDecorator{

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", Tomato Sauce";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 0.50;
    }

}
