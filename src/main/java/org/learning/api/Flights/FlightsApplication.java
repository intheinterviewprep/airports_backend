package org.learning.api.Flights;

import org.learning.api.Flights.Service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class FlightsApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(FlightsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}
}
