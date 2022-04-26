package com.example.arists.concert.model;

import com.example.arists.concert.dto.PlaceDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String buildingName;

    @ManyToOne
    private Region region;

    @Column
    private String city;

    public PlaceDto convertToDto() {
        return PlaceDto.builder()
                .id(this.id)
                .buildingName(this.buildingName)
                .regionDto(this.region.convertToDto())
                .city(this.city).build();
    }
}
