public class Main {
    public static void main(String[] args) {

        ShopAssistant shopAssistant = new ShopAssistant("Ali", 20, 12345);
        System.out.println(shopAssistant);
        BusDriver busDriver = new BusDriver("Jon", 22, 98767);
        Bus bus = new Bus(2345, 2020, "black", 23,shopAssistant,busDriver);
        System.out.println(bus);
        bus.go();
        bus.stop();
        TrolleyBus trolleyBus = new TrolleyBus(2675, 2021, "brown", 12,shopAssistant);
        System.out.println(trolleyBus);
        trolleyBus.go();
        trolleyBus.stop();

        TaxiDriver taxiDriver = new TaxiDriver("Akyl", 25, 23876);
        System.out.println(taxiDriver);
        Car car = new Car(6532, 2019, "white", 54321,taxiDriver,busDriver);
        car.go();
        car.stop();

    }
}