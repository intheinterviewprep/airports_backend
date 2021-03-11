package org.learning.api.Flights.Repository;

import org.learning.api.Flights.Entities.Airport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepositoryInterface {
    public void createNewAirport(Airport airport);
    public List<Airport> getAllAirports();
    public Airport getAirportById(Long id);
    public void updateAirport(Airport airport);
    public Airport deleteAirport(Airport airport);
}
