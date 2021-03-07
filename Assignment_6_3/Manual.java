package Assignment_6_3;

public class Manual {
    private HouseType type;
    private int doors;
    private int windows;
    private RoofType roof;
    private GarageType garage;

    public Manual(HouseType type, int doors, int windows, RoofType roof, GarageType g) {
        this.type = type;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public String print() {
        String info = "";
        info += "Rooms: " + type + "\n";
        info += "Count of doors: " + doors + "\n";
        info += "Count of windows: " + windows + "\n";
        info += "Roof type: " + roof + "\n";
        if (this.garage != null) {
            info += "Garage type: " + garage + "\n";
        } else {
            info += "No Garage" + "\n";
        }
        return info;
    }
}
