package com.example.arists.artist.model;

import com.example.arists.artist.dto.ArtistDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column(columnDefinition="TEXT")
    private String description;

    public ArtistDto convertToDto() {

        return ArtistDto.builder()
                .id(this.id)
                .name(this.name)
                .description(this.description)
                .build();
    }


}
