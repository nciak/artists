package com.example.arists.concert.dto;

import com.example.arists.artist.dto.ArtistDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ConcertDto {
    private Long id;
    private ArtistDto artistDto;
    private PlaceDto place;
    private String startDate;
}
