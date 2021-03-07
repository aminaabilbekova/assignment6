package Assignment_6_3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.constructSimpleHouse(builder);
        House house = builder.getResult();
        System.out.println("House built:\n" + house.getType());

        ManualBuilder manualBuilder = new ManualBuilder();


        director.constructSimpleHouse(manualBuilder);
        Manual houseManual1 = manualBuilder.getResult();
        System.out.println("\nHouse manual built:\n" + houseManual1.print());


        HouseBuilder builder2 = new HouseBuilder();
        director.constructRichHouse(builder2);

        House house2 = builder2.getResult();
        System.out.println("\nHouse built:\n" + house2.getType());

        director.constructRichHouse(manualBuilder);
        Manual houseManual2 = manualBuilder.getResult();
        System.out.println("\nHouse manual built:\n" + houseManual2.print());
    }
}
