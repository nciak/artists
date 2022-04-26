package com.example.arists.concert.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PlaceDto {
    private Long id;
    private String buildingName;
    private String city;
    private RegionDto regionDto;
}
