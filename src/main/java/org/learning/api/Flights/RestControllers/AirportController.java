package org.learning.api.Flights.RestControllers;

import org.learning.api.Flights.Entities.Airport;
import org.learning.api.Flights.Service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("airports")
public class AirportController {
    @Autowired
    AirportService service;

    @GetMapping
    public List<Airport> getAllAirports(){
    return service.getAllAirports();
    }
    @PostMapping
    public void createNewAirport(@RequestBody Airport newAirport){
        service.createNewAirport(newAirport);
    }
    @PutMapping
    public void updateAirport(@RequestBody Airport updatedAirport){
        service.updateAirport(updatedAirport);
    }
    @DeleteMapping
    public void deleteAirport(@RequestBody Airport airport){
        service.deleteAirport(airport);
    }
}
