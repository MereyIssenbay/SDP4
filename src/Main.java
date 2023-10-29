public class Main {
    public static void main(String[] args) {
        JerseyFactory factory1 = new AdidasJerseyFactory();
        JerseyFactory factory2 = new NikeJerseyFactory();

        JerseyShop shop = new JerseyShop();

        Barcelona barcelona = new Barcelona();
        RealMadrid realMadrid = new RealMadrid();

        Jersey jersey1 = factory1.createJersey();
        Jersey jersey2 = factory2.createJersey();
        jersey1.design();
        jersey2.design();

        shop.addObserver(barcelona);
        shop.addObserver(realMadrid);

        shop.setJerseyCost("Barcelona", 50.0);
        shop.setJerseyCost("Real Madrid", 60.0);
    }
}