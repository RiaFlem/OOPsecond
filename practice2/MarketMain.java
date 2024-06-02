package practice2;

public class MarketMain {
    public static void main(String[] args) {
        Actor jhon = new Human("Jhon");
        jhon.setTakeOrder(false);
        Actor jake = new Human("Jake");
        jake.setTakeOrder(true);
        Actor lena = new Human("Lena");
        lena.setTakeOrder(true);
        Actor clair = new Human("Clair");
        clair.setTakeOrder(false);

        Human rick = new Human("Rick");
        rick.setMakeOrder(true);
        Human frank = new Human("Frank");
        frank.setMakeOrder(true);

        Market market = new Market();
        market.acceptToMarket(jhon);
        market.acceptToMarket(jake);
        market.acceptToMarket(lena);
        market.acceptToMarket(clair);
        System.out.println();

        market.takeInQueue(rick);
        market.takeInQueue(frank);
        System.out.println();

        market.update();
        System.out.println();

        market.giveOrders(frank);
        System.out.println();

        market.update();
    }
}
