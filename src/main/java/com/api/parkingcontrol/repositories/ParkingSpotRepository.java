package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository                   //Opcional usar a anotation Repository quando extendemos JPARepository, neste caso deixaremos para ser mais didatico
public interface ParkingSpotRepository extends JpaRepository <ParkingSpotModel, UUID> {
}
