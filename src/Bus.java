import java.sql.SQLOutput;

public class Bus extends Transport{

    private ShopAssistant shopAssistant;
    private BusDriver busDriver;

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public Bus(int ID, int productionYear, String colour, int number, ShopAssistant shopAssistant, BusDriver busDriver) {
        super(ID, productionYear, colour, number);
        this.shopAssistant = shopAssistant;
        this.busDriver = busDriver;

    }

    public ShopAssistant getShopAssistant() {
        return shopAssistant;
    }

    public void setShopAssistant(ShopAssistant shopAssistant) {
        this.shopAssistant = shopAssistant;
    }

    @Override
    public void go() {
        System.out.println("Bus is going");
    }

    @Override
    public void stop() {
        System.out.println("bus stops" );
    }

    @Override
    public String toString() {
        return "Bus{" +
                "ID=" + getID() +
                ", productionYear='" + getProductionYear() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", number=" + getNumber() +
                "shopAssistant=" + shopAssistant +
                ", busDriver=" + busDriver +
                '}';
    }
}
