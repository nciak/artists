package com.example.arists.artist.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class ArtistDto {

    private Long id;
    private String name;
    private String description;
}
