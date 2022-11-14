public class Main {
    public static void main(String[] args) {



        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Pizza description: "+ basicPizza.getDescription());
    }
}