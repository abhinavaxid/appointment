package com.example.appointment.model;

import lombok.*;
import jakarta.persistence.*;
@Entity
@Table(name = "cities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    private String cityName;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
}
