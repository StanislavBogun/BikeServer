package bikesGroup.bikeServer.sevice;

import bikesGroup.bikeServer.model.Parking;

import java.util.List;

public interface ParkingService {
    List<Parking> allParking();
    void add(Parking parking);
    void delete(Parking parking);
    void edit(Parking parking);
    Parking getById(int id);
}
