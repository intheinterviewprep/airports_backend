package org.learning.api.Flights.Repository;

import org.hibernate.Transaction;
import org.learning.api.Flights.Entities.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AirportRepository implements AirportRepositoryInterface{
    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public void createNewAirport(Airport airport) {
        entityManager.persist(airport);
    }

    @Override
    public List<Airport> getAllAirports() {
        Query query=entityManager.createQuery("from Airport",Airport.class);
        return query.getResultList();
    }

    @Override
    public Airport getAirportById(Long id) {
        Query query = entityManager.createQuery("from Airport where id="+id);
        return (Airport)query.getSingleResult();

    }

    @Override
    @Transactional
    public void updateAirport(Airport airport) {
        Query query = entityManager.createQuery("from Airport where id="+airport.getId());
        Airport updatedEntry= (Airport)query.getSingleResult();
        updatedEntry.setName(airport.getName());
        updatedEntry.setCity(airport.getCity());
        entityManager.persist(updatedEntry);
    }

    @Override
    @Transactional
    public Airport deleteAirport(Airport airport) {
        entityManager.remove(entityManager.contains(airport)?airport:entityManager.merge(airport));
        return airport;
    }
}
