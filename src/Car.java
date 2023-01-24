public class Car extends Transport{
    private TaxiDriver taxiDriver;
    private BusDriver busDriver;

    public TaxiDriver getTaxiDriver() {
        return taxiDriver;
    }

    public void setTaxiDriver(TaxiDriver taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    public Car(int ID, int productionYear, String colour, int number, TaxiDriver taxiDriver,BusDriver busDriver) {
        super(ID, productionYear, colour, number);
        this.taxiDriver = taxiDriver;
        this.busDriver = busDriver;
    }

    @Override
    public void go() {
        System.out.println("Car is going");
    }

    @Override
    public void stop() {
        System.out.println("Car stops" );
    }

    @Override
    public String toString() {
        return "Car{" +
            "ID=" + getID() +
                    ", productionYear='" + getProductionYear() + '\'' +
                    ", colour='" + getColour() + '\'' +
                    ", number=" + getNumber() +
                "taxiDriver=" + taxiDriver +
                ", busDriver=" + busDriver +
                '}';
    }
}
