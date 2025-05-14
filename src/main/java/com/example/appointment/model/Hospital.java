package com.example.appointment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hospitals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"city"}) 
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalId;

    @Column(nullable = false)
    private String hospitalName;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    @JsonIgnore 
    private City city;

    @Override
    public String toString() {
        return hospitalName;
    }
}

