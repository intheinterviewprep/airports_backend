package org.learning.api.Flights.Service;

import org.learning.api.Flights.Entities.Airport;
import org.learning.api.Flights.Repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class AirportService {
@Autowired
    AirportRepository repository;
    public void createNewAirport(Airport airport){
        repository.createNewAirport(airport);
    }
    public List<Airport> getAllAirports(){
       return repository.getAllAirports();
    }
    public Airport getAirportById(Long id){
        return repository.getAirportById(id);
    }
    public void updateAirport(Airport airport){
        repository.updateAirport(airport);
    }
    public Airport deleteAirport(Airport airport){
        return repository.deleteAirport(airport);
    }
}
