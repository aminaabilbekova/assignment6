package Assignment_6_3;

public class Director {
    public void constructSimpleHouse(Builder builder) {
        builder.buildWalls(HouseType.ROOMS_2);
        builder.buildWindows(4);
        builder.buildDoors(3);
        builder.buildRoof(RoofType.MEDIUM);
    }

    public void constructRichHouse(Builder builder) {
        builder.buildWalls(HouseType.ROOMS_4);
        builder.buildWindows(7);
        builder.buildDoors(5);
        builder.buildRoof(RoofType.EXPERNSIVE);
        builder.buildGarage(GarageType.LARGE);
    }
}
