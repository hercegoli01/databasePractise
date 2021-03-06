package hu.java.dummy.repositories;

import hu.java.dummy.entities.Aircraft;

import java.util.Date;
import java.util.List;

public class AircraftRepository extends AbstractRepository {


    public List<Aircraft> selectAll() {
        return getSession().createQuery("from Aircraft").list();
    }

    public void save(Aircraft aircraft) {
        getSession().beginTransaction();
        aircraft.setCreatedDate(new Date());
        aircraft.setLastModifiedDate(new Date());
        getSession().save(aircraft);
        getSession().getTransaction().commit();
    }


    public void update(Aircraft aircraft) {
        getSession().beginTransaction();
        aircraft.setLastModifiedDate(new Date());
        getSession().update(aircraft);
        getSession().getTransaction().commit();
    }

}

