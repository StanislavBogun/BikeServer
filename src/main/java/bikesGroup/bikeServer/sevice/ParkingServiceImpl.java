package bikesGroup.bikeServer.sevice;

import bikesGroup.bikeServer.dao.ParkingDAO;
import bikesGroup.bikeServer.dao.ParkingDAOImpl;
import bikesGroup.bikeServer.model.Parking;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("parkingService")
public class ParkingServiceImpl implements ParkingService {
    private ParkingDAO parkingDAO = new ParkingDAOImpl();

    @Override
    @Transactional
    public List<Parking> allParking() {
        return parkingDAO.allParking();
    }

    @Override
    public void add(Parking parking) {
        parkingDAO.add(parking);
    }

    @Override
    public void delete(Parking parking) {
        parkingDAO.delete(parking);
    }

    @Override
    public void edit(Parking parking) {
        parkingDAO.edit(parking);
    }

    @Override
    public Parking getById(int id) {
        return null;
    }
}
