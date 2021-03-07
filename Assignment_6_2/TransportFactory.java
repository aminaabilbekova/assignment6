package Assignment_6_2;

public class TransportFactory {
    public Transport createTransport(String transportType) {
        if (transportType == null) {
            return null;
        }
        //equalsIgnoreCase ignores uppercase or lowercase of input
        if (transportType.equalsIgnoreCase("ROAD")) {
            return new Truck();

        } else if (transportType.equalsIgnoreCase("SEA")) {
            return new Ship();

        }
        return null;
    }
}
