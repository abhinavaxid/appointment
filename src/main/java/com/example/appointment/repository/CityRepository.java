package com.example.appointment.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appointment.model.City;
public interface CityRepository extends JpaRepository<City, Long> {}
