public class TrolleyBus extends Transport {

    private ShopAssistant shopAssistant;

    public TrolleyBus(int ID, int productionYear, String colour, int number, ShopAssistant shopAssistant) {
        super(ID, productionYear, colour, number);
        this.shopAssistant = shopAssistant;
    }

    public ShopAssistant getShopAssistant() {
        return shopAssistant;
    }

    public void setShopAssistant(ShopAssistant shopAssistant) {
        this.shopAssistant = shopAssistant;
    }

    @Override
    public void go() {
        System.out.println("TrolleyBus is going");
    }

    @Override
    public void stop() {
        System.out.println("TrolleyBus stops");
    }

    @Override
    public String toString() {
        return "TrolleyBus{" +
                "ID=" + getID() +
                ", productionYear='" + getProductionYear() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", number=" + getNumber() +
                "shopAssistant=" + shopAssistant +
                '}';
    }
}
