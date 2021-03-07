package Assignment_6_3;

public class HouseBuilder implements Builder{
    private HouseType type;
    private int doors;
    private int windows;
    private RoofType roof;
    private GarageType garage;

    public House getResult() {
        return new House(type, doors, windows, roof, garage);
    }

    @Override
    public void buildWalls(HouseType houseType) {
        this.type = houseType;

    }

    @Override
    public void buildDoors(int doors) {
        this.doors = doors;

    }

    @Override
    public void buildWindows(int windows) {
        this.windows = windows;

    }

    @Override
    public void buildRoof(RoofType roofType) {
        this.roof = roofType;

    }

    @Override
    public void buildGarage(GarageType garageType) {
        this.garage = garageType;

    }
}
