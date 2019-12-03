package bikesGroup.bikeServer.dao;

import bikesGroup.bikeServer.model.Parking;

import java.util.List;

public interface ParkingDAO {
    List<Parking> allParking();
    void add(Parking parking);
    void delete(Parking parking);
    void edit(Parking parking);
    Parking getById(int id);
}
