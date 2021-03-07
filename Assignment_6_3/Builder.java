package Assignment_6_3;

public interface Builder {
    void buildWalls(HouseType houseType);

    void buildDoors(int doors);

    void buildWindows(int windows);

    void buildRoof(RoofType roofType);

    void buildGarage(GarageType garageType);
}
