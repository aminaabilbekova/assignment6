package Assignment_6_3;

public class ManualBuilder implements Builder{
    private HouseType type;
    private int doors;
    private int windows;
    private RoofType roof;
    private GarageType garage;

    public ManualBuilder(HouseType type, int doors, int windows, RoofType roof, GarageType garage) {
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

    public ManualBuilder getResult() {
        return new ManualBuilder(type, doors, windows, roof, garage);
    }
}
