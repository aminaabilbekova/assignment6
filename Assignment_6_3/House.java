package Assignment_6_3;

public class House {
    private HouseType type;
    private int doors;
    private int windows;
    private RoofType roof;
    private GarageType garage;

    public House(HouseType type, int doors, int windows, RoofType roof, GarageType garage) {
        this.type = type;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public HouseType getType() {
        return this.type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return this.windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public RoofType getRType() {
        return this.roof;
    }

    public void setRType(RoofType rType) {
        this.roof = roof;
    }

    public GarageType getGType() {
        return this.garage;
    }

    public void setGType(GarageType gType) {
        this.garage = gType;
    }
}
