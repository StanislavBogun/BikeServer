package bikesGroup.bikeServer.dao;

import bikesGroup.bikeServer.model.Parking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ParkingDAOImpl implements ParkingDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Parking> allParking() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Parking").list();
    }

    @Override
    public void add(Parking parking) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(parking);
    }

    @Override
    public void delete(Parking parking) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(parking);
    }

    @Override
    public void edit(Parking parking) {
        Session session = sessionFactory.getCurrentSession();
        session.update(parking);
    }

    @Override
    public Parking getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Parking.class, id);
    }
}
