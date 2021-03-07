package Assignment_6_2;

public class Factory {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        //creating truck transport via transportFactory and giving it transport type;
        Transport transport1 = transportFactory.createTransport("road");
        transport1.deliver();

        Transport transport2 = transportFactory.createTransport("Sea");
        transport2.deliver();

    }
}
