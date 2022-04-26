package com.example.arists.concert.model;

import com.example.arists.concert.dto.RegionDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public RegionDto convertToDto() {
        return RegionDto.builder()
                .id(this.id)
                .name(this.name).build();
    }
}
