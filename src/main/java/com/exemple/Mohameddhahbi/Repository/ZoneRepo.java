package com.exemple.Mohameddhahbi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.Mohameddhahbi.Entity.Parking;
import com.exemple.Mohameddhahbi.Entity.Zone;

public interface ZoneRepo extends JpaRepository<Zone, Integer> {

}
